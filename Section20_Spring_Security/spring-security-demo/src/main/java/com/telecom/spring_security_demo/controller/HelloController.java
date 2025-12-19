package com.telecom.spring_security_demo.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "hello World "+request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "Telecom "+request.getSession().getId();
    }
    
    
}
