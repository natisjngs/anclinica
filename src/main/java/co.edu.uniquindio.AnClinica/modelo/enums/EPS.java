package co.edu.uniquindio.AnClinica.modelo.enums;

public enum EPS {
    SOS(001,"SOS"),
    SALUDTOTAL(002, "SaludTotal"),
    SURA(003, "SURA"),
    MEDIMAS(004, "MEDIMAS"),
    COOMEVA(005, "COOMEVA");

    private final int codido;
    private final String nombreEps;
    EPS(int codigo, String nombreEps) {
        this.codido = codigo;
        this.nombreEps = nombreEps;
    }
}