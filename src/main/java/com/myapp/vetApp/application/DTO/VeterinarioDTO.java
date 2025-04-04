package com.myapp.vetApp.application.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class VeterinarioDTO extends UsuarioDTO {
    private String especialidad;
}