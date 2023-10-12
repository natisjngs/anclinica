package co.edu.uniquindio.AnClinica.dto;

import co.edu.uniquindio.AnClinica.modelo.enums.Ciudad;
import co.edu.uniquindio.AnClinica.modelo.enums.Especialidad;

import java.util.List;

public record InfoMedicoDTO(

        String nombre,
        String cedula,
        Ciudad codigoCiudad,
        Especialidad codigoEspecialidad,
        String telefono,
        String correo,
        List<HorarioMedicoDTO> horarios,
        String url

) {
}

