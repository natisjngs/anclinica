package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.Especializacion;
<<<<<<< HEAD
import jakarta.persistence.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
>>>>>>> cba32989848c48c9269c6a34f509e09c38545a43
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
<<<<<<< HEAD

    @OneToOne
    private Cita cita;


=======
>>>>>>> cba32989848c48c9269c6a34f509e09c38545a43
}
