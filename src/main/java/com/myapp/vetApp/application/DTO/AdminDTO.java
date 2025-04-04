package com.myapp.vetApp.application.DTO;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AdminDTO extends UsuarioDTO{
    private double sueldo;
}
