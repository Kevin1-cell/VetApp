package com.myapp.vetApp.application.Service;


import com.myapp.vetApp.application.DTO.AdminDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final List<AdminDTO> administradores = new ArrayList<>();

    @Override
    public List<AdminDTO> listarAdministradores() {
        return administradores;
    }

    @Override
    public AdminDTO crearAdmin(AdminDTO adminDTO) {
        administradores.add(adminDTO);
        return adminDTO;
    }

    @Override
    public AdminDTO actualizarAdmin(AdminDTO adminDTO, long id) {
        return adminDTO;
    }

    @Override
    public void eliminarAdmin(long id) {
    }

    @Override
    public AdminDTO buscarAdmin(long id) {
        return null;
    }
}
