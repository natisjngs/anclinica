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

<<<<<<< HEAD
    private String cedula;
=======
    @Column(nullable = false)
    private LocalDateTime horaInicio;
>>>>>>> 5629fda53b4721b004ad8c07f3dac9554283d099

    @Column(nullable = false)
    private LocalDateTime horaFin;

    @OneToMany(mappedBy = "codigoMedico")
    private List<DiaLibre> diaLibres;

<<<<<<< HEAD
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 20)
    private String telefono;

    @Lob
    private String fotoPersonal;
=======
    @OneToMany(mappedBy = "codigoMedico")
    private List<HorarioMedico> horarioMedicos;
>>>>>>> 5629fda53b4721b004ad8c07f3dac9554283d099
}