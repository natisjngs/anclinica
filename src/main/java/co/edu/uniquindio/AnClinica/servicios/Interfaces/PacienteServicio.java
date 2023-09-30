package co.edu.uniquindio.AnClinica.servicios.Interfaces;

public interface PacienteServicio {
    void registrarse ();

    void eliminarCuenta();

    void editarInformacion();

    void cambiarPassword();

    void crearCitaMedica();

    void listarMedico();

    void enviarLinkRecuperacion();

    void listarEspecializacion();

    void crearPQRS();

    void responderPQRS();

    void agregarImagen();

    void listarAlergias();

    void listarPQRS();

    void listarCitasPacientes();

    void filtrarCitasFechaYMedico();

    void verDetalleCita();

    void listarPQRSPaciente();
}
