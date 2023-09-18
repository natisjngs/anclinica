package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.entidades.Cuenta;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Usuario extends Cuenta implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String id_usuario;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 40)
    private String email;


}
