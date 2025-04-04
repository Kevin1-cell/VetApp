package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.CitaDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    private final List<CitaDTO> citas = new ArrayList<>();

    @Override
    public List<CitaDTO> listarCitas() {
        return citas;
    }

    @Override
    public CitaDTO crearCita(CitaDTO citaDTO) {
        citas.add(citaDTO);
        return citaDTO;
    }

    @Override
    public CitaDTO actualizarCita(CitaDTO citaDTO, long id) {
        return citaDTO;
    }

    @Override
    public void eliminarCita(long id) {
    }

    @Override
    public CitaDTO buscarCita(long id) {
        return null;
    }
}
