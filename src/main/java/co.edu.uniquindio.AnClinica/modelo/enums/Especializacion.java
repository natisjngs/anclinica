package co.edu.uniquindio.AnClinica.modelo.enums;

public enum Especializacion {


    GENERAL("General"),
    CARDIOLOGIA("Cardiología"),
    PEDIATRIA("Pedriatría"),
    DERMATOLOGIA("Dermatología");

    private final String especializacion;

    Especializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
