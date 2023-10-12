package co.edu.uniquindio.AnClinica.modelo.enums;

public enum EstadoCita {

    PROGRAMADA(001,"Programada"),
    COMPLETADA(002,"Completada"),
    CANCELADA(003,"Cancelada"),
    PENDIENTE(004,"Pendiente");

    private final int codigo;
    private final String estadoCita;

    EstadoCita(int codigo,String estadoCita) {
        this.codigo = codigo;
        this.estadoCita = estadoCita;
    }
}
