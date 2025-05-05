package com.example.restapi.usuarios.controller;

import com.example.restapi.usuarios.model.SecurityQuestion;
import com.example.restapi.usuarios.repository.SecurityQuestionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/preguntas")
public class SecurityQuestionController {

    private final SecurityQuestionRepository repo;

    public SecurityQuestionController(SecurityQuestionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<SecurityQuestion> getAllQuestions() {
        return repo.findAll();
    }
}
