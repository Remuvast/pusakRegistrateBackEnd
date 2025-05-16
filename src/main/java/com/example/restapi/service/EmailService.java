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

    public void enviarCorreoActivacion(String destinatario, String nombreUsuario, String enlaceActivacion) {
        String asunto = "Activa tu cuenta";

        String contenido = "Hola " + nombreUsuario + ",<br><br>" +
                "Gracias por registrarte. Haz clic en el siguiente botón para activar tu cuenta:<br><br>" +
                "<a href=\"" + enlaceActivacion + "\" style='background-color:#4CAF50;color:white;padding:10px 20px;text-decoration:none;border-radius:5px;display:inline-block;'>Activar cuenta</a><br><br>" +
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
