package co.edu.uniquindio.AnClinica.dto;

import co.edu.uniquindio.AnClinica.modelo.enums.Especialidad;

public record MedicoDTOAdmin(

        int codigo,
        String nombre,
        String urlFoto,
        Especialidad especialidad




) {
}
