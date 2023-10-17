package co.edu.uniquindio.AnClinica.modelo.enums;

public enum Alergias {

    ASMA(001,"Asma"),
    DERMATITIS_ATOPICA(002,"Dermatitis Atópica"),
    POLIPOSIS_NASAL(003 ,"Poliposis Nasal"),
    RINITIS(004, "Rinitis"),
    URTICARIA(005,"Urticaria");
    private final int codigo;
    private final String alergias;
    Alergias(int codigo, String alergias) {
        this.alergias = alergias;
        this.codigo = codigo;
    }
}
