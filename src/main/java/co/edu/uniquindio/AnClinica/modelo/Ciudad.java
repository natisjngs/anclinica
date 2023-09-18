package co.edu.uniquindio.AnClinica.modelo;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

public enum Ciudad {

    Armenia("Armenia"),
    Pereira("Pereira"),
    Manizales("Manizales"),
    Cali("Santiago de Cali"),
    Bucaramanga("Bucaramanga"),
    Barranquilla("Barranquilla"),
    Calarca("Calarcá"),
    Cartagena("Cartagena");
    private final String name;

    Ciudad(String name) {
        this.name = name;
    }
}
