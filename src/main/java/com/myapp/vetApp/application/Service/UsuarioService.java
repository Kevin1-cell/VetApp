package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.UsuarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    List<UsuarioDTO> listarUsuarios();

    UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO actualizarUsuario(UsuarioDTO usuarioDTO, long id);
    void eliminarUsuario(long id);
    UsuarioDTO buscarUsuario(long id);
}
