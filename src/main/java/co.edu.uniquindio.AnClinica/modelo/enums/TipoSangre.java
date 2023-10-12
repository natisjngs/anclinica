package co.edu.uniquindio.AnClinica.modelo.enums;

public enum TipoSangre {

    APositivo("A+"),
    ANegativo("A-"),
    BPositivo("B+"),
    BNegativo("B-"),
    ABPositivo("AB+"),
    ABNegativo("AB-"),
    OPositivo("O-"),
    ONegativo("O-");

    private final String tipoSangre;

    TipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
}
