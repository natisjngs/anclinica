package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.Alergias;
import co.edu.uniquindio.AnClinica.modelo.enums.EPS;
import co.edu.uniquindio.AnClinica.modelo.enums.TipoSangre;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;
import jakarta.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Paciente extends Usuario implements Serializable  {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private int codigoPaciente;

    private Alergias alergias;

    @Column(nullable = false)
    private EPS eps;

    @Column(nullable = false)
    private TipoSangre tipoSangre;

    @Column(nullable = false)
    private LocalDateTime fechaNacimiento;

    @OneToMany(mappedBy = "paciente")
    private List<Cita> listaCitas;

}

