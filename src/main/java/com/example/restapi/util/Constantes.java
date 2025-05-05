package com.example.restapi.util;

public class Constantes {
    public static final String FORMATO_FECHA_CORTA = "dd/MM/yyyy";
	public static final String FORMATO_FECHA_LARGA = "dd/MM/yyyy HH:mm:ss";
	public static final String FORMATO_HORA = "HH:mm";
    public static final String DIRECTORIO_TMP = "jboss.server.base.dir";
    public static final String FORMATO_XLS = ".xls";
    public static final String FORMATO_JASPER = ".jasper";
    public static final int TIEMPO_MINUTOS_SESION = 30;
    public static final String NOMBRE_SISTEMA = "BECAS_INGLES";
    public static final String CODIGO_PERFIL_SISTEMA_INSCRIPCION = "PERSONAS_BECAS";
    public static final String CODIGO_PERFIL_SISTEMA = "PERSONAS_BECAS";
    public static final String CODIGO_PERFIL_SISTEMA_ZONALES = "ZONALES_BECAS";
	public static final String RESULTADO_ERROR = "error";
	public static final String SELECCIONE_TODOS = "Todos";
	public static final String FORMATO_PDF = ".pdf";
	public static final String SIN_CATEGORIA = "SIN CATEGORIA";
	public static final String CODIGO_PORTAL_IES = "IESGRL";
	public static final String NOMBRE_PORTAL_IES = "Ser Bachiller";
	public static final String ORIGEN_ERRONEO = "DOMINIO DE ORIGEN NO PERMITIDO: ";


    public static final class Autenticacion {
        public static final String SQL_FUNCION_ENCRIPTAR = "SELECT SEGURIDAD.PACK_SEGURIDADES.encrypt (?)  FROM DUAL";
        public static final String SQL_FUNCION_DESENCRIPTAR = "SELECT SEGURIDAD.PACK_SEGURIDADES.decrypt (?)  FROM DUAL";
        public static final String NOMBRE_PLANTILLA_CAMBIO_CLAVE = "recuperarClave";
        public static final String ASUNTO_EMAIL = "Recuperaci\u00F3n de contrase\u00F1a";
        public static final class TipoDocumento {
            public static final String CEDULA = "C\u00C9DULA";
            public static final String PASAPORTE = "PASAPORTE";
            public static final String CARNET_REFUGIADO = "CARN\u00C9T DE REFUGIADO";
        }
        public static final class TipoDocumentoCrearCuenta {
	        public static final String CIUDADANO = "Ciudadano ecuatoriano";
	        public static final String EXTRANJERO_ECUATORIANO = "Extranjero con nacionalidad ecuatoriana";
	        public static final String EXTRANJERO_RESIDENTE = "Extranjero residente";
	        public static final String CARNET_REFUGIADO = "Refugiado o solicitante de refugio";
        }
    }


    public static final class ObtencionCuenta{
        public static final String CHARSET = "UTF-8";
        public static final String ALGORITMO_AES = "PBEWithMD5AndDES";
        public static final char[] PASSWORD = "Xav54321Jav12345".toCharArray();
        public static final String NOMBRE_PLANTILLA_ACTIVACION_CUENTA = "activacionCuenta";
        public static final String ASUNTO_EMAIL = "Educaci\u00F3n Continua - PIN para creaci\u00F3n de cuenta";
        public static final String REMITENTE = "no-reply@senescyt.info.ec";
        public static final Integer NUMERO_ANIOS_DURACION_PERFIL = 30;
        public static final String CORREO_EXISTENTE = "El email ingresado, ya se encuentra registrado en el programa de becas 'Because he is nice'. ";
   }


    public static final class DetalleParametro{
    	public static final Long TIPOS_DE_IDENTIFICACION = 63L;
    	public static final Long MENSAJES_LOGIN = 48L;
    	public static final String NEMONICO_LOGIN_LGE = "LGE";
    	public static final Long JWT_ID_PADRE = 120L;
    	public static final Long CASOS_HCUENTA = 92L;
    	public static final String CASOS_HRES = "CASOS HABILITACION DE RES";
    	public static final Long CASOS_REPROGRAMACION = 102L;
    	public static final Long CAMBIO_IDENTIFICACION = 99L;
    	public static final Long DETALLE_BECAS = 100L;
		public static final Long AUTOIDENTIFICACIONES = 20L;
		public static final Long PUEBLOSNACIONALIDADES = 30L;
		public static final Long ESTADOCIVIL = 21L;
		public static final Long DISCAPACIDADES = 25L;
		public static final String NEMONICO_PREG_ESTUDIOS = "CUEST_INSCRIP";
		public static final Long PERIODO_ESCOLAR = 64L;
		public static final Long SEDE = 66L;
		public static final Long ETAPA = 72L;
		public static final Long GENERO = 19L;
		public static final String SEDE_SEGMENTO = "POBLACION GENERAL";
		public static final class EstadoCivil{
			public static final String SOLTERO = "SOLTERO";
			public static final String UNION_LIBRE = "UNION LIBRE";
			public static final String DIVORCIADO = "DIVORCIADO";
			public static final String VIUDO = "VIUDO";
			public static final String CASADO = "CASADO";
		}
    }



