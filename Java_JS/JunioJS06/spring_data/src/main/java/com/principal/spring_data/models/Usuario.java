package com.principal.spring_data.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor //Crea el CONSTRUCTOR sin argumentos
public class Usuario {

    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private Date cumpleaños;
    private Boolean soltero;
    private Double estatura;
    
}
