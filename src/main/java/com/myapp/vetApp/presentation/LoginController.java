package com.myapp.vetApp.presentation;

import com.myapp.vetApp.application.DTO.LoginDTO;
import com.myapp.vetApp.application.Service.LoginService;
import lombok.*;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/logins")
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/crear")
    public LoginDTO crearLogin(@RequestBody LoginDTO loginDTO) {
        return loginService.crearUsuario(loginDTO);
    }

    @PostMapping("/verificar")
    public LoginDTO verificarLogin(@RequestBody LoginDTO loginDTO) {
        return loginService.verificarLogin(loginDTO.getUsuario(), loginDTO.getContrasena());
    }

    @GetMapping("/pruebita")
    public String pruebita(){
        return "Está funcionando Login AHHHHHHHH :D";
    }
}
