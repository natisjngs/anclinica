package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.EstadoPQRS;
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
    private int id_pqrs;

    @Lob
    @Column(nullable = false)
    private String detalle;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaCreacion;

    @Lob
    private String historialPqrs;

    @Column(nullable = false, length = 30)
    private EstadoPQRS estado;

    @OneToMany(mappedBy = "pqrs")
    private List<PQRS> pqrsList;

}


