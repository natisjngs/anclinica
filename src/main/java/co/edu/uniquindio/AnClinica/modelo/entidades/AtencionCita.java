package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.Especializacion;
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
public class AtencionCita implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 30)
    private int idAtencionCita;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaAtencion;

    @Column(nullable = false, length = 50)
    private Especializacion especializacion;

    @Lob()
    private String notasMedicas;

    @Lob()
    private String diagnostico;

    @Lob()
    private String tratamiento;

    @OneToOne
    private Cita cita;


}
