package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.VeterinarioDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VeterinarioServiceImpl implements VeterinarioService {

    private final List<VeterinarioDTO> veterinarios = new ArrayList<>();

    @Override
    public List<VeterinarioDTO> listarVeterinarios() {
        return veterinarios;
    }

    @Override
    public VeterinarioDTO crearVeterinario(VeterinarioDTO veterinarioDTO) {
        veterinarios.add(veterinarioDTO);
        return veterinarioDTO;
    }

    @Override
    public VeterinarioDTO actualizarVeterinario(VeterinarioDTO veterinarioDTO, long id) {
        return veterinarioDTO;
    }

    @Override
    public void eliminarVeterinario(long id) {
    }

    @Override
    public VeterinarioDTO buscarVeterinario(long id) {
        return null;
    }
}