    public static final class ConsumoWebServices{

    	public static final class Inscripcion{
    		public static final String MENSAJE_ANALFABETO = "La cédula de ciudadanía o identidad ingresada corresponde a una persona sin registro de estudios de bachillerato, de acuerdo a la información proporcionada por el Registro Civil, por lo que no es posible continuar con el proceso de inscripción para rendir la evaluación de competencias y habilidades. Para mayor información comunícate con el Registro Civil.";
    		public static final String MENSAJE_FALLECIDO = "El documento de identificación ingresado, según el servicio web del Registro Civil se encuentra como 'fallecido'.";
    		public static final String MENSAJE_CADUCADO_X_ANULACION = "El documento de identificación ingresado, no está registrado o está anulado, de acuerdo a la información proporcionada por el Registro Civil.";
    		public static final String MENSAJE_EXTRANJERO_FALLECIDO = "El documento de identificación ingresado, según el servicio web del Registro Civil se encuentra como 'fallecido'.";
    		public static final String MENSAJE_EXTRANJERO_NO_CEDULADO = "El Ministerio de Relaciones Exteriores y Movilidad Humana no dispone de información sobre el documento de identificación ingresado.";
    		public static final String MENSAJE_CONTRAVENCION = "El documento de identificación ingresado, corresponde a una cédula de identidad invalidada por contravención, según el servicio web del Registro Civil.";
    		public static final String MENSAJE_EXTRANJERO_EXPIRACION = "El documento de identificación ingresado, se encuentra como expirado, según el servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana.";
    		public static final String MENSAJE_EXTRANJERO_CONTRAVENCION = "El documento de identificación ingresado, corresponde a una cédula de identidad invalidada por contravención, según el servicio web del Registro Civil o del Ministerio de Relaciones Exteriores y Movilidad Humana.";
    		public static final String MENSAJE_INSCRIPCION_PROCESO = "El documento de identificación ingresado, presenta una condición generada de manera automática por el sistema SURI al solicitar un bloqueo del registro de nacimiento, según el servicio web del Registro Civil.";
    		public static final String MENSAJE_MAYOR_DE_EDAD = "El documento de identificación ingresado, corresponde a una persona menor de edad, según el servicio web del Registro Civil.";
    		public static final String TIENE_CAMBIO_IDENTIFICACION = "El documento de identificación ingresado no es válido, realiza la creación de cuenta con un documento de identificación vigente.";
        	public static final String NO_TIENE_VISA_EMITIDA = "El documento de identificación ingresado, está caducado, cancelado o desactivado según el servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana.";
        	public static final String TIENE_NATURALIZACION = "El documento de identificación ingresado, tiene un proceso de naturalización.";
        	public static final String TIENE_CEDULACION = "El documento de identificación ingresado, tiene una orden de cedulación.";
        	public static final String NO_ES_VISA_PERMITIDA = "El documento de identificación ingresado, corresponde a un tipo de documento que no es válido, según el servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana.";
        	public static final String NO_ES_FECHA_MINIMA_PERMITIDA = "El documento de identificación ingresado, expira antes del DD de MM de AAAA.";
        	public static final String SERVICIO_CANCILLERIA_NO_DEVUELVE_RESULTADOS = "El Servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana no dispone de información sobre los datos ingresados. Verifique que la información ingresada sea correcta o con esta cartera de estado si su información presenta alguna novedad.";
        	public static final String SERVICIO_RC_NO_DEVUELVE_RESULTADOS = "No se encontraron datos en el Servicio de Registro Civil.";
        	public static final String DATOS_ENCONTRADOS_WS = "Se guarda registro exitosamente";
        	public static final String SERVICIO_NO_DISPONIBLE = "El web service no responde.";

    	}
    	public static final class CreacionCuenta{
    		public static final String MENSAJE_FALLECIDO = "El documento de identificación corresponde a una persona fallecida.";
            public static final String MENSAJE_CADUCADO = "La cédula que ingresaste no está registrada o está caducada. Para mayor información comunícate con el Registro Civil.";
            public static final String CEDULA_EN_PASAPORTE = "Se intenta registrar en un pasaporte una cédula";
            public static final String TIENE_CAMBIO_IDENTIFICACION = "El documento de identificación ingresado no es válido, realiza la creación de cuenta con un documento de identificación vigente.";
        	public static final String NO_TIENE_VISA_EMITIDA = "El documento de identificación ingresado, está caducado, cancelado o desactivado según el servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana. Ingresa un documento válido.";
        	public static final String TIENE_NATURALIZACION = "El documento de identificación ingresado, tiene un proceso de naturalización. Realiza la creación de cuenta con tu número de cédula ecuatoriana.";
        	public static final String TIENE_CEDULACION = "El documento de identificación ingresado, tiene una orden de cedulación. Realiza la creación de cuenta con tu número de cédula ecuatoriana.";
        	public static final String NO_ES_VISA_PERMITIDA = "El documento de identificación ingresado, corresponde a un tipo de documento que no es válido, según el servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana. Ingresa un documento válido.";
        	public static final String NO_ES_FECHA_MINIMA_PERMITIDA = "El documento de identificación ingresado, expira antes del DD de MM de AAAA. Ingresa un documento válido.";
        	public static final String SERVICIO_CANCILLERIA_NO_DEVUELVE_RESULTADOS = "El Servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana no dispone de información sobre los datos ingresados. Verifique que la información ingresada sea correcta o con esta cartera de estado si su información presenta alguna novedad.";
        	public static final String SERVICIO_RC_NO_DEVUELVE_RESULTADOS = "No se encontraron datos en el servicio web del Registro Civil.";
        	public static final String TIENE_CUENTA = "El documento de identificación ingresado, ya se encuentra registrado en el programa de Educación Continua 'Because he is nice'.";
        	public static final String DATOS_ENCONTRADOS_WS = "Se guarda registro exitosamente y se crea el usuario.";
        	public static final String MENSAJE_BACHILLER = "Usted no cuenta con registro de título de bachiller, realice las gestiones correspondientes en el Ministerio de Educación.";
        	public static final String MENSAJE_CNE = "Usted no se encuentra habilitado para realizar un trámite público. Realice las gestiones correspondientes con el Consejo Nacional Electoral";
        	public static final String MENSAJE_CNE_NO_RESPONSE = "El servicio web del Consejo Nacional Electoral no está disponible, por favor, intente más tarde";

    	}

