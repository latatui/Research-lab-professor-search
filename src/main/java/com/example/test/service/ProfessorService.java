package com.example.test.service;

import com.example.test.model.Professor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService {
    private final List<Professor> professors = new ArrayList<>();

    public List<Professor> getAllProfessors() {
        return professors;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
}
