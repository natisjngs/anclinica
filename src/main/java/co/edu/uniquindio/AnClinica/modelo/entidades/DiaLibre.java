package co.edu.uniquindio.AnClinica.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DiaLibre implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private int codigo;
    @JoinColumn(nullable = false)
    private String dia;

    @JoinColumn(nullable = false)
    private LocalDateTime horaInicio;

    @JoinColumn(nullable = false)
    private LocalDateTime horaFin;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Medico medico;
}
