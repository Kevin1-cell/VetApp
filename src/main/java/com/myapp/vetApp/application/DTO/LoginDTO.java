package com.myapp.vetApp.application.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO {
    private Long id;
    private String usuario;
    private String contrasena;
}
