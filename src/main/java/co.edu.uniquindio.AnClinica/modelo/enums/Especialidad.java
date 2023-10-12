package co.edu.uniquindio.AnClinica.modelo.enums;

public enum Especialidad {


    GENERAL(001,"General"),
    CARDIOLOGIA(002,"Cardiología"),
    PEDIATRIA(003,"Pedriatría"),
    DERMATOLOGIA(004,"Dermatología");

    private final int codigo;
    private final String especializacion;

    Especialidad(int codigo, String especializacion) {
        this.codigo = codigo;
        this.especializacion = especializacion;
    }
}
