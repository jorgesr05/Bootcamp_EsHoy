package com.ejemplo.demo1.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    /* Parametros de consulta */
    @GetMapping("/productos")
    public String homeProductos(@RequestParam(value ="item") String item, @RequestParam(value = "talla")int talla,@RequestParam(value = "color")String color) {
        
        return "Estás buscando " +item + " de talla "+talla+" en "+color;
    }
    
    @GetMapping("/mascotas")
    public String homeMascotas(@RequestParam(value="sexo", required = false) String sexo, @RequestParam(value ="especie", required = false) String especie, @RequestParam(value ="edad", required = false) Integer edad) {
        
        return "Estás buscando "+ especie + " de genero "+ sexo + " de "+edad+" años";
    }
    
    /* Variables de ruta */
    @GetMapping("/versiculo/{libro}")
    public String homeBiblia(@PathVariable("libro") String libro){
        return "Estás buscando "+ libro;
    }

    @GetMapping("/versiculo/{libro}/{capitulo}")
    public String homeBiblia(@PathVariable("libro") String libro, @PathVariable("capitulo") Integer capitulo){
        return "Estás buscando "+ libro + " capitulo "+ capitulo;
    }
    
    @GetMapping("/versiculo/{libro}/{capitulo}/{versiculos}")
    public String homeBiblia(@PathVariable("libro") String libro, @PathVariable("capitulo") Integer capitulo, @PathVariable("versiculos") String versiculos){
        return "Estás buscando "+ libro + " capitulo "+ capitulo + " versiculos "+ versiculos;
    }
    
    

}
