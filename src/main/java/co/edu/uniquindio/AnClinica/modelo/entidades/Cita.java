package co.edu.uniquindio.AnClinica.modelo.entidades;
import co.edu.uniquindio.AnClinica.modelo.enums.Especializacion;
import co.edu.uniquindio.AnClinica.modelo.enums.EstadoCita;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cita implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int codigoCita;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaCreacionCita;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaCita;

    @Column(nullable = false, length = 30)

    private String motivo;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Paciente paciente;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Medico medico;

    @JoinColumn(nullable = false)
    @OneToMany(mappedBy = "Cita")
    private List<PQRS> pqrs;

    @JoinColumn(nullable = false)
    @OneToOne(mappedBy = "cita")
    private AtencionCita atencionCita;

    @JoinColumn(nullable = false)
    private EstadoCita estadoCita;
}


