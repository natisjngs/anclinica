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
public class usuario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String email;

    private String contrasena;


}