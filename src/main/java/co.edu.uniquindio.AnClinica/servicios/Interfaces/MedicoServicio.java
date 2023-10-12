package co.edu.uniquindio.AnClinica.servicios.Interfaces;

import co.edu.uniquindio.AnClinica.dto.DiaLibreMedicoDTO;

public interface MedicoServicio {

    void listarCitasPendientes();

    void atenderCita();

    void listarCitasPaciente();

    void agendarDiaLibre();

    void listarCitasRealizadasMedico();
    void verDiaLibre(DiaLibreMedicoDTO diaLibreMedicoDTO, int codigo) throws Exception;
}
