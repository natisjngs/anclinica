package co.edu.uniquindio.AnClinica.modelo.enums;

public enum EstadoPQRS {
    NUEVO("Nuevo"),
    EN_PROCESO("En proceso"),
    RESUELTO("Resuelto"),
    ARCHIVADO("Archivado");

    private final String nombre;

    EstadoPQRS(String nombre) {
        this.nombre = nombre;
    }

}
