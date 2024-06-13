package com.ejemplo.demo1.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/home")
public class HomeController {
    
    @GetMapping("")
    public String home() {
        return "Home page";
    }
    
    @GetMapping("/visita")
    public String homeVisita() {
        return "Home page para visitantes";
    }
    
    @GetMapping("/usuarios")
    public String homeUsuarios() {
        return "Home page para usuarios";
    }
    

}
