package com.example.restapi.rc;

import com.example.restapi.model.Campo;
import com.example.restapi.dto.DatosRegistroCivilDTO;
import com.example.restapi.util.RegistroCivilFormatter;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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
                    String[] partes = valor.trim().split(" ");
                    if (partes.length >= 3) {
                        dto.setApellidoPaterno(partes[0]);
                        dto.setApellidoMaterno(partes[1]);
                        dto.setNombre(String.join(" ", java.util.Arrays.copyOfRange(partes, 2, partes.length)));
                    } else {
                        dto.setNombre(valor);
                    }
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

        return dto;
    }
}
