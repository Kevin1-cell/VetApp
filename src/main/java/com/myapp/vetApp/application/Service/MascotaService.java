package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.MascotaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MascotaService {

    List<MascotaDTO> listarMascotas();

    MascotaDTO crearMascota(MascotaDTO mascotaDTO);
    MascotaDTO actualizarMascota(MascotaDTO mascotaDTO, long id);
    void eliminarMascota(long id);
    MascotaDTO buscarMascota(long id);
}