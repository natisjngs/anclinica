package co.edu.uniquindio.AnClinica;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class pqrs implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id_pqrs;

    @Getter
    private String nombre;

    private String ciudad;

    private String email, telefono;

}