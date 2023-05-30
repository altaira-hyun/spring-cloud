package com.example.springbootclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class SpringController {


    @GetMapping("/spring-service")
    public String springController() {
        return "spring controller response";

    }
}
