package com.myapp.vetApp.application.Mapper;

import com.myapp.vetApp.application.DTO.MascotaDTO;
import com.myapp.vetApp.domain.entity.Mascota;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MascotaMapper {
    MascotaMapper INSTANCE = Mappers.getMapper(MascotaMapper.class);

    @Mapping(source = "cliente.id", target = "clienteId")
    MascotaDTO toDTO(Mascota mascota);

    @Mapping(source = "clienteId", target = "cliente.id")
    Mascota toEntity(MascotaDTO mascotaDTO);
}
