package com.myapp.vetApp.application.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO extends UsuarioDTO {
    private String direccion;
}
