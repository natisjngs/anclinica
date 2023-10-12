package co.edu.uniquindio.AnClinica.servicios.implementacion;

import co.edu.uniquindio.AnClinica.dto.*;
import co.edu.uniquindio.AnClinica.modelo.entidades.HorarioMedico;
import co.edu.uniquindio.AnClinica.modelo.entidades.Medico;
import co.edu.uniquindio.AnClinica.servicios.Interfaces.AdministradorServicio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // INSTANCIA UN OBJETO SOLO CUANDO SEA REQUERIDO unicamente las clases que implementas
// las clases de los servicios

public class AdministradorServicioImpl implements AdministradorServicio {

    private MedicoDTO medicoRepo;
    @Override
    public String crearMedico(MedicoDTO medicoDTO) throws Exception {

            Medico medico = new Medico();
            medico.setCedula(medicoDTO.cedula());
            medico.setTelefono(medicoDTO.telefono());
            medico.setNombre(medicoDTO.nombre());
            medico.setCodigoEspecialidad(medicoDTO.codigoEspecialidad());
            medico.setCiudad(medicoDTO.codigoCiudad());
            medico.setCorreo(medicoDTO.correo());
            medico.setPassword(medicoDTO.password());
            //medico.setUrlFoto(medicoDTO.);
        //medico.setEstado


        return medicoNuevo.getCodigo;
    }

    private void asignarHorarioMedico (Medico medicoNuevo, List<HorarioMedicoDTO> horarioMedicoDTOS);


    for (HorarioMedicoDTO h: horarios){
        HorarioMedico hm = new HorarioMedico();
        hm.setdiaCita (h.dia());
        hm.setHoraInicio ( h.horarioInicio());
        hm.setHoraFin ( h.horarioSalida());
        hm.setMedico( medicoNuevo);

        horar

    }
    @Override
    public String actualizarMedico(int codigo, MedicoDTO medico) throws Exception {
        return null;
    }

    @Override
    public String eliminarMedico(int codigo) throws Exception {
      /* select* from medico wher codigo
      Optional<Medico> buscado  = medicoRepo.findById(codigo);
      if (buscado.isEmpty()){
      throw new Exception( "el codigo" + codigo+ no existe");
      }
      medico.delete(buscado.get());

        */
        return null;
    }

    @Override
    public List<MedicoDTOAdmin> listarMedicos() throws Exception {
        return null;
    }

    @Override
    public InfoMedicoDTO obtenerMedico(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<PQRSDTOAdmin> listarPQRS() throws Exception {
        return null;
    }

    @Override
    public String responderPQRS(int codigo) throws Exception {
        return null;
    }

    @Override
    public InfoPQRSDTO verDetallePQRS(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<CitaDTOAdmin> listarCitas() throws Exception {
        return null;
    }

    @Override
    public int obtenerEstadisticaEspecilaidad() {
        return 0;
    }

    @Override
    public String editarEstadoPQRS(InfoPQRSDTO infoPQRSDTO) {
        return null;
    }

}
