package com.example.restapi.rc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.net.ssl.HostnameVerifier;
import jakarta.net.ssl.HttpsURLConnection;
import jakarta.net.ssl.SSLContext;
import jakarta.net.ssl.SSLSession;
import jakarta.net.ssl.TrustManager;
import jakarta.net.ssl.X509TrustManager;

/*import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
*/
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.stereotype.Service;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.example.restapi.util.Constantes;
import com.example.restapi.bsg.rc.Ciudadano;
import com.example.restapi.bsg.rc.ConsultaCiudadano;
import com.example.restapi.bsg.rc.ConsultaCiudadano_Service;
import com.example.restapi.bsg.rc.autenticacion.AccesoBSGService;
import com.example.restapi.bsg.rc.autenticacion.BSG04AccederBSG;
import com.example.restapi.bsg.rc.autenticacion.DatosHeader;
import com.example.restapi.bsg.rc.autenticacion.HeaderHandlerResolver;
import com.example.restapi.bsg.rc.autenticacion.ValidarPermisoPeticion;
import com.example.restapi.bsg.rc.autenticacion.ValidarPermisoRespuesta;

/**
 * Clase que consume los datos del web service de registro seguro
 *
 * @author JUAN DANIEL
 */
@WebService(endpointInterface = "com.example.restapi.rc.InteroperadorlImpl", serviceName = "InteroperadorService", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/")
@Service

@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class ServicioRegistroCivil implements com.example.restapi.rc.InteroperadorlImpl {

	public void WsClient() {
	}

	public GetFichaGeneralResponse getFichaGeneral(
			@WebParam(partName = "parameters", name = "getFichaGeneral", targetNamespace = "http://servicio.interoperadorws.interoperacion.dinardap.gob.ec/") GetFichaGeneral parameters) {

		GetFichaGeneralResponse respuesta = new GetFichaGeneralResponse();
		return respuesta;

	}

	public Persona datosTemporalesAspirante(String cedula, Integer bsg, Integer dinardap, Integer datoSeguro, Long timeoutWS) throws Exception {
		Persona persona = null;
		Ciudadano c = null;
		if(bsg.equals(1)){
			c = consultarPorCedula(cedula, timeoutWS);
		}
		if(c==null){
			if(dinardap.equals(1))
				persona = datosTemporalesWSDL(cedula, timeoutWS);
			if ((persona == null || persona.getMensajeError().equals("ERROR_WS"))&&datoSeguro.equals(1)) {
				persona = datosTemporalesJSON(cedula);
				return persona;
			} else {
				return persona;
			}
		}else{
			persona = new Persona();
			persona.setCondicionCiudadano(c.getCondicionCedulado());
			persona.setDatEstadoCivil(c.getEstadoCivil());
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			if(c.getFechaNacimiento()!=null)
				persona.setDatFechaNacimiento(dateFormat.parse(c.getFechaNacimiento()));
			persona.setDatGenero(c.getSexo());
			persona.setDatIdentificacion(c.getNUI());
			persona.setDatNacionalidad(c.getNacionalidad());
			persona.setDomicilio(c.getDomicilio());
			persona.setLugarNacimiento(c.getLugarNacimiento());
			persona.setMensajeError(c.getCodigoError());
			persona.setNombre(c.getNombre());
			persona.setSexo(c.getSexo());
			return persona;
		}
	}

	// Llamada a servicio Web en WSDL nueva referencia
	public Persona datosTemporalesWSDL(String cedula, Long timeoutWS) {

		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		Persona personaError = new Persona();
		try {
			disableSslVerification();
			GetFichaGeneral parametros = new GetFichaGeneral();
			parametros.setNumeroIdentificacion(cedula);
			parametros.setCodigoPaquete(Constantes.ConsumoWebServices.RC_DINARP_PAQUETE);

			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.setServiceClass(InteroperadorlImpl.class);
			factory.setAddress("https://interoperabilidad.dinardap.gob.ec/interoperador?wsdl");
			factory.setUsername(Constantes.ConsumoWebServices.RC_DINARP_USER);
			factory.setPassword(Constantes.ConsumoWebServices.RC_DINARP_PASSWORD);

			InteroperadorlImpl port = (InteroperadorlImpl) factory.create();
			Client client = ClientProxy.getClient(port);

			if (client != null) {
				HTTPConduit conduit = (HTTPConduit) client.getConduit();
				HTTPClientPolicy policy = new HTTPClientPolicy();
				policy.setAllowChunking(false);
				policy.setConnectionTimeout(timeoutWS);
				policy.setReceiveTimeout(timeoutWS);
				conduit.setClient(policy);

			}

			GetFichaGeneralResponse response = port.getFichaGeneral(parametros);

			List<Institucion> instituciones = new ArrayList<Institucion>();
			instituciones = response.getReturn().getInstituciones();
			Persona persona = new Persona();
			for (Institucion inst : instituciones) {

				/**
				 * Obteniendo datos principales
				 */
				List<Registro> registros = new ArrayList<>();
				registros = inst.getDatosPrincipales().getRegistros();
				for (Registro reg : registros) {
					if (reg.getCampo().equals("cedula")) {
						persona.setDatIdentificacion(reg.getValor());
					}
					if (reg.getCampo().equals("nombre")) {
						persona.setNombre(reg.getValor().toString().replaceAll("\"", "").toString()
								.replaceAll("Ã'", "Ñ").replaceAll("Ã‘", "Ñ"));
					}
					if (reg.getCampo().equals("condicionCiudadano")) {
						persona.setCondicionCiudadano(reg.getValor());
					}
					if (reg.getCampo().equals("fechaNacimiento")) {
						Date fechaNac = null;
						try {
							fechaNac = formatoDelTexto.parse(reg.getValor().toString().replaceAll("\"", ""));
							persona.setDatFechaNacimiento(fechaNac);
						} catch (ParseException ex) {
							Logger.getLogger(ServicioRegistroCivil.class.getName()).log(Level.SEVERE, null, ex);
						}
					}

					if (reg.getCampo().equals("lugarNacimiento")) {
						persona.setLugarNacimiento(reg.getValor());
					}
					if (reg.getCampo().equals("sexo")) {
						persona.setSexo(reg.getValor());
					}
					if (reg.getCampo().equals("estadoCivil")) {
						persona.setDatEstadoCivil(reg.getValor());
					}
					if (reg.getCampo().equals("nacionalidad")) {
						persona.setDatNacionalidad(reg.getValor());
					}
					if (reg.getCampo().equals("conyuge")) {
						persona.setConyuge(reg.getValor());
					}
					if (reg.getCampo().equals("nombrePadre")) {
						persona.setNombrePadre(reg.getValor());
					}
					if (reg.getCampo().equals("nombreMadre")) {
						persona.setNombreMadre(reg.getValor());
					}
					if (reg.getCampo().equals("domicilio")) {
						persona.setDomicilio(reg.getValor());
					}
					if (reg.getCampo().equals("fechaExpiracion")) {
						Date date1;
		            	if (reg.getValor().length()==0)
		            		date1 =new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1900");
		            	else
		            		date1 =new SimpleDateFormat("dd/MM/yyyy").parse(reg.getValor());
		            	persona.setDatFechaExpira(date1);
					}
				}
				if (persona.getCondicionCiudadano().indexOf("CADUCADA") != -1) {
					persona.setMensajeError(persona.getCondicionCiudadano());
				} else if(persona.getDatIdentificacion()==null){
					persona.setMensajeError("ERROR_WS");
				}
				else {
					persona.setMensajeError("OK");
				}

			}

			return persona;

		} catch (Exception ex) {
			personaError.setMensajeError("ERROR_WS");
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
			// System.out.println("ERROR CLIENTE: " + ex.getMessage());
			return personaError;
		}

	}

	// Llamada a servicio Web en json antigua referencia

	public Persona datosTemporalesJSON(String cedula) throws Exception {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		// Crea un trust manager que no valida los certificados del sitio, es
		// porque
		// el JVM no tiene el certificado como confiable
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType) {
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType) {
			}
		} };

		// Instala el trust manager para esta sessiï¿½n
		try {
			SSLContext sc = SSLContext.getInstance("TLS");
			sc.init(null, trustAllCerts, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		// Genera la autenticaciï¿½n BASIC que utiliza el sitio
		Authenticator.setDefault(new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("1714364906", "Dato@2022-".toCharArray()); //return new PasswordAuthentication("SENESCYT", "Dat0s0106".toCharArray());
			}
		});

		// Realiza la llamada al URL
		// URL url = new
		// URL("https://www.datoseguro.gob.ec/ws/rest/relacionconfianza/publico/ValidacionDatosRegistroCivil/"+cedula+"/vigencia");
		// URL url = new
		// URL("https://www.datoseguro.gob.ec/ws/rest/relacionconfianza/publico/Validacion%20Datos%20Registro%20Civil%202014%20v2/"+cedula+"/vigencia");
		// URL url = new
		// URL("https://www.datoseguro.gob.ec/ws/rest/relacionconfianza/publico/ValidacionDatosRegistroCivil2014v2/"+cedula+"/vigencia");
		// se usa nuevo IRC que tiene vigencia desde el 13-04-2018 al 13-04-2022, se desactiva el 09/02/2022 porque se remite nuevo IRC
		/*URL url = new URL(
				"https://www.datoseguro.gob.ec/ws/rest/relacionconfianza/publico/ValidacionDatosRegistroCivil2018v1/"
						+ cedula + "/vigencia");*/
		//Se usa nuevo IRC
		URL url = new URL(
				"https://www.datoseguro.gob.ec/ws/rest/relacionconfianza/publico/ValidacionDatosRegistroCivil2022v1/"
						+ cedula + "/vigencia");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		Persona personaError = new Persona();
		// Si existe un error
		try {
			if (conn.getResponseCode() != 200) {
				String mensajeError = "";
				switch (conn.getResponseCode()) {
				case 203:
					mensajeError = "Información no autoritativa (desde HTTP/1.1)";
					break;
				case 204:
					mensajeError = "Sin contenido";
					break;
				case 205:
					mensajeError = "Recargar contenido";
					break;
				case 206:
					mensajeError = "Contenido parcial";
					break;
				case 301:
					mensajeError = "Recurso movido permanentemente";
					break;
				case 302:
					mensajeError = "Recurso movido temporalmente";
					break;
				case 303:
					mensajeError = "Vea otra (desde HTTP/1.1)";
					break;
				case 304:
					mensajeError = "Recurso no modificado";
					break;
				case 305:
					mensajeError = "Utilice un proxy (desde HTTP/1.1)";
					break;
				case 306:
					mensajeError = "Cambie de proxy";
					break;
				case 307:
					mensajeError = "Redirección temporal (desde HTTP/1.1)";
					break;
				case 400:
					mensajeError = "Solicitud incorrecta";
					break;
				case 401:
					mensajeError = "Recurso no autorizado";
					break;
				case 402:
					mensajeError = "Pago requerido";
					break;
				case 403:
					mensajeError = "Prohibido";
					break;
				case 404:
					mensajeError = "Recurso no encontrado";
					break;
				case 405:
					mensajeError = "Método no permitido";
					break;
				case 406:
					mensajeError = "No aceptable";
					break;
				case 407:
					mensajeError = "Autenticación Proxy requerida";
					break;
				case 408:
					mensajeError = "Tiempo de espera agotado";
					break;
				case 409:
					mensajeError = "La solicitud no pudo ser procesada debido a un conflicto con el estado actual del recurso.";
					break;
				case 410:
					mensajeError = "Recurso ya no disponible";
					break;
				case 411:
					mensajeError = "Requiere longitud";
					break;
				case 412:
					mensajeError = "Falló precondición";
					break;
				case 413:
					mensajeError = "Solicitud demasiado larga";
					break;
				case 414:
					mensajeError = "URI demasiado larga";
					break;
				case 415:
					mensajeError = "Tipo de medio no soportado";
					break;
				case 416:
					mensajeError = "Rango solicitado no disponible";
					break;
				case 417:
					mensajeError = "Falló expectativa";
					break;
				case 422:
					mensajeError = "Entidad no procesable (WebDAV - RFC 4918)";
					break;
				case 423:
					mensajeError = "Bloqueado (WebDAV - RFC 4918)";
					break;
				case 424:
					mensajeError = "La solicitud falló debido a una falla en la solicitud previa.";
					break;
				case 425:
					mensajeError = "Colección sin ordenar";
					break;
				case 426:
					mensajeError = "Actualización requerida (RFC 2817)";
					break;
				case 429:
					mensajeError = "Demasiadas peticiones desde esta dirección de internet";
					break;
				case 500:
					mensajeError = "Error interno del servidor";
					break;
				case 501:
					mensajeError = "Recurso no implementado";
					break;
				case 502:
					mensajeError = "Pasarela incorrecta";
					break;
				case 503:
					mensajeError = "Servicio no disponible";
					break;
				case 504:
					mensajeError = "Tiempo de espera de la pasarela agotado";
					break;
				case 505:
					mensajeError = "Versión de HTTP no soportada";
					break;
				case 506:
					mensajeError = "Variante también negocia (RFC 2295)";
					break;
				case 507:
					mensajeError = "Almacenamiento insuficiente (WebDAV - RFC 4918)";
					break;
				case 509:
					mensajeError = "Límite de ancho de banda excedido";
					break;
				default:
					mensajeError = "No se encontraron datos en el registro civil.";
					break;
				}
				personaError.setMensajeError(mensajeError);
				return personaError;
			}
			// Saca el valor de retorno
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()), "UTF8"));
			String output;
			output = br.readLine();
			// Se desconecta del URL
			conn.disconnect();
			JsonParser jsonParser = new JsonParser();
			JsonElement jsonElement = jsonParser.parse(output);
			JsonObject datosTramite = jsonElement.getAsJsonObject().get("DatosTramite").getAsJsonObject();
			JsonArray informacionCivil = datosTramite.get("InformacionCivil").getAsJsonArray();
			Persona persona = new Persona();
			for (int i = 0; i < informacionCivil.size(); i++) {
				JsonObject elemento = informacionCivil.get(i).getAsJsonObject().getAsJsonObject();
				if (elemento.get("NombreCampo").toString().equals("\"CEDULA\"")) {
					persona.setDatIdentificacion(elemento.get("Valor").toString().replaceAll("\"", ""));
				}
				if (elemento.get("NombreCampo").toString().equals("\"NOMBRE\"")) {
					persona.setNombre(elemento.get("Valor").toString().replaceAll("\"", "").toString()
							.replaceAll("Ã'", "Ñ").replaceAll("Ã‘", "Ñ"));
				}
				if (elemento.get("NombreCampo").toString().equals("\"CONDICIONCIUDADANO\"")) {
					persona.setCondicionCiudadano(
							elemento.get("Valor").toString().replaceAll("\"", "").toString().replaceAll("Ã‘", "Ñ"));
				}
				if (elemento.get("NombreCampo").toString().equals("\"FECHANACIMIENTO\"")) {
					Date fechaNac = null;
					try {
						fechaNac = formatoDelTexto.parse(elemento.get("Valor").toString().replaceAll("\"", ""));
						persona.setDatFechaNacimiento(fechaNac);
					} catch (ParseException ex) {
						Logger.getLogger(ServicioRegistroCivil.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
				if (elemento.get("NombreCampo").toString().equals("\"LUGARNACIMIENTO\"")) {
					persona.setLugarNacimiento(
							elemento.get("Valor").toString().replaceAll("\"", "").toString().replaceAll("Ã‘", "Ñ"));
				}
				// se adiciona el manejo del campo SEXO y se raliza logica de
				// evaluación para obtener Genero
				if (elemento.get("NombreCampo").toString().equals("\"SEXO\"")) {
					String infoSexo = elemento.get("Valor").toString().replaceAll("\"", "");
					persona.setSexo(infoSexo); // se obtiene Hombre / Mujer
					String campoGenero = "";
					if (infoSexo.equalsIgnoreCase("MUJER")) {
						campoGenero = "FEMENINO";
					} else {
						campoGenero = "MASCULINO";
					}
					persona.setDatGenero(campoGenero);
				}
				/*
				 * El campo GENERO por temas legales no es posible usarlo y el
				 * servicio expone el campo SEXO
				 * if(elemento.get("NombreCampo").toString().equals("\"GENERO\""
				 * )){ persona.setDatGenero(elemento.get("Valor").toString().
				 * replaceAll("\"", "")); }
				 */
				if (elemento.get("NombreCampo").toString().equals("\"ESTADOCIVIL\"")) {
					persona.setDatEstadoCivil(elemento.get("Valor").toString().replaceAll("\"", ""));
				}
				if (elemento.get("NombreCampo").toString().equals("\"NACIONALIDAD\"")) {
					persona.setDatNacionalidad(
							elemento.get("Valor").toString().replaceAll("\"", "").toString().replaceAll("Ã‘", "Ñ"));
				}
				if (elemento.get("NombreCampo").toString().equals("\"CONYUGE\"")) {
					persona.setConyuge(
							elemento.get("Valor").toString().replaceAll("\"", "").toString().replaceAll("Ã‘", "Ñ"));
				}
				if (elemento.get("NombreCampo").toString().equals("\"NOMBREPADRE\"")) {
					persona.setNombrePadre(
							elemento.get("Valor").toString().replaceAll("\"", "").toString().replaceAll("Ã‘", "Ñ"));
				}
				if (elemento.get("NombreCampo").toString().equals("\"NOMBREMADRE\"")) {
					persona.setNombreMadre(
							elemento.get("Valor").toString().replaceAll("\"", "").toString().replaceAll("Ã‘", "Ñ"));
				}
			}
			if (persona.getCondicionCiudadano().indexOf("CADUCADA") != -1) {
				persona.setMensajeError(persona.getCondicionCiudadano());
			} else {
				persona.setMensajeError("OK");
			}
			return persona;
		} catch (Exception e) {
			personaError.setMensajeError("Web Service no disponible");
			return personaError;
		}
	}

	public static void disableSslVerification() {
		try {
			// Create a trust manager that does not validate certificate chains
			TrustManager[] trustAllCerts = new TrustManager[] {
				new X509TrustManager() {
					public java.security.cert.X509Certificate[] getAcceptedIssuers() {
						return null;
					}

					public void checkClientTrusted(X509Certificate[] certs, String authType) {
					}

					@Override
					public void checkServerTrusted(java.security.cert.X509Certificate[] arg0, String arg1)
							throws CertificateException {
						// TODO Auto-generated method stub
					}
				}
			};

			// Install the all-trusting trust manager
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};

			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		} catch (KeyManagementException e) {
			System.out.println(e.getMessage());
		}
	}

	/*Consulta cedula en BSG*/
	private Ciudadano consultarPorCedula(String cedula, Long timeoutWS) {
        try {
            DatosHeader headers = new DatosHeader();
            //Accede a web service de autenticación del BSG para el RC
            headers = generaToken();
            if (headers != null) {
                ConsultaCiudadano_Service service = new ConsultaCiudadano_Service();
                HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver(headers);
                service.setHandlerResolver(handlerResolver);
                ConsultaCiudadano port = service.getConsultaCiudadanoPort();
                // Establecer timeout
                Client client = ClientProxy.getClient(port);
                if(client != null) {
	                HTTPConduit conduit = (HTTPConduit) client.getConduit();
	                HTTPClientPolicy policy = new HTTPClientPolicy();
	                policy.setConnectionTimeout(timeoutWS);
	                policy.setReceiveTimeout(timeoutWS);
	                policy.setAllowChunking(false);
	                conduit.setClient(policy);
            	}
                String codigoInstitucion = Constantes.ConsumoWebServices.RC_CODIGO_INSTITUCION;
                String codigoAgencia = Constantes.ConsumoWebServices.RC_CODIGO_AGENCIA;
                String usuario = Constantes.ConsumoWebServices.RC_BSG_USER;
                String contrasenia = Constantes.ConsumoWebServices.RC_BSG_PASSWORD;
                //Consulta cédula en BSG
                Ciudadano result = port.busquedaPorNui(codigoInstitucion, codigoAgencia, usuario, contrasenia, cedula);


                if (result != null) {
                    return result;
                }
            }
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

	//Conexión a BSG
	private DatosHeader generaToken() {
        try {
            DatosHeader Headers = new DatosHeader();
            AccesoBSGService service = new AccesoBSGService();
            BSG04AccederBSG port = service.getBSG04AccederBSGPort();
            ValidarPermisoPeticion validarPermisoPeticion  = new ValidarPermisoPeticion();
            //Ingreso de datos para generar token de autenticación en BSG
            validarPermisoPeticion.setCedula("1001633807");
            validarPermisoPeticion.setUrlsw("https://www.bsg.gob.ec/sw/RC/BSGSW03_Consultar_Ciudadano?wsdl");
            //Accede a web service de autenticación
            ValidarPermisoRespuesta result = port.validarPermiso(validarPermisoPeticion);
            if (!result.getMensaje().getCodError().equals("000")){
                Headers.setNonce(result.getMensaje().getDesError());
                Headers.setDigest(result.getMensaje().getDesError());
                Headers.setFecha(result.getMensaje().getDesError());
                Headers.setFechaf(result.getMensaje().getDesError());
            }
            else{
                Headers.setNonce(result.getNonce());
                Headers.setDigest(result.getDigest());
                Headers.setFecha(result.getFecha());
                Headers.setFechaf(result.getFechaF());
                Headers.setUsuario("1001633807");
            }
            return Headers;
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
            return null;
        }
    }
}
