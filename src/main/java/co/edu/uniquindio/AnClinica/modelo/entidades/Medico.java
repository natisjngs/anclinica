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

    @Column(nullable = false)
    private int codigoMedico;

    @Column(nullable = false)
    private Especializacion especializacion;

    @OneToMany(mappedBy = "medico")
    private List<Cita> Citas;

    @JoinColumn(nullable = false)
    @OneToMany(mappedBy = "medico")
    private List<DiaLibre> diaLibres;
}