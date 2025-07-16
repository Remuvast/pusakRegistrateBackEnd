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

    /**
     * Envía el correo de activación de cuenta.
     *
     * @param destinatario     La dirección de correo del usuario.
     * @param nombresApellidos Los nombres y apellidos del usuario.
     * @param numeroCedula     El número de cédula (usuario).
     * @param enlaceActivacion La URL de activación.
     */
    public void enviarCorreoActivacion(
            String destinatario,
            String nombresApellidos,
            String numeroCedula,
            String enlaceActivacion
    ) {
        String asunto = "Creación de Cuenta – Activación de Registro (PUSAK)";

        String contenido = ""
            + "<div style='font-family: Helvetica, Arial, sans-serif; max-width:600px; margin:auto;'>"
            +   "<p>Estimado/a usuario/a:<br><strong>" + nombresApellidos + "</strong></p>"
            +   "<p>Usted ha registrado con éxito sus datos, recuerde que la información consignada "
            +     "es de su entera responsabilidad y para completar su proceso debe activar la cuenta.</p>"
            +   "<p><strong>Sus datos de acceso son:</strong><br>"
            +     "Usuario: <strong>" + numeroCedula + "</strong></p>"
            +   "<div style='text-align:center; margin:20px 0;'>"
            +     "<a href='" + enlaceActivacion + "' "
            +        "style='background-color:#007bff;color:white;padding:10px 20px;"
            +               "text-decoration:none;border-radius:4px;font-weight:bold;'>"
            +        "Pulse aquí para activar su cuenta"
            +     "</a>"
            +   "</div>"
            +   "<p><strong>ACUERDO DE RESPONSABILIDAD:</strong> El aspirante asume la responsabilidad "
            +     "total de la veracidad de la información que registre, sin perjuicio de las acciones "
            +     "judiciales a que hubiere lugar, de conformidad a lo dispuesto en el Código Orgánico "
            +     "Integral Penal.</p>"
            +   "<p>Atentamente,<br>"
            +     "<strong>Secretaría de Educación Superior, Ciencia, Tecnología e Innovación</strong></p>"
            +   "<p style='font-size:small; color:gray;'>"
            +     "Las tildes han sido omitidas intencionalmente para evitar problemas de lectura."
            +   "</p>"
            +   "<p style='font-size:small; color:gray;'>"
            +     "Este correo ha sido generado automáticamente, por favor no responda al mismo."
            +   "</p>"
            + "</div>";

        MimeMessagePreparator mensaje = mimeMessage -> {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
            helper.setTo(destinatario);
            helper.setSubject(asunto);
            helper.setFrom("pusakregistro@senescyt.gob.ec", "Registro SENESCYT");
            helper.setText(contenido, true);
        };

        mailSender.send(mensaje);
    }
}
