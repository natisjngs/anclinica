package co.edu.uniquindio.AnClinica.modelo.enums;

public enum Alergias {

    ASMA("Asma"),
    DERMATITIS_ATOPICA("Dermatitis Atópica"),
    POLIPOSIS_NASAL("Poliposis Nasal"),
    RINITIS("Rinitis"),
    URTICARIA("Urticaria");

    RINITIS("Renitis"),
    URTICARIA("Urticaria");

    private final String nombre;
    Alergias(String nombre) {
        this.nombre = nombre;
    }
}
