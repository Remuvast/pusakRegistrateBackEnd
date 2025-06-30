package com.example.restapi.service;

import com.example.restapi.dto.DiscapacidadDTO;
import com.example.restapi.msp.DatosHeader;
import com.example.restapi.wsdl.generated.ParametrosAcceso;
import com.example.restapi.wsdl.generated.ResultadoDiscapacitado;
import com.example.restapi.wsdl.generated.WebServiceSnapDiscapacidades;
import com.example.restapi.wsdl.generated.WebServiceSnapDiscapacidadesDefinitions;

import javax.xml.ws.BindingProvider;
import com.example.restapi.msp.PermissionClient; // Ensure this is the correct package for PermissionClient
import org.springframework.stereotype.Service;

@Service
public class ServicioMspDiscapacidad {

    public DiscapacidadDTO consultar(String cedula) {
        DiscapacidadDTO resultado = new DiscapacidadDTO();

        try {
            // Paso 1: Obtener token
            PermissionClient permissionClient = new PermissionClient();
            DatosHeader headers = permissionClient.GeneraToken();

            // Paso 2: Instanciar servicio
            WebServiceSnapDiscapacidadesDefinitions service = new WebServiceSnapDiscapacidadesDefinitions();
            service.setHandlerResolver(new com.example.restapi.msp.HeaderHandlerResolver(headers));
            WebServiceSnapDiscapacidades port = service.getWebServiceSnapDiscapacidadesPort();

            // Paso 3: Armar la petición
            ParametrosAcceso datosAcceso = new ParametrosAcceso();
            datosAcceso.setUsuario("WS-SNAP");
            datosAcceso.setClave("StiDig02");
            datosAcceso.setIdentificacion(cedula);

            // Paso 4: Configurar timeout
            BindingProvider bp = (BindingProvider) port;
            bp.getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", 10000);
            bp.getRequestContext().put("com.sun.xml.internal.ws.request.timeout", 10000);

            // Paso 5: Llamar al servicio
            ResultadoDiscapacitado respuesta = port.buscarPersonaConDiscapacidad(datosAcceso);

            if (respuesta != null) {
                resultado.setWsDisponible(true);

                if (respuesta.getCodigoConadis() != null) {
                    resultado.setValor(respuesta.getCodigoConadis());
                    resultado.setTipo(respuesta.getDeficienciaPredomina());
                    resultado.setPorcentaje(
                            respuesta.getPorcentajeDiscapacidad()
                                    .replace("Í", "I")
                                    .replace("Ó", "O"));
                } else {
                    resultado.setValor(null);
                    resultado.setTipo(null);
                    resultado.setPorcentaje(null);
                }
            } else {
                resultado.setWsDisponible(false);
            }

        } catch (Exception e) {
            resultado.setWsDisponible(false);
            e.printStackTrace();
        }

        return resultado;
    }
}
