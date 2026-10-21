package com.example.restapi.msp;

import com.example.restapi.msp.autenticacion.AccesoBSGService;
import com.example.restapi.msp.autenticacion.BSG04AccederBSG;
import com.example.restapi.msp.autenticacion.ValidarPermisoPeticion;
import com.example.restapi.msp.autenticacion.ValidarPermisoRespuesta;

public class PermissionClient {

    public DatosHeader GeneraToken() {
        try {
            System.out.println("🔐 Iniciando generación de token...");

            AccesoBSGService service = new AccesoBSGService();
            BSG04AccederBSG port = service.getBSG04AccederBSGPort();

            ValidarPermisoPeticion peticion = new ValidarPermisoPeticion();
            peticion.setCedula("1001633807");
            peticion.setUrlsw("https://www.bsg.gob.ec/sw/MSP/BSGSW01_Consultar_Discapacidad?wsdl");

            ValidarPermisoRespuesta result = port.validarPermiso(peticion);

            System.out.println("🧾 Respuesta de ValidarPermiso:");
            System.out.println("  CodError: " + result.getMensaje().getCodError());
            System.out.println("  DesError: " + result.getMensaje().getDesError());
            System.out.println("  TienePermiso: " + result.getTienePermiso());
            System.out.println("  Digest: " + result.getDigest());
            System.out.println("  Nonce: " + result.getNonce());
            System.out.println("  Fecha: " + result.getFecha());
            System.out.println("  FechaF: " + result.getFechaF());

            DatosHeader headers = new DatosHeader();

            if (!"000".equals(result.getMensaje().getCodError())) {
                System.out.println("❌ Error: token no válido, se devuelve token con mensaje de error");
                headers.setNonce(result.getMensaje().getDesError());
                headers.setDigest(result.getMensaje().getDesError());
                headers.setFecha(result.getMensaje().getDesError());
                headers.setFechaf(result.getMensaje().getDesError());
            } else {
                System.out.println("✅ Token generado correctamente");
                headers.setNonce(result.getNonce());
                headers.setDigest(result.getDigest());
                headers.setFecha(result.getFecha());
                headers.setFechaf(result.getFechaF());
                headers.setUsuario("1001633807");
            }

            return headers;

        } catch (Exception ex) {
            System.out.println("❗️Mensaje PermissionClient metodo DatosHeader, ERROR al generar el token del MSP");
            ex.printStackTrace(); // <--- para ver la causa
            return null;
        }
    }
}
