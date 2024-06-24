package com.example.test.controller;

import com.example.test.model.Professor;
import com.example.test.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("professors", professorService.getAllProfessors());
        return "index";
    }

    @GetMapping("/professors/new")
    public String showProfessorForm(Model model) {
        model.addAttribute("professor", new Professor());
        return "professorForm";
    }

    @PostMapping("/professors")
    public String saveProfessor(@ModelAttribute Professor professor) {
        professorService.addProfessor(professor);
        return "redirect:/";
    }
}
