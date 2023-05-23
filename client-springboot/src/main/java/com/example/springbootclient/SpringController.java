package com.example.springbootclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RefreshScope
@RestController
public class SimpleController {

    @Value("${example.name}")
    private String name;

    @Value("${example.type}")
    private String type;

    @GetMapping("")
    public String simple(){
        return "name: " + name + " / type: " + type;
    }
}