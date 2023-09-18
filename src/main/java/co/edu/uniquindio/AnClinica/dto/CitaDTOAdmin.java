package co.edu.uniquindio.AnClinica.dto;

import java.time.LocalDateTime;

public record CitaDTOAdmin(
     int codigoCita,
     String nombtrePaciente,
     String nombreMedico,
     LocalDateTime fecha,
     String motivo
) {
}