    	public static final class CambioIdentificacion{
    		public static final String TIENE_CAMBIO_IDENTIFICACION = "El documento de identificación ingresado ya fue utilizado en periodos anteriores para una actualización. Asegúrese que la información ingresada sea correcta.";
        	public static final String NO_TIENE_VISA_EMITIDA = "El documento de identificación ingresado, está caducado, cancelado o desactivado según el servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana. Ingresa un documento válido.";
        	public static final String TIENE_NATURALIZACION = "El documento de identificación ingresado, tiene un proceso de naturalización. Realiza la actualización con tu número de cédula.";
        	public static final String TIENE_CEDULACION = "El documento de identificación ingresado, tiene una orden de cedulación. Realiza la actualización con tu número de cédula.";
        	public static final String NO_ES_VISA_PERMITIDA = "El documento de identificación ingresado, corresponde a un tipo de documento que no es válido, según el servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana. Ingresa un documento válido.";
        	public static final String NO_ES_FECHA_MINIMA_PERMITIDA = "El documento de identificación ingresado, expira antes del DD de MM de AAAA (corresponde a la fecha mínima para realizar un proceso de admisión para el primer periodo académico 2023, conforme a lo que menciona el artículo 17 del Reglamento del Sistema Nacional de Nivelación y Admisión). Ingresa un documento válido.";
        	public static final String SERVICIO_RC_NO_DEVUELVE_RESULTADOS = "No se encontraron datos en el servicio web de Registro Civil.";
        	public static final String SERVICIO_CANCILLERIA_NO_DEVUELVE_RESULTADOS = "No se encontraron datos con la información ingresada en el servicio web del Ministerio de Relaciones Exteriores y Movilidad Humana.";
        	//public static final String TIENE_CUENTA_SER_BACHILLER = "El documento de identificación ingresado, ya se encuentra registrado en el Sistema Nacional de Nivelación y Admisión. No te preocupes, tu solicitud será analizada. Te informaremos los resultados.";
        	public static final String PROCEDE_CAMBIO = "La solicitud ha sido registrada correctamente y se encuentra en etapa de análisis.";
        	public static final Integer SOLICITUD_HRES = 6;
        	public static final Integer SOLICITUD_ACTUALIZACION_DATOS = 7;
    		public static final String MENSAJE_FALLECIDO = "La cédula de ciudadanía o identidad ingresada corresponde a una persona con estado fallecido, de acuerdo a la información proporcionada por el Registro Civil.";
    		public static final String MENSAJE_CADUCADO = "La cédula que ingresaste no está registrada o está caducada, de acuerdo a la información proporcionada por el Registro Civil.";
    		public static final String MENSAJE_EXTRANJERO_FALLECIDO = "La cédula de ciudadanía o identidad ingresada corresponde a una persona extranjera con estado fallecido, de acuerdo a la información proporcionada por el Registro Civil.";
    		public static final String MENSAJE_EXTRANJERO_NO_CEDULADO = "La cédula de ciudadanía o identidad ingresada corresponde a una persona extranjera con estado no cedulada, de acuerdo a la información proporcionada por el Registro Civil.";
    		public static final String MENSAJE_CONTRAVENCION = "La cédula de ciudadanía o identidad ingresada corresponde a una cédula de identidad invalidada por contravención, de acuerdo a la información proporcionada por el Registro Civil.";
    		public static final String MENSAJE_EXTRANJERO_EXPIRACION = "La cédula de ciudadanía o identidad ingresada corresponde a una persona extranjera cuyo documento cumplió el tiempo de vigencia contado a partir de su fecha de expedición, de acuerdo a la información proporcionada por el Registro Civil.";
    		public static final String MENSAJE_EXTRANJERO_CONTRAVENCION = "La cédula de ciudadanía o identidad ingresada corresponde a una persona extranjera cuyo documento se encuentra invalidado por contravención, de acuerdo a la información proporcionada por el Registro Civil.";
    		public static final String MENSAJE_INSCRIPCION_PROCESO = "La cédula de ciudadanía o identidad ingresada presenta un bloqueo del registro de nacimiento, de acuerdo a la información proporcionada por el Registro Civil.";
    	}
    	public static final String CODIGO_PAQUETE_MINEDUC = "5662";
    	public static final String CODIGO_PAQUETE_CNE = "1284";

