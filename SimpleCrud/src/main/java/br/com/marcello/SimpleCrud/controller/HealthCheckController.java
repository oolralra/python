package br.com.marcello.SimpleCrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/test")
    public String healthCheck() {
        return "Hello, World!";
    }

}
