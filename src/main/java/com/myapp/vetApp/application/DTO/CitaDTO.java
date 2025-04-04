package com.myapp.vetApp.application.DTO;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CitaDTO {
    private Long id;
    private LocalDateTime fecha;
    private String motivo;
    private Long mascotaId;
    private Long veterinarioId;
}
