package com.learning.api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String getHello(){
        return "Hello world from the backend of a spring app :D !!";
    }
}
