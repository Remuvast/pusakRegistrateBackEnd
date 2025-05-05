/*

*
* Copyright (C) 2013 Libreria para Cliente Consulta Títulos development team.
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
*
******************************************************
*  SUBSECRETARIA DE TECNOLOGIAS DE LA INFORMACION
*   DIRECCION DE INTEROPERABILIDAD GUBERNAMENTAL
*
* FECHA CREACION : 02 -02-2013
* AUTHOR: DIG DIRECCION DE INTEROPERABILIDAD GUBERNAMENTAL
* PROGRAMADOR:LUIGGI ANDRADE
* CONCEPTO   :  Consulta De Titulos de Ciudadanos
* Utilización del servicio web de la senascyt
*
*
* MODIFICACION (Fecha, Autor y la descripción de la modificación)
*
*
*******************************************************

 */
package com.example.restapi.bsg.rc.autenticacion;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author landrade
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

    DatosHeader DHLista= new DatosHeader();

    public HeaderHandler(DatosHeader DHeader){

        DHLista.setDigest(DHeader.getDigest());
        DHLista.setNonce(DHeader.getNonce());
        DHLista.setFecha(DHeader.getFecha());
        DHLista.setFechaf(DHeader.getFechaf());
        DHLista.setUsuario(DHeader.getUsuario());

    }


    public boolean handleMessage(SOAPMessageContext smc) {

        Boolean outboundProperty = (Boolean) smc.get("javax.xml.ws.handler.message.outbound");//MessageContext.MESSAGE_OUTBOUND_PROPERTY);



        if (outboundProperty.booleanValue()) {
            try {
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();//.addHeader();
                SOAPElement security =
                        header.addChildElement("Security", "wss", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
                SOAPElement timeStamp = security
				.addChildElement(
						"Timestamp",
						"wsu",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
                SOAPElement createdTime =
                        timeStamp.addChildElement("Created", "wsu");
                createdTime.addTextNode(DHLista.getFecha());
                SOAPElement expires =
                        timeStamp.addChildElement("Expires", "wsu");
                expires.addTextNode(DHLista.getFechaf());
                SOAPElement usernameToken =
                        security.addChildElement("UsernameToken","wss");
                SOAPElement username =
                        usernameToken.addChildElement("Username", "wss");
                username.addTextNode(DHLista.getUsuario());
                SOAPElement password =
                        usernameToken.addChildElement("Password", "wss");
                password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
                password.addTextNode(DHLista.getDigest());
                SOAPElement nonce =
                        usernameToken.addChildElement("Nonce", "wss");
                nonce.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
                nonce.addTextNode(DHLista.getNonce());
                SOAPElement created = usernameToken.addChildElement("Created", "wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
                created.addTextNode(DHLista.getFecha());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return outboundProperty;
    }

    public boolean handleFault(SOAPMessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return false;
    }

    public void close(MessageContext context) {
    //throw new UnsupportedOperationException("Not supported yet.");
    }


	@Override
	public Set<QName> getHeaders() {
		return null;
	}
}
