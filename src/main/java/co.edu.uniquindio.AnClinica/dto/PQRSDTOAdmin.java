package co.edu.uniquindio.AnClinica.dto;

import co.edu.uniquindio.AnClinica.modelo.enums.Ciudad;
import co.edu.uniquindio.AnClinica.modelo.enums.EPS;
import co.edu.uniquindio.AnClinica.modelo.enums.TipoSangre;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public record PQRSDTOAdmin(

        String nombre,
        String identificacion,
        LocalDate fechaNacimiento,
        EPS eps,
        TipoSangre tipoSangre,
        Ciudad ciudadResidencia

) {
}
