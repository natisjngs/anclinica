package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.Alergias;
import co.edu.uniquindio.AnClinica.modelo.enums.EPS;
import co.edu.uniquindio.AnClinica.modelo.enums.TipoSangre;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente extends Usuario implements Serializable  {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false)
    private LocalDate fechaNacimiento;

    private Alergias alergias;

    @JoinColumn(nullable = false)
    private EPS codigoEPS;

    @JoinColumn(nullable = false)
    private TipoSangre codigoTipoSangre;

    @OneToMany(mappedBy = "cedulaPaciente")
    private List<Cita> citas;

}

