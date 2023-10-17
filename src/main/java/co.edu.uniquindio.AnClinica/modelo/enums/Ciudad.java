package co.edu.uniquindio.AnClinica.modelo.enums;

public enum Ciudad {

    ARMENIA(001,"Armenia"),
    PEREIRA(002, "Pereira"),
    MANIZALES(003, "Manizales"),
    CALI(004, "Santiago de Cali"),
    CALARCA(005,"Cálarca");

    private final int codigo;
    private final String ciudad;

    Ciudad(int codigo, String ciudad) {
        this.codigo = codigo;
        this.ciudad = ciudad;
    }
}
