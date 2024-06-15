package com.principal.sesion.controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @PostMapping("/")
    public String loginPost(@RequestParam("userInput") String user, @RequestParam("passwordInput")String password) {
        
        System.out.println(user);
        System.out.println(password);
        
        return "Account ok";
    }
    
    
}
