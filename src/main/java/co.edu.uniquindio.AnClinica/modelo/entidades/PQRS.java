package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.EstadoPQRS;
<<<<<<< HEAD
import co.edu.uniquindio.AnClinica.modelo.enums.TipoPQRS;
import jakarta.persistence.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
>>>>>>> cba32989848c48c9269c6a34f509e09c38545a43
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
<<<<<<< HEAD
    private EstadoPQRS estadoPQRS;

    @OneToMany(mappedBy = "pqrs")
    private List<PQRS> pqrs;
=======
    private EstadoPQRS estado;
>>>>>>> cba32989848c48c9269c6a34f509e09c38545a43

}


