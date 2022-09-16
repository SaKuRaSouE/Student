package com.example.Student;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
    @GetMapping ("/api")
    public  String getString() {

    }
}
