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



}
