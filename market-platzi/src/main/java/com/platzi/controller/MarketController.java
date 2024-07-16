package com.platzi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {

    @GetMapping("/hola")
    public String Saludar(){
        return "Nunca pares de aprender.";
    }
}