    	public static final String USERNAME_MINEDUC = "InOlbSnCyT";
    	public static final String USERNAME_CNE = "DINpINtOpIFth";

    	public static final String PASSWORD_MINEDUC = "<HB.762oJ!";
    	public static final String PASSWORD_CNE = "jlvsJlJrvH%ziO";

    	public static final String CAMPO_MINEDUC = "codigoRefrendacion";
    	public static final String CAMPO_CNE = "habilitadoTPublico";

    	public static final String RC_CODIGO_INSTITUCION = "3";
    	public static final String RC_CODIGO_AGENCIA = "112";
    	public static final String RC_BSG_USER = "senescyt1";
    	public static final String RC_BSG_PASSWORD = "u65pK(8351";

    	public static final String RC_DINARP_PAQUETE = "471";
    	public static final String RC_DINARP_USER = "InOlbSnCyT";
    	public static final String RC_DINARP_PASSWORD = "<HB.762oJ!";

    	public static final String SERVICIO_NO_DISPONIBLE = "Al momento el servicio web no puede realizar consultas con el Registro Civil, por favor intente más tarde.";
    	public static final String ASUNTO_EMAIL = "Recepci\u00F3n de cambio de identificaci\u00F3n";
    	public static final String NOMBRE_PLANTILLA = "solicitudCambioIdentificacion";
    	public static final String MENSAJE_CAMBIO_IDENTIFICACION = "<p>Recuerda que para participar en este proceso tu documento de identificación debe estar dentro de los parámetros de validación:</p> <ul><li>Fecha de acceso a la Educación Superior (DD de MM de AAAA).</li><li>Ministerio de Relaciones Exteriores y Movilidad Humana.</li><li>Registro Civil.</li></ul><p>Primero realiza la actualización de tu documento de identidad, si el mismo es correcto intenta nuevamente enviar tu solicitud de Retorno al Acceso de Educación Superior.</p>";
    }

