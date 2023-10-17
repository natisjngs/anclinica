package co.edu.uniquindio.AnClinica.modelo.enums;

public enum EstadoUsuario {
    ACTIVO(001, "Activo"),
    INACTIVO(002,"Inactivo");

    private final int codigo;
    private final String estadoUsuario;

    EstadoUsuario(int codigo, String estadoUsuario) {
        this.codigo = codigo;
        this.estadoUsuario = estadoUsuario;
    }
}
