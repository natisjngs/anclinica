package co.edu.uniquindio.AnClinica.modelo.entidades;

import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

public class DiaLibre implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private int codigoDía;

    private String dia;

}
