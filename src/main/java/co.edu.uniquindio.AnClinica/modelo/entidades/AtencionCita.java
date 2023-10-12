package co.edu.uniquindio.AnClinica.modelo.entidades;

import co.edu.uniquindio.AnClinica.modelo.enums.Especializacion;

import jakarta.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
public class AtencionCita implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 30)
    private int idAtencionCita;

    @Column(nullable = false, length = 30)
    private LocalDateTime fechaAtencion;

    @Column(nullable = false, length = 50)
    private Especializacion especializacion;

    @JoinColumn(nullable = false)
    @Lob()
    private String notasMedicas;

    @JoinColumn(nullable = false)    @Lob()
    private String diagnostico;

    @JoinColumn(nullable = false)
    @Lob()
    private String tratamiento;

    @JoinColumn(nullable = false)
    @OneToOne(mappedBy = "atencionCita")
    private Cita cita;
}