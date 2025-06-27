package com.example.restapi.msp;

import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

public class HeaderHandlerResolver implements HandlerResolver{

	DatosHeader headerData= new DatosHeader();

	public HeaderHandlerResolver(DatosHeader HeaderList){
	    headerData.setDigest(HeaderList.getDigest());
	    headerData.setNonce(HeaderList.getNonce());
	    headerData.setFecha(HeaderList.getFecha());
	    headerData.setFechaf(HeaderList.getFechaf());
	    headerData.setUsuario(HeaderList.getUsuario());
	}

	@SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo portInfo) {
	      List<Handler> handlerChain = new ArrayList<Handler>();

	      HeaderHandler hh = new HeaderHandler(headerData);

	      handlerChain.add(hh);

	      return handlerChain;
	   }

}
