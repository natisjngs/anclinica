package co.edu.uniquindio.AnClinica.servicios.implementacion;

import co.edu.uniquindio.AnClinica.Repositorios.DiaLibreRepo;
import co.edu.uniquindio.AnClinica.dto.DiaLibreMedicoDTO;
import co.edu.uniquindio.AnClinica.modelo.entidades.Medico;
import co.edu.uniquindio.AnClinica.servicios.Interfaces.MedicoServicio;
import lombok.AllArgsConstructor;

import java.util.Optional;
@AllArgsConstructor
public class MedicoServicioImpl implements MedicoServicio {
    private final DiaLibreRepo diaLibreRepo;
    @Override
    public void listarCitasPendientes() {

    }

    @Override
    public void atenderCita() {

    }

    @Override
    public void listarCitasPaciente() {

    }

    @Override
    public void agendarDiaLibre() {

    }

    @Override
    public void listarCitasRealizadasMedico() {

    }

    @Override
    public void verDiaLibre(DiaLibreMedicoDTO diaLibreMedicoDTO, int codigo) throws Exception {
        //VALIDAR QUE EL DIA LIBRE NO COINCIDA CON CITAS AGENDADAS
        //COMPROBAR QUE DIALIBREMEDICOdto NO ESTE VACIO
        Optional<Medico> opcional = diaLibreRepo.findById(codigo);
        if (opcional.isEmpty()){
            throw new Exception("El medico con el codigo "+ codigo+ " No tiene día libre asignado");
        }

    }
}
