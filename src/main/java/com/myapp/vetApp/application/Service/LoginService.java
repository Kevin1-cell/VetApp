package com.myapp.vetApp.application.Service;

import com.myapp.vetApp.application.DTO.LoginDTO;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoginService {

    LoginDTO crearUsuario(LoginDTO loginDTO);
    LoginDTO verificarLogin(String usuario, String contrasena);
}
