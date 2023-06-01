package com.example.springbootclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class SpringController {


    @GetMapping("/summer-service")
    public String springController() {
        return "summer controller response";

    }
}
