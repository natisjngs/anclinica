package co.edu.uniquindio.AnClinica.modelo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import jakarta.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DiaLibre implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false)
    private LocalDate diaLibre;

    //////////////////////////////////////////////////////////////////////////////////////////////

    @ManyToOne
    private Medico codigoMedico;

}
