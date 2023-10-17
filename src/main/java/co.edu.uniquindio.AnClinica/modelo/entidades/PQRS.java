package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.EstadoPQRS;
import co.edu.uniquindio.AnClinica.modelo.enums.TipoPQRS;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaCreacion;

    @Column(nullable = false)
    private TipoPQRS tipoPQRS;

    @Lob
    @Column(nullable = false)
    private String motivo;

    @ManyToOne
    private Cita codigoCita;

    @Column(nullable = false, length = 30)
    private EstadoPQRS codigoEstadoPQRS;

    @OneToMany(mappedBy = "codigoPQRS")
    private List<Mensaje> mensajes;


}


