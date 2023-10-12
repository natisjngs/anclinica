package co.edu.uniquindio.AnClinica.modelo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Imagen implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false, length = 30)
    private String nombreImagen;

}
