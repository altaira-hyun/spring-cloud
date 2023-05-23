package com.example.springbootclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @Value("${example.name}")
    private String name;

    @Value("${example.type}")
    private String type;

    @GetMapping("/spring-service")
    public String springController() {
        return "spring controller response";
        return "name: " + name + " / type: " + type;

    }
}
