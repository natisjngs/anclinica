package co.edu.uniquindio.AnClinica.modelo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

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
    private int id_cita;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaAtencion;

    @Column(nullable = false, length = 50)
    private co.edu.uniquindio.AnClinica.modelo.enums.especializacion especializacion;

    @Lob()
    private String notasMedicas;

    @Lob()
    private String diagnostico;

    @Lob()
    private String tratamiento;




}
