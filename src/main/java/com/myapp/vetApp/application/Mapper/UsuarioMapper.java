package com.myapp.vetApp.application.Mapper;

import com.myapp.vetApp.application.DTO.UsuarioDTO;
import com.myapp.vetApp.domain.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    @Mapping(source = "login.id", target = "loginId")
    UsuarioDTO toDTO(Usuario usuario);

    @Mapping(source = "loginId", target = "login.id")
    Usuario toEntity(UsuarioDTO usuarioDTO);

}


