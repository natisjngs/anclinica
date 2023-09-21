package co.edu.uniquindio.AnClinica.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Medico extends Usuario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String cedula;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String ciudad;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 20)
    private String telefono;

    @Lob
    private String fotoPersonal;
}