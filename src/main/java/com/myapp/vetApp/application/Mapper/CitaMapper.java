package com.myapp.vetApp.application.Mapper;

import com.myapp.vetApp.application.DTO.CitaDTO;
import com.myapp.vetApp.application.DTO.VeterinarioDTO;
import com.myapp.vetApp.domain.entity.Cita;
import com.myapp.vetApp.domain.entity.Veterinario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CitaMapper {
    CitaMapper INSTANCE = Mappers.getMapper(CitaMapper.class);

    @Mapping(source = "mascota.id", target = "mascotaId")
    CitaDTO toDTO(Cita cita);

    @Mapping(source = "veterinario.id", target = "id")
    VeterinarioDTO toDTO(Veterinario veterinario);

    @Mapping(source = "mascotaId", target = "mascota.id")
    Cita toEntity(CitaDTO citaDTO);

    Veterinario toEntity(VeterinarioDTO veterinarioDTO);
}