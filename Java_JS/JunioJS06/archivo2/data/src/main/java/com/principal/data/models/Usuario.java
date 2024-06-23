package com.principal.data.models;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //nos genera la entidad para MySQL
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @NotNull
    @Size(min=8,max=8)
    private String dni;

    @NotNull
    @Size(min=2,max=200)
    private String nombre;

    @NotNull
    @Size(min=2,max=200)
    private String apellido;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min=9,max=9)
    private String telefono;

    @NotNull
    @Past
    private Date cumpleaños;

    @NotNull
    private Boolean soltero;

    @NotNull
    @Min((long) 40.0)
    @Max((long) 260.0)
    private Double estatura;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    

    /* CREACION Y ACTUALIZACION DE FECHAS */
    @PrePersist //antes de guardar
    protected void onCreate(){
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
    @PreUpdate //antes de actualizar
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
