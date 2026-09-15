package com.example.restapi.event;

import com.example.restapi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class RegistroCreadoEventListener {

    @Autowired
    private EmailService emailService;

    @Value("${app.frontend.activacion.url}")
    private String frontendActivacionUrl;

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void enviarCorreo(RegistroCreadoEvent event) {

        String enlace = frontendActivacionUrl
                + "?id=" + event.getUsuarioId()
                + "&codigo=" + event.getCodigoActivacion();

        emailService.enviarCorreoActivacion(
                event.getCorreo(),
                event.getNombreCompleto(),
                event.getNumeroIdentificacion(),
                enlace);
    }
}
