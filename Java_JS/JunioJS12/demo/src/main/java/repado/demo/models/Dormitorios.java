package repado.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dormitorios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dormitorios extends BaseModelo {

    @NotNull
    @Size(min = 2)
    private String nombre;
    
}
