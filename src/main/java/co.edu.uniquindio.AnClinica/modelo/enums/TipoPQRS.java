package co.edu.uniquindio.AnClinica.modelo.enums;

public enum TipoPQRS {

    PETICION(001,"Petición"),
    QUEJA(002,"Queja"),
    RECLAMO(003,"Reclamo"),
    SUGERENCIA(004,"Sugerencia");

    private final int codigo;
    private final String tipoPQRS;

    TipoPQRS(int codigo, String tipoPQRS) {
        this.codigo = codigo;
        this.tipoPQRS = tipoPQRS;
    }
}
