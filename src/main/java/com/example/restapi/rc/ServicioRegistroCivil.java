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
        dto.setDatosGlobales(campos); // guarda todos los datos crudos

        for (Campo campo : campos) {
            String valor = campo.getValor();

            switch (campo.getNombre()) {
                case "cedula":
                    dto.setCedula(valor);
                    break;

                case "nombre":
                    dto.setNombresApellidos(valor); // guarda todo el valor crudo

                    String[] partes = valor.trim().split("\\s+");
                    int len = partes.length;

                    boolean nombreBloqueado = true;

                    if (len >= 4) {
                        // Asignar nombre y apellidos usando lógica heurística
                        dto.setNombre(String.join(" ", Arrays.copyOfRange(partes, len - 2, len)));
                        dto.setApellidoMaterno(partes[len - 3]);
                        dto.setApellidoPaterno(String.join(" ", Arrays.copyOfRange(partes, 0, len - 3)));

                        int nombresCount = 2;
                        int apellidosCount = len - 2;

                        if (nombresCount > 2 || apellidosCount > 2) {
                            nombreBloqueado = false;
                        }
                    } else if (len == 3) {
                        dto.setApellidoPaterno(partes[0]);
                        dto.setApellidoMaterno(partes[1]);
                        dto.setNombre(partes[2]);
                        nombreBloqueado = true;
                    } else if (len == 2) {
                        dto.setApellidoPaterno(partes[0]);
                        dto.setNombre(partes[1]);
                        nombreBloqueado = true;
                    } else {
                        dto.setNombre(valor);
                        nombreBloqueado = false;
                    }

                    dto.setNombreBloqueado(nombreBloqueado);
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
