package com.example.restapi.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarCorreoActivacion(String destinatario, String nombreUsuario, Long idUsuario, String codigoActivacion) {
        String asunto = "Activa tu cuenta";
        String urlActivacion = "http://localhost:8080/api/activar?id=" + idUsuario + "&codigo=" + codigoActivacion;

        String contenido = "Hola " + nombreUsuario + ",<br><br>" +
                "Gracias por registrarte. Haz clic en el siguiente botón para activar tu cuenta:<br><br>" +
                "<a href=\"" + urlActivacion + "\"><button>Activar cuenta</button></a><br><br>" +
                "Saludos,<br>Equipo";

        MimeMessagePreparator mensaje = mimeMessage -> {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setTo(destinatario);
            helper.setSubject(asunto);
            helper.setText(contenido, true);
        };

        mailSender.send(mensaje);
    }
}
