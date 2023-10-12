package co.edu.uniquindio.AnClinica.dto;

import co.edu.uniquindio.AnClinica.modelo.enums.Alergias;
import co.edu.uniquindio.AnClinica.modelo.enums.EPS;
import co.edu.uniquindio.AnClinica.modelo.enums.TipoSangre;

import java.time.LocalDate;

public record PacienteDTO(

        String  cedula,
        String nombre,
        LocalDate fechaNaciiento,
        Alergias alergias,
        TipoSangre tipoSangre,
        EPS eps

        ) {




}
