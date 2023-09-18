package co.edu.uniquindio.AnClinica.modelo;
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
    private String id;

    @Column(nullable = false, length = 30)
    private LocalDateTime horaI;

    @Column(nullable = false, length = 30)
    private LocalDateTime horaF;

    @Column(nullable = false, length = 30)
    private co.edu.uniquindio.AnClinica.modelo.especializacion especializacion;


}


