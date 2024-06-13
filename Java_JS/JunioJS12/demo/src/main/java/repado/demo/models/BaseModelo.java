package repado.demo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

public class BaseModelo {

    /* Llave primaria */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    /* Timestamps */
    @Column(updatable = false)
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateddAt;

    /* Función para previo al guardado */
    @PrePersist
    protected void onCreate(){
        this.updateddAt = new Date();
    }
}


