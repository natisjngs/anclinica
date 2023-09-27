package co.edu.uniquindio.AnClinica.modelo.entidades;

<<<<<<< HEAD
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
public class Mensaje implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private int codigoMensaje;

    @Column(nullable = false)
    private LocalDateTime fechaCreacion;

    @Lob
    @Column(nullable = false)
    private String mensaje;

    @JoinColumn(nullable = false)
    @ManyToOne
    private PQRS pqrs;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Cuenta cuenta;
=======
public class Mensaje {
>>>>>>> cba32989848c48c9269c6a34f509e09c38545a43

}
