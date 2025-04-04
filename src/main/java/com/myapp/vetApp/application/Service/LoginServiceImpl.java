package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.LoginDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    private final List<LoginDTO> usuarios = new ArrayList<>();

    @Override
    public LoginDTO crearUsuario(LoginDTO loginDTO) {
        usuarios.add(loginDTO);
        return loginDTO;
    }

    @Override
    public LoginDTO verificarLogin(String usuario, String contrasena) {
        return usuarios.stream()
                .filter(u -> u.getUsuario().equals(usuario) && u.getContrasena().equals(contrasena))
                .findFirst()
                .orElse(null);
    }
}
