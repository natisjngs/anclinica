package co.edu.uniquindio.AnClinica.modelo.enums;

public enum TipoPQRS {

    PETICION("Petición"),
    QUEJA("Queja"),
    RECLAMO("Reclamo"),
    SUGERENCIA("Sugerencia");

    private final String tipoPQRS;

    TipoPQRS(String tipoPQRS) {
        this.tipoPQRS = tipoPQRS;
    }
}
