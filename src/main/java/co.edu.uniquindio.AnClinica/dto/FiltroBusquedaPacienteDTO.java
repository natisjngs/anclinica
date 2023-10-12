package co.edu.uniquindio.AnClinica.dto;

import co.edu.uniquindio.AnClinica.modelo.enums.Alergias;
import co.edu.uniquindio.AnClinica.modelo.enums.Ciudad;
import co.edu.uniquindio.AnClinica.modelo.enums.EPS;
import co.edu.uniquindio.AnClinica.modelo.enums.TipoSangre;

import java.time.LocalDate;

public record FiltroBusquedaPacienteDTO(

        String identificacion,
        LocalDate fechaNacimiento,
        Alergias alergias,
        EPS eps,
        TipoSangre tipoSangre,
        Ciudad ciudadResidencia

) {
}
