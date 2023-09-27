package co.edu.uniquindio.AnClinica.modelo.entidades;

<<<<<<< HEAD

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

public class HorarioMedico implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private int codigo;

    @Column(nullable = false)
    private String dia; // Se puede utilizar LocalDateTime, consultar a Rojo

    @Column(nullable = false)
    private LocalDateTime horaInicio;

    @Column(nullable = false)
    private LocalDateTime horaFin;
=======
public class HorarioMedico {

>>>>>>> cba32989848c48c9269c6a34f509e09c38545a43
}
