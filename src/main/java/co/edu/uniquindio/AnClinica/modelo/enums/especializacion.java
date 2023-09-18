package co.edu.uniquindio.AnClinica.modelo.enums;

public enum especializacion {


    GENERAL("General"),
    CARDIOLOGIA("Cardiología"),
    PEDIATRIA("Pedriatría"),
    DERMATOLOGIA("Dermatología");

    private final String especializacion;

    especializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
