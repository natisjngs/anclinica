package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.EstadoCita;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EstadisticaMedica implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false)
    private LocalDate fechaInicioConsulta;

    @Column(nullable = false)
    private LocalDateTime fechaFinConsulta;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private EstadoCita codigoEspecialidad;

}
