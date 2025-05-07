package com.example.restapi.rc;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServicioRegistroCivil {

    @Value("${servicio.rc.url}")
    private String wsdlUrl;

    @Value("${servicio.rc.usuario}")
    private String wsdlUsuario;

    @Value("${servicio.rc.clave}")
    private String wsdlClave;

    public GetFichaGeneralResponse consultarFichaGeneral(String cedula) {
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
            parametros.setCodigoPaquete("471"); // El código de paquete específico

            // Realizar la llamada al servicio
            GetFichaGeneralResponse response = port.getFichaGeneral(parametros);

            return response;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
