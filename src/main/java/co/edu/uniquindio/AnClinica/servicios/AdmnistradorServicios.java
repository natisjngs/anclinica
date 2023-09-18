package co.edu.uniquindio.AnClinica.servicios;

import co.edu.uniquindio.AnClinica.dto.MedicoDTO;
import co.edu.uniquindio.AnClinica.modelo.Medico;

public interface AdmnistradorServicios {

   void crearMedico( MedicoDTO medico ) ;
    void actualizarMedico(int id_medico, MedicoDTO medico );

    void eliminarMedico(int id_medico);

    void listarMedico();

    void obtenerMedico();
}
