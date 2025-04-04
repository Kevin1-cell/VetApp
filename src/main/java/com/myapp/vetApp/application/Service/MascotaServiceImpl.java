package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.MascotaDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {

    private final List<MascotaDTO> mascotas = new ArrayList<>();

    @Override
    public List<MascotaDTO> listarMascotas() {
        return mascotas;
    }

    @Override
    public MascotaDTO crearMascota(MascotaDTO mascotaDTO) {
        mascotas.add(mascotaDTO);
        return mascotaDTO;
    }

    @Override
    public MascotaDTO actualizarMascota(MascotaDTO mascotaDTO, long id) {
        return mascotaDTO;
    }

    @Override
    public void eliminarMascota(long id) {
    }

    @Override
    public MascotaDTO buscarMascota(long id) {
        return null;
    }
}

