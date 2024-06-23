package com.principal.data.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.principal.data.models.Usuario; //tiene que ir
import com.principal.data.services.UsuarioService;

import lombok.AllArgsConstructor;

import java.util.Date; //tiene que ir

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioApi {
    private final UsuarioService usuarioService;

    @PostMapping("")
    public String createUser() {
        
        Usuario jorge = new Usuario(null,"70615471","Jorge","Sanchez","jorge@outlook.com","575757570",new Date("1993/05/15"),false,169.0,null, null);

		System.out.println(jorge);
        usuarioService.createUsuario(jorge); 

        return "CREATED";
    }
    
    
}
