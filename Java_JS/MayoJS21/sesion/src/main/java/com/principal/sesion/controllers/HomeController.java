package com.principal.sesion.controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;

@RestController // Solo APIs
public class HomeController {
    
    @GetMapping("/")
    public String root(HttpSession session) {
        Integer visitas;
        if(session.getAttribute("visitas")==null){//no hay cookie visita creada previamente
            visitas = 1;//asigna valor inicial
        }
        else{
            visitas = (Integer) session.getAttribute("visitas");//asigna nuevo valor
            visitas ++;
        }
        session.setAttribute("visitas", visitas);
        return "Gracias por visitar #" + visitas;
    }
    
}
