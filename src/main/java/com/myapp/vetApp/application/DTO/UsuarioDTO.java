package com.myapp.vetApp.application.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String correo;
    private String telefono;
    private String fechaNacimiento;
    private Long loginId;
}