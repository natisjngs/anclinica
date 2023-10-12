package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.Especialidad;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@DiscriminatorValue("medico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medico extends Usuario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false)
    private Especialidad codigoEspecialidad;

    @OneToMany(mappedBy = "codigoMedico")
    private List<Cita> citas;

    @Column(nullable = false)
    private LocalDateTime horaInicio;

    @Column(nullable = false)
    private LocalDateTime horaFin;

    @OneToMany(mappedBy = "codigoMedico")
    private List<DiaLibre> diaLibres;

    @OneToMany(mappedBy = "codigoMedico")
    private List<HorarioMedico> horarioMedicos;
}