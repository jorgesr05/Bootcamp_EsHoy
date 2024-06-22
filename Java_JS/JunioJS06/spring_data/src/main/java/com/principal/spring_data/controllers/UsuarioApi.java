package com.principal.spring_data.controllers;

import org.springframework.web.bind.annotation.RestController;


import com.principal.spring_data.services.UsuarioService;

import lombok.AllArgsConstructor;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioApi {
    
    private final UsuarioService usuarioService;

    @PostMapping("")
    public String createUser() {
       
        return "CREATED";
    }
    
    
}
