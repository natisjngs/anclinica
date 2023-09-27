package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.EstadoPQRS;
import co.edu.uniquindio.AnClinica.modelo.enums.TipoPQRS;
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

public class PQRS implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private int id_PQRS;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaCreacion;

    private TipoPQRS tipoPQRS;

    @Lob
    @Column(nullable = false)
    private String motivo;

    @Column(nullable = false, length = 30)
    private EstadoPQRS estadoPQRS;

    @OneToMany(mappedBy = "pqrs")
    private List<PQRS> pqrs;

}


