package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.AdminDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

    List<AdminDTO> listarAdministradores();

    AdminDTO crearAdmin(AdminDTO adminDTO);
    AdminDTO actualizarAdmin(AdminDTO adminDTO, long id);
    void eliminarAdmin(long id);
    AdminDTO buscarAdmin(long id);
}