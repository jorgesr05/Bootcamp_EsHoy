package com.principal.sesion.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class LoginController {

    @GetMapping("/login")
    public String getMethodName() {
        return "login.jsp";
    }
    
    @PostMapping("/login")
    public String postMethodName(@RequestParam("userInput") String user, @RequestParam("passwordInput") String password) {
        
        System.out.println(user);
        System.out.println(password);
        return "";
    }
    

    
}
