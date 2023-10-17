package co.edu.uniquindio.AnClinica.dto;

import co.edu.uniquindio.AnClinica.modelo.enums.EstadoPQRS;

import java.time.LocalDate;
import java.util.List;

public record InfoPQRSDTO(

        String codigo,
        EstadoPQRS estado,
        String motivo,
        String nombrePaciente,
        LocalDate fecha,
        List<String>mensajes
) {
}
