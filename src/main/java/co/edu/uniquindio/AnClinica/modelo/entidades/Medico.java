package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.Especializacion;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Medico extends Usuario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
<<<<<<< HEAD
    @Column(nullable = false)
    private int codigoMedico;

    @Column(nullable = false)
    private Especializacion especializacion;

    @OneToMany(mappedBy = "medico")
    private List<Cita> listaCitas;

=======
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
>>>>>>> cba32989848c48c9269c6a34f509e09c38545a43
}