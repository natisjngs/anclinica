package co.edu.uniquindio.AnClinica.modelo.entidades;
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
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaCreacionCita;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaCita;

    @Column(nullable = false, length = 30)
    private String motivo;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Paciente cedulaPaciente;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Medico codigoMedico;

    @JoinColumn(nullable = false)
    private EstadoCita codigoEstado;

    @JoinColumn(nullable = false)
    @OneToMany(mappedBy = "codigoCita")
    private List<PQRS> pqrs;

    @JoinColumn(nullable = false)
    @OneToOne(mappedBy = "codigoCita")
    private AtencionCita atencionCita;

    @JoinColumn(nullable = false)
    private EstadoCita estadoCita;
}


