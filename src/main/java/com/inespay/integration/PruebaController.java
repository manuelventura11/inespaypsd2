package com.inespay.integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class PruebaController {

    @GetMapping
    public String getHolaMundo(){
        return "Hola";
    }
}
