package com.ejemplo.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	@RequestMapping("/")
	public String hola(){
		return "Hola mundo";
	}
	
	@GetMapping("/bienvenida")
	public String bienvenida() {
		return "Todos son bienvenidos a desarrollar";
	}
	
}
