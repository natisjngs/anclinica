package co.edu.uniquindio.AnClinica.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Column;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance (strategy = InheritanceType. JOINED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cuenta  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    @Column(nullable = false, unique = true, length = 80 )
    private String correo;

    @Column(nullable = false, length = 20)
    private String password;

    @OneToMany(mappedBy = "cuenta")
    private List<Mensaje> mensajes;


}
