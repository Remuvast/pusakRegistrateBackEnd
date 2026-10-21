package com.example.restapi.service;

import com.example.restapi.dto.DiscapacidadDTO;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

@Service
public class ServicioMspDiscapacidad {

    @Value("${dinardap.discapacidad.endpoint}")
    private String endpoint;

    public DiscapacidadDTO consultar(String cedula) {

        DiscapacidadDTO resultado = new DiscapacidadDTO();

        // 1. Validar que la cédula tenga 10 dígitos.
        if (cedula == null || !cedula.matches("\\d{10}")) {
            resultado.setWsDisponible(false);
            return resultado;
        }

        HttpURLConnection conexion = null;

        try {

            // 2. Construir la solicitud SOAP para DINARDAP.
            String soapRequest =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<soap:Envelope "
                + "xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soap:Header/>"
                + "<soap:Body>"
                + "<ns2:datosTemporalesDiscapacidad "
                + "xmlns:ns2=\"http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/\">"
                + "<cedula>" + cedula + "</cedula>"
                + "</ns2:datosTemporalesDiscapacidad>"
                + "</soap:Body>"
                + "</soap:Envelope>";

            // 3. Conectarse al servidor institucional.
            URL url = new URL(endpoint);

            conexion = (HttpURLConnection) url.openConnection();

            conexion.setRequestMethod("POST");
            conexion.setConnectTimeout(10000);
            conexion.setReadTimeout(15000);
            conexion.setDoOutput(true);

            conexion.setRequestProperty(
                "Content-Type",
                "text/xml; charset=UTF-8"
            );

            conexion.setRequestProperty("Accept", "text/xml");
            conexion.setRequestProperty("SOAPAction", "\"\"");

            // 4. Enviar la solicitud SOAP.
            byte[] requestBytes =
                soapRequest.getBytes(StandardCharsets.UTF_8);

            conexion.setFixedLengthStreamingMode(requestBytes.length);

            try (OutputStream salida = conexion.getOutputStream()) {
                salida.write(requestBytes);
                salida.flush();
            }

            // 5. Verificar el código de respuesta HTTP.
            int codigoRespuesta = conexion.getResponseCode();

            if (codigoRespuesta < 200 || codigoRespuesta >= 300) {
                throw new IllegalStateException(
                    "El servidor institucional respondió HTTP "
                    + codigoRespuesta
                );
            }

            // 6. Leer y analizar la respuesta SOAP.
            Document documento;

            try (InputStream entrada = conexion.getInputStream()) {

                DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();

                factory.setNamespaceAware(true);

                // Protección frente a entidades XML externas.
                factory.setFeature(
                    "http://apache.org/xml/features/disallow-doctype-decl",
                    true
                );

                factory.setFeature(
                    "http://xml.org/sax/features/external-general-entities",
                    false
                );

                factory.setFeature(
                    "http://xml.org/sax/features/external-parameter-entities",
                    false
                );

                factory.setXIncludeAware(false);
                factory.setExpandEntityReferences(false);

                factory.setAttribute(
                    XMLConstants.ACCESS_EXTERNAL_DTD,
                    ""
                );

                factory.setAttribute(
                    XMLConstants.ACCESS_EXTERNAL_SCHEMA,
                    ""
                );

                DocumentBuilder builder = factory.newDocumentBuilder();

                documento = builder.parse(
                    new InputSource(
                        new StringReader(leerContenido(entrada))
                    )
                );
            }

            // 7. Detectar errores SOAP.
            NodeList erroresSoap =
                documento.getElementsByTagNameNS("*", "Fault");

            if (erroresSoap.getLength() > 0) {
                throw new IllegalStateException(
                    "El servidor institucional devolvió un SOAP Fault."
                );
            }

            // 8. Comprobar que exista la respuesta esperada.
            NodeList respuestas =
                documento.getElementsByTagNameNS(
                    "*",
                    "datosTemporalesDiscapacidadResponse"
                );

            if (respuestas.getLength() == 0) {
                throw new IllegalStateException(
                    "La respuesta no contiene datosTemporalesDiscapacidadResponse."
                );
            }

            // 9. Leer el mensaje de la respuesta institucional.
            String mensajeError =
                obtenerValor(documento, "mensajeError");

            // Se recibió una respuesta SOAP válida.
            resultado.setWsDisponible(true);

            // 10. Mapear los datos de DINARDAP al DTO actual.
            if (mensajeError != null
                    && !"OK".equalsIgnoreCase(mensajeError.trim())) {

                resultado.setValor(null);
                resultado.setTipo(null);
                resultado.setPorcentaje(null);

            } else {

                resultado.setTipo(
                    obtenerValor(
                        documento,
                        "tipoDiscapacidadPredomina"
                    )
                );

                resultado.setPorcentaje(
                    obtenerValor(
                        documento,
                        "porcentajeDiscapacidad"
                    )
                );

                /*
                 * BSG utilizaba codigoConadis.
                 * El servicio institucional no devuelve ese campo.
                 * No asignamos un valor ficticio.
                 */
                resultado.setValor(null);
            }

        } catch (Exception e) {

            resultado.setWsDisponible(false);
            resultado.setValor(null);
            resultado.setTipo(null);
            resultado.setPorcentaje(null);

            System.err.println(
                "Error al consultar discapacidad en el servidor institucional: "
                + e.getMessage()
            );

        } finally {

            if (conexion != null) {
                conexion.disconnect();
            }
        }

        return resultado;
    }

    /**
     * Obtiene el contenido de un campo XML.
     */
    private String obtenerValor(
            Document documento,
            String nombreCampo) {

        NodeList nodos =
            documento.getElementsByTagNameNS("*", nombreCampo);

        if (nodos.getLength() == 0) {
            return null;
        }

        Node nodo = nodos.item(0);

        if (nodo == null || nodo.getTextContent() == null) {
            return null;
        }

        String valor = nodo.getTextContent().trim();

        return valor.isEmpty() ? null : valor;
    }

    /**
     * Lee la respuesta del servidor y la convierte a texto UTF-8.
     */
    private String leerContenido(InputStream entrada) throws Exception {

        byte[] buffer = new byte[4096];

        ByteArrayOutputStream salida = new ByteArrayOutputStream();

        int cantidad;

        while ((cantidad = entrada.read(buffer)) != -1) {
            salida.write(buffer, 0, cantidad);
        }

        return new String(
            salida.toByteArray(),
            StandardCharsets.UTF_8
        );
    }
}