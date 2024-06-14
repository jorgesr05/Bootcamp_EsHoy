package com.principal.review_plantillas.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class HomeController {

    @GetMapping("/")
    public String root(Model model) {
        String saludo="Hola amiguitos";
        model.addAttribute("saludo", saludo);
        return "index.jsp";
    }

    @GetMapping("/estudiantes")
    public String getMethodName(Model model) {

        ArrayList <String> listaEstudiantes = new ArrayList<String>();
        listaEstudiantes.add("Max");
        listaEstudiantes.add("Alex");
        listaEstudiantes.add("Diego");
        listaEstudiantes.add("Luisa");
        listaEstudiantes.add("Josefina");
        listaEstudiantes.add("Martina");
        listaEstudiantes.add("Juan");
        listaEstudiantes.add("Jorge");
        String perro ="Wow";
        perro.length();

        model.addAttribute("listaEstudiantes", listaEstudiantes);
        return "estudiantes.jsp";
    }
    
    
    
}
