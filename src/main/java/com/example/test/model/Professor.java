package com.example.test.model;

public class Professor {
    private String name;
    private String department;
    private String expertise;

    // Constructors, getters, and setters
    public Professor() {}

    public Professor(String name, String department, String expertise) {
        this.name = name;
        this.department = department;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
