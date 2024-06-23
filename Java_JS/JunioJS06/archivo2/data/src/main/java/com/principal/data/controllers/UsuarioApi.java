package com.principal.data.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.principal.data.models.Usuario; //tiene que ir
import com.principal.data.services.UsuarioService;

import lombok.AllArgsConstructor;

import java.util.Date; //tiene que ir
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioApi {
    private final UsuarioService usuarioService;

        @GetMapping("")
        public List<Usuario> getUsuarios(){
            return usuarioService.getUsuarios();
        } //para mostrar los nombres en el Postman

        @GetMapping("/{id}")
        public Usuario getUsuarioById(@PathVariable("id") Long id){
            return usuarioService.getUsuarioById(id);
        }

   /*  @PostMapping("")
    public String createUser() {
        
        Usuario jorge = new Usuario(null,"70615471","Jorge","Sanchez","jorge@outlook.com","575757570",new Date("1993/05/15"),false,169.0,null, null);

		System.out.println(jorge);
        usuarioService.createUsuario(jorge); 

        return "CREATED"; */
        @PostMapping("")
        public Usuario createUsuario(@RequestParam("dni") String dni,@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido, @RequestParam("email") String email,@RequestParam("telefono") String telefono, @RequestParam("cumpleaños") String cumpleaños, @RequestParam("soltero") Boolean soltero, @RequestParam("estatura") String estatura){

        Usuario usuario = new Usuario(null, dni, nombre, apellido, email, telefono, new Date(cumpleaños), soltero, Double.parseDouble(estatura),null, null, null);//ojo con cumpleaños y estatura, ya que ducho formatos se modifican
        
        //OPCIO 1
        /* Usuario usuario= new Usuario();
        usuario.setDni(dni);
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setEmail(email);
        usuario.setTelefono(telefono);
        usuario.setCumpleaños(cumpleaños);
        usuario.setSoltero(soltero);
        usuario.setEstatura(estatura); */

        return usuarioService.createUsuario(usuario);//si coloco una función en 'return' la funcioón cambia de 'String' a 'Usuario'
        
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable("id") Long id, @RequestParam("dni") String dni, @RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido, @RequestParam("email") String email,@RequestParam("telefono") String telefono, @RequestParam("cumpleaños") String cumpleaños, @RequestParam("soltero") Boolean soltero, @RequestParam("estatura") String estatura){
        

        Usuario usuario = new Usuario(id, dni, nombre, apellido, email, telefono, new Date(cumpleaños), soltero, Double.parseDouble(estatura),null, null, null);
        
        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable("id") Long id){
        usuarioService.deleteUsuario(id);
    }




} 

