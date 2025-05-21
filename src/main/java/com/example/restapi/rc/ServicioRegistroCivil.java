package com.example.restapi.rc;

import com.example.restapi.model.Campo;
import com.example.restapi.dto.DatosRegistroCivilDTO;
import com.example.restapi.usuarios.repository.UsuariosRepository;
import com.example.restapi.util.Constantes;
import com.example.restapi.util.RegistroCivilFormatter;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

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

    private static final Map<String, String> REGLAS_CONDICION = new HashMap<>();
    static {
        REGLAS_CONDICION.put("FALLECIDO", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_FALLECIDO);
        REGLAS_CONDICION.put("EXTRANJERO FALLECIDO", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_EXTRANJERO_FALLECIDO);
        REGLAS_CONDICION.put("CÉDULA CADUCADA POR ANULACIÓN", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_CADUCADO_X_ANULACION);
        REGLAS_CONDICION.put("CEDULA CADUCADA POR ANULACION", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_CADUCADO_X_ANULACION);
        REGLAS_CONDICION.put("EXTRANJERO NO CEDULADO", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_EXTRANJERO_NO_CEDULADO);
        REGLAS_CONDICION.put("CÉDULA INVALIDADA POR CONTRAVENCIÓN", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_CONTRAVENCION);
        REGLAS_CONDICION.put("CEDULA INVALIDADA POR CONTRAVENCION", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_CONTRAVENCION);
        REGLAS_CONDICION.put("EXTRANJERO INVALIDADO POR CONTRAVENCIÓN", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_EXTRANJERO_CONTRAVENCION);
        REGLAS_CONDICION.put("EXTRANJERO INVALIDADO POR CONTRAVENCION", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_EXTRANJERO_CONTRAVENCION);
        REGLAS_CONDICION.put("EXTRANJERO INVALIDADO POR EXPIRACIÓN", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_EXTRANJERO_EXPIRACION);
        REGLAS_CONDICION.put("EXTRANJERO INVALIDADO POR EXPIRACION", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_EXTRANJERO_EXPIRACION);
        REGLAS_CONDICION.put("INSCRIPCIÓN EN PROCESO", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_INSCRIPCION_PROCESO);
        REGLAS_CONDICION.put("INSCRIPCION EN PROCESO", Constantes.ConsumoWebServices.Inscripcion.MENSAJE_INSCRIPCION_PROCESO);
    }

    public DatosRegistroCivilDTO consultarFichaGeneral(String cedula) {
        if (usuarioRepository.existsByNumeroIdentificacion(cedula)) {
            throw new ResponseStatusException(
                HttpStatus.CONFLICT,
                "El usuario con cédula " + cedula + " ya está registrado en el sistema."
            );
        }

        try {
            System.out.println("✅ Iniciando consulta para cédula: " + cedula);

            // 2) Configura y llama al cliente SOAP
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

            // 3) Extrae los campos y valida condición
            List<Campo> campos = RegistroCivilFormatter.extraerCampos(response.getReturn());
            validarCondicion(campos);

            // 4) Mapea al DTO y retorna
            return mapearCamposPrincipales(campos);

        } catch (ResponseStatusException ex) {
            // 409 Conflict personalizado
            throw ex;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Ocurrió un error al consultar la cédula: " + ex.getMessage(),
                ex
            );
        }
    }

    /**
     * Busca en los campos la propiedad "condicionCiudadano" y si su valor
     * coincide con alguna regla, lanza un 409 con el mensaje correspondiente.
     */

    private void validarCondicion(List<Campo> campos) {
        String condicion = campos.stream()
            .filter(c -> "condicionCiudadano".equalsIgnoreCase(c.getNombre()))
            .map(Campo::getValor)
            .findFirst()
            .orElse(null);

        if (condicion != null) {
            String mensaje = REGLAS_CONDICION.get(condicion.toUpperCase());
            if (mensaje != null) {
                throw new ResponseStatusException(HttpStatus.CONFLICT, mensaje);
            }
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
