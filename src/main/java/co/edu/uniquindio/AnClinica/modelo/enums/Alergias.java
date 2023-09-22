package co.edu.uniquindio.AnClinica.modelo.enums;

public enum Alergias {

    ASMA("Asma"),
    DERMATITIS_ATOPICA("Dermatitis Atópica"),
    POLIPOSIS_NASAL("Poliposis Nasal"),
    RINITIS("Rinitis"),
    URTICARIA("Urticaria");


    Alergias(String nombre) {
        this.nombre = nombre;
    }
}