    public static final class Inscripcion{
    	public static final String EXTRANJERO_CONSULADO = "Bloqueo en la ficha 2 por restricción de nacionalidad extranjera y país de residencia";
    	public static final String QUERY_GUARDA_PASO_UNO = "update InscripcionSNNA i set i.sexo=:sexo, i.pasoInscripcion=:paso, i.estadoInscripcion=:estado, i.usoServicioWeb=:usoWs where i.id=:id";
    	public static final String SEXO = "sexo";
    	public static final String PASO = "paso";
    	public static final String ESTADO = "estado";
    	public static final String USO_WS = "usoWs";
    	public static final String ID = "id";
    	public static final String QUERY_GUARDA_PASO_DOS = "update InscripcionSNNA i set i.pasoInscripcion=:paso, i.ecuatorianoExtranjeroResidencia=:ecuatorianoExtranjeroResidencia, i.idParroquiaResidencia=:idParroquiaResidencia, i.barrioSector=:barrioSector, i.callePrincipal=:callePrincipal, i.numeroCasa=:numeroCasa, i.archivoMigrante=:archivoMigrante, i.tieneCertificado=:tieneCertificado, i.idPaisResidencia=:idPaisResidencia, i.idConsulado=:idConsulado, i.numeroCelular=:celular, i.numeroTelefono=:telefono, i.numeroTelefonoAdicional=:telefono2 where i.id=:id";
    	public static final String RESIDENCIA = "ecuatorianoExtranjeroResidencia";
		public static final String PARROQUIA = "idParroquiaResidencia";
		public static final String BARRIO = "barrioSector";
		public static final String CALLE_PRINCIPAL = "callePrincipal";
		public static final String NUM_CASA = "numeroCasa";
		public static final String ARCHIVO = "archivoMigrante";
		public static final String MIGRANTE = "tieneCertificado";
		public static final String PAIS = "idPaisResidencia";
		public static final String CONSULADO = "idConsulado";
		public static final String CELULAR = "celular";
		public static final String TELEFONO = "telefono";
		public static final String TELEFONO2 = "telefono2";
		public static final String QUERY_GUARDA_PASO_TRES = "update InscripcionSNNA i set i.pasoInscripcion=:paso, i.etnia=:etnia, i.nacionalidad=:nacionalidad, i.idPuebloIndigena=:idPuebloIndigena where i.id=:id";
		public static final String ETNIA = "etnia";
		public static final String NACIONALIDAD = "nacionalidad";
		public static final String PRD_ID_PUEBLO = "idPuebloIndigena";
		public static final String QUERY_GUARDA_PASO_CUATRO = "update InscripcionSNNA i set i.apoyoDiscapacidad=:apoyoDiscapacidad, i.porcentajeDiscapacidad1=:porcentajeDiscapacidad1, i.tipoDiscapacidad=:tipoDiscapacidad, i.pasoInscripcion=:paso, i.numeroCarnetCONADIS=:numeroCarnetCONADIS, where i.id=:id";
		public static final String CARNET_CONADIS = "numeroCarnetCONADIS";
		public static final String TIPO_DISCAPACIDAD = "tipoDiscapacidad";
		public static final String PORCENTAJE_DISCAPACIDAD = "porcentajeDiscapacidad1";
		public static final String APOYO_DISCAPACIDAD = "apoyoDiscapacidad";
		public static final String QUERY_GUARDA_PASO_CINCO = "update InscripcionSNNA i set i.pasoInscripcion=:paso, i.estadoInscripcion=:estado where i.id=:id";

		public static final String GENERO = "genero";
		public static final String PARROQUIA_MODIFICADA = "parroquia";
		public static final String PREFIJO = "prefijo_telefono";
		public static final String PUEBLO = "pueblo";
		public static final String SP_ADJUDICA_COOPERANTE = "FORTALECIMIENTO.SP_ADJUDICA_COOPERANTES";
		public static final String SQL_PARAMETRO_IN_INSCRITO_ID = "p_inscrito_id";
		public static final String SQL_PARAMETRO_IN_USU_ID = "p_usu_id";
		public static final String FN_ASIGNA_COOPERANTE = "FORTALECIMIENTO.ASIGNAR_COOPERANTE_PROC";
		public static final String SQL_PARAMETRO_OUT = "SALIDA";
    }
}
