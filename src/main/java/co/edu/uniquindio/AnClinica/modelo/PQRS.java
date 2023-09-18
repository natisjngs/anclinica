package co.edu.uniquindio.AnClinica.modelo;

import co.edu.uniquindio.AnClinica.modelo.estadoPqrs;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

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

    @Lob()
    private String detalle;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaCreacion;

    @Lob
    private String historialPqrs;

    @Column(nullable = false, length = 30)
    private estadoPqrs estado;



}


