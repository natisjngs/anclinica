package co.edu.uniquindio.AnClinica.modelo.enums;

public enum EstadoPQRS {
    ESPERA(001,"En espera"),
    ENVIADO(002,"Enviado"),
    CANCELADO(003, "Cancelado"),
    FINALIZADO(004,"Finalizado");

    private final int codigo;
    private final String nombre;

    EstadoPQRS(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}
