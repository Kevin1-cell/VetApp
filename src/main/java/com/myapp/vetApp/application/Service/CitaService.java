package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.CitaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CitaService {

    List<CitaDTO> listarCitas();

    CitaDTO crearCita(CitaDTO citaDTO);
    CitaDTO actualizarCita(CitaDTO citaDTO, long id);
    void eliminarCita(long id);
    CitaDTO buscarCita(long id);
}

