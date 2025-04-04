package com.myapp.vetApp.application.Mapper;

import com.myapp.vetApp.application.DTO.VeterinarioDTO;
import com.myapp.vetApp.domain.entity.Veterinario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VeterinarioMapper {

    VeterinarioMapper INSTANCE = Mappers.getMapper(VeterinarioMapper.class);

    VeterinarioDTO toDTO(Veterinario veterinario);
    Veterinario toEntity(VeterinarioDTO veterinarioDTO);
}

