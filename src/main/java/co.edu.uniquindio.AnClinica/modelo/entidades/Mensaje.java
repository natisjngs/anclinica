package co.edu.uniquindio.AnClinica.modelo.entidades;

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
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false)
    private LocalDateTime fechaCreacion;

    @Lob
    @Column(nullable = false)
    private String mensaje;

    @JoinColumn(nullable = false)
    @ManyToOne
    private PQRS codigoPQRS;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Cuenta codigoCuenta;

    @OneToOne
    private Mensaje codigoMensaje;

}
