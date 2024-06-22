package com.principal.spring_data.services;

import org.springframework.stereotype.Service;

import com.principal.spring_data.models.Usuario;
import com.principal.spring_data.repositories.UsuarioRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario user){
        return usuarioRepository.save(user);
    }
    
}
