package co.edu.uniquindio.AnClinica.modelo.enums;

public enum EstadoCita {

    PROGRAMADA("Programada"),
    COMPLETADA("Completada"),
    CANCELADA("Cancelada"),
    PENDIENTE("Pendiente");

    private final String nombre;

    EstadoCita(String nombre) {
        this.nombre = nombre;
    }
}
