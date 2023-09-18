package co.edu.uniquindio.AnClinica.servicios;

public interface MedicoServicio {

    void listarCitasPendientes();

    void atenderCita();

    void listarCitasPaciente();

    void agendarDiaLibre();

    void listarCitasRealizadasMedico();
}
