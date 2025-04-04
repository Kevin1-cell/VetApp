package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.VeterinarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VeterinarioService {

    List<VeterinarioDTO> listarVeterinarios();

    VeterinarioDTO crearVeterinario(VeterinarioDTO veterinarioDTO);
    VeterinarioDTO actualizarVeterinario(VeterinarioDTO veterinarioDTO, long id);
    void eliminarVeterinario(long id);
    VeterinarioDTO buscarVeterinario(long id);
}
