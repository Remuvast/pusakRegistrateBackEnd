package com.example.restapi.rc;

import com.example.restapi.model.Campo;
import com.example.restapi.dto.DatosRegistroCivilDTO;
import com.example.restapi.usuarios.repository.UsuariosRepository;
import com.example.restapi.util.RegistroCivilFormatter;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ServicioRegistroCivil {

    @Value("${servicio.rc.url}")
    private String wsdlUrl;

    @Value("${servicio.rc.usuario}")
    private String wsdlUsuario;

    @Value("${servicio.rc.clave}")
    private String wsdlClave;

    @Autowired
    private UsuariosRepository usuarioRepository;

    public DatosRegistroCivilDTO consultarFichaGeneral(String cedula) {
        try {
            System.out.println("✅ Iniciando consulta para cédula: " + cedula);

            // Verificar si ya existe en la base de datos
            boolean isDNI = usuarioRepository.existsByNumeroIdentificacion(cedula);
            if (isDNI) {
                throw new ResponseStatusException(
                        HttpStatus.CONFLICT,
                        "El usuario con cédula " + cedula + " ya está registrado en el sistema."
                );
            }

            // Crear el cliente SOAP
            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
            factory.setServiceClass(InteroperadorlImpl.class);
            factory.setAddress(wsdlUrl);
            factory.setUsername(wsdlUsuario);
            factory.setPassword(wsdlClave);

            InteroperadorlImpl port = (InteroperadorlImpl) factory.create();

            GetFichaGeneral parametros = new GetFichaGeneral();
            parametros.setNumeroIdentificacion(cedula);
            parametros.setCodigoPaquete("471");


            GetFichaGeneralResponse response = port.getFichaGeneral(parametros);
            List<Campo> campos = RegistroCivilFormatter.extraerCampos(response.getReturn());
            return mapearCamposPrincipales(campos);

        } catch (ResponseStatusException e) {
            throw e; // re-lanza el 409 u otros personalizados
        } catch (Exception e) {
            System.out.println("⛔ Se produjo una excepción: ");
            e.printStackTrace(); // Esto debe imprimir TODO el stacktrace
            System.out.println("📛 Mensaje de la excepción: " + e.getMessage());

            throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Usuario ya registrado dentro del sistema: " + e.getMessage()
            );
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
                    dto.setNombresApellidos(valor);
                    String[] partes = valor.trim().split("\\s+");
                    StringBuilder nombres = new StringBuilder();
                    StringBuilder apellidos = new StringBuilder();
                    String[] palabrasCompuestas = {"DE", "DEL", "LA", "LOS", "SAN", "SANTA", "DA"};
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

        String apellidosCompletos = String.join(" ",
                dto.getApellidoPaterno() != null ? dto.getApellidoPaterno() : "",
                dto.getApellidoMaterno() != null ? dto.getApellidoMaterno() : ""
        ).trim();
        dto.setApellidosCompletos(apellidosCompletos);

        return dto;
    }
}
