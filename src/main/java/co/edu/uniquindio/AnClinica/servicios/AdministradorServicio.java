package co.edu.uniquindio.AnClinica.servicios;


import co.edu.uniquindio.AnClinica.dto.*;

import java.util.List;

public interface AdministradorServicio {
    String crearMedico(MedicoDTO medico) throws Exception;

    String actualizarMedico(int codigo, MedicoDTO medico) throws Exception;

    String eliminarMedico(int codigo) throws Exception;

    List<MedicoDTOAdmin> listarMedicos() throws Exception;

    InfoMedicoDTO obtenerMedico(int codigo) throws Exception;

    List<PQRSDTOAdmin> listarPQRS() throws Exception;

    String responderPQRS(int codigo) throws Exception;

    InfoPQRSDTO verDetallePQRS(int codigo) throws Exception;

    List<CitaDTOAdmin> listarCitas() throws Exception;

<<<<<<< HEAD
    int obtenerEstadisticaEspecilaidad();
=======
    List<EstadisticaDTOEspecialidad> obtenerEstadisticaEspecilaidad() throws Exception;
>>>>>>> cba32989848c48c9269c6a34f509e09c38545a43

    String editarEstadoPQRS(InfoPQRSDTO infoPQRSDTO);

}
