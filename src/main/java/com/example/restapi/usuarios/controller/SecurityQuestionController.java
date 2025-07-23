package com.example.restapi.usuarios.controller;

import com.example.restapi.usuarios.model.SecurityQuestion;
import com.example.restapi.usuarios.repository.SecurityQuestionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/preguntas")
public class SecurityQuestionController {

    private final SecurityQuestionRepository repo;

    public SecurityQuestionController(SecurityQuestionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<SecurityQuestion> getAllQuestions() {
        return repo.findAll().stream()
                .filter(q -> !(q.getId() == 11 || q.getId() == 12 || q.getId() == 13))
                .collect(Collectors.toList());
    }

}
