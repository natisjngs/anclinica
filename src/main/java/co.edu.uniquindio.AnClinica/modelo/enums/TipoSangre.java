package co.edu.uniquindio.AnClinica.modelo.enums;

public enum TipoSangre {

    APOSITIVO(000,"A+"),
    ANEGATIVO(001,"A-"),
    BPOSITIVO(002,"B+"),
    BNEGATIVO(003,"B-"),
    ABPOSITIVO(004,"AB+"),
    ABNEGATIVO(005,"AB-"),
    OPOSITIVO(006, "O-"),
    ONEGATIVO(007, "O-");

    private final int codigo;
    private final String tipoSangre;

    TipoSangre(int codigo, String tipoSangre) {
        this.codigo = codigo;
        this.tipoSangre = tipoSangre;
    }
}
