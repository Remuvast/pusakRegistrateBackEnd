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
        String asunto = "ALERTA : CONFIRMACION DE REGISTRO";

        String contenido = "<div style='font-family: Arial, sans-serif; max-width: 600px; margin: auto;'>" +
                "<p>Estimado/a usuario/a:</p>" +

                "<p>Usted ha completado exitosamente el registro en la Plataforma Informática <strong>PUSAK</strong>.</p>" +

                "<p>En este portal interactivo, tan solo con un click, Usted podrá administrar su cuenta y realizar su postulación a una beca.</p>" +

                "<p>En la Plataforma Informática <strong>PUSAK</strong>, Usted cuenta con funcionalidades adicionales diseñadas para su comodidad, podrá acceder de manera fácil a los detalles de sus postulaciones, adjudicaciones, consultas, seguimiento académico de una beca, entre otros beneficios.</p>" +

                "<p><strong>Usuario:</strong> " + nombreUsuario + "</p>" +

                "<div style='text-align: center; margin: 20px 0;'>" +
                "<a href=\"" + enlaceActivacion + "\" " +
                "style='background-color:#4CAF50;color:white;padding:10px 25px;text-decoration:none;border-radius:5px;display:inline-block;font-weight:bold;'>Pulse aqui para activar su registro</a>" +
                "</div>" +

                "<p>Atentamente,<br><strong>Secretaría de Educación Superior, Ciencia, Tecnología e Innovación</strong></p>" +

                "<br><p style='font-size: small; color: gray;'>Las tildes han sido omitidas intencionalmente para evitar problemas de lectura.</p>" +
                "<p style='font-size: small; color: gray;'>Este correo ha sido generado automaticamente, por favor no responda al mismo.</p>" +
                "</div>";

        MimeMessagePreparator mensaje = mimeMessage -> {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setTo(destinatario);
            helper.setSubject(asunto);
            helper.setText(contenido, true);
        };

        mailSender.send(mensaje);
    }
}
