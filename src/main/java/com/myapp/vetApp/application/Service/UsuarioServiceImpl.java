package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.UsuarioDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final List<UsuarioDTO> usuarios = new ArrayList<>();

    @Override
    public List<UsuarioDTO> listarUsuarios() {
        return usuarios;
    }

    @Override
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
        usuarios.add(usuarioDTO);
        return usuarioDTO;
    }

    @Override
    public UsuarioDTO actualizarUsuario(UsuarioDTO usuarioDTO, long id) {
        return usuarioDTO;
    }

    @Override
    public void eliminarUsuario(long id) {
    }

    @Override
    public UsuarioDTO buscarUsuario(long id) {
        return null;
    }
}

