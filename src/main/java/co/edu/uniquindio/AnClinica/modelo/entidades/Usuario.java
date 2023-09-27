package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.entidades.Cuenta;
import co.edu.uniquindio.AnClinica.modelo.enums.Ciudad;
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
    @Column(nullable = false)
    private int codigoUsuario;

    @Column(nullable = false, length = 10)
    private String cedula;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(length = 15)
    private String telefono;

    @Lob
    @Column(nullable = false)
    private String urlFoto;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 40)
    private String email;

    @Column(nullable = false)
    private Ciudad ciudad;


}
