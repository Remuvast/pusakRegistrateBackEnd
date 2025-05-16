package com.example.restapi.rc;

import com.example.restapi.model.Campo;
import com.example.restapi.dto.DatosRegistroCivilDTO;
import com.example.restapi.util.RegistroCivilFormatter;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.Arrays;

import java.util.List;

@Service
public class ServicioRegistroCivil {

    @Value("${servicio.rc.url}")
    private String wsdlUrl;

    @Value("${servicio.rc.usuario}")
    private String wsdlUsuario;

    @Value("${servicio.rc.clave}")
    private String wsdlClave;

    public DatosRegistroCivilDTO consultarFichaGeneral(String cedula) {
        try {
            // Crear el cliente SOAP
            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
            factory.setServiceClass(InteroperadorlImpl.class);
            factory.setAddress(wsdlUrl);
            factory.setUsername(wsdlUsuario);
            factory.setPassword(wsdlClave);

            // Crear el puerto del servicio
            InteroperadorlImpl port = (InteroperadorlImpl) factory.create();

            // Configurar la solicitud
            GetFichaGeneral parametros = new GetFichaGeneral();
            parametros.setNumeroIdentificacion(cedula);
            parametros.setCodigoPaquete("471");

            // Realizar la llamada al servicio
            GetFichaGeneralResponse response = port.getFichaGeneral(parametros);

            // Formatear la respuesta: lista de campos planos
            List<Campo> campos = RegistroCivilFormatter.extraerCampos(response.getReturn());

            // Mapear campos al DTO limpio
            return mapearCamposPrincipales(campos);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error consultando al Registro Civil", e);
        }
    }

    private DatosRegistroCivilDTO mapearCamposPrincipales(List<Campo> campos) {
        DatosRegistroCivilDTO dto = new DatosRegistroCivilDTO();

        for (Campo campo : campos) {
            String valor = campo.getValor();

            switch (campo.getNombre()) {
                case "cedula":
                    dto.setCedula(valor);
                    break;

                case "nombre":
                    dto.setNombresApellidos(valor); // guarda todo el valor crudo

                    String[] partes = valor.trim().split("\\s+");
                    StringBuilder nombres = new StringBuilder();
                    StringBuilder apellidos = new StringBuilder();
                    String[] palabrasCompuestas = { "DE", "DEL", "LA", "LOS", "SAN", "SANTA", "DA" };
                    int numeroDeApellidos = 1;
                    String palabraCompuesta = "";
                    boolean terminarConcatenacion;

                    for (int j = 0; j < partes.length; j++) {
                        String parteActual = partes[j];
                        terminarConcatenacion = true;

                        for (String pc : palabrasCompuestas) {
                            if (pc.equalsIgnoreCase(parteActual)) {
                                palabraCompuesta += parteActual + " ";
                                terminarConcatenacion = false;
                                break;
                            }
                        }

                        if (numeroDeApellidos > 2) {
                            nombres.append(parteActual).append(" ");
                        } else if (terminarConcatenacion) {
                            if (!palabraCompuesta.isEmpty()) {
                                apellidos.append(palabraCompuesta).append(parteActual).append(" ");
                                palabraCompuesta = "";
                            } else {
                                apellidos.append(parteActual).append(" ");
                            }
                            numeroDeApellidos++;
                        }
                    }

                    String[] apellidosSeparados = apellidos.toString().trim().split(" ", 2);
                    dto.setApellidoPaterno(apellidosSeparados.length > 0 ? apellidosSeparados[0] : "");
                    dto.setApellidoMaterno(apellidosSeparados.length > 1 ? apellidosSeparados[1] : "");
                    dto.setNombre(nombres.toString().replaceAll("\\s{2,}", " ").trim());

                    // Bloquea solo si el nombre completo tiene exactamente 4 partes (caso típico)
                    dto.setNombreBloqueado(partes.length == 4);
                    break;

                case "fechaNacimiento":
                    dto.setFechaNacimiento(valor);
                    break;

                case "sexo":
                    dto.setSexo(valor);
                    break;

                case "estadoCivil":
                    dto.setEstadoCivil(valor);
                    break;
            }
        }

        // Apellidos completos (sin nombres)
        String apellidosCompletos = String.join(" ",
            dto.getApellidoPaterno() != null ? dto.getApellidoPaterno() : "",
            dto.getApellidoMaterno() != null ? dto.getApellidoMaterno() : ""
        ).trim();
        dto.setApellidosCompletos(apellidosCompletos);

        return dto;
    }
}
