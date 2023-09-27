package co.edu.uniquindio.AnClinica.modelo.entidades;
import co.edu.uniquindio.AnClinica.modelo.enums.Especializacion;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

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

    private Especializacion especializacion;



}


