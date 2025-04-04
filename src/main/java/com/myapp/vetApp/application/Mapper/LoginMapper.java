package com.myapp.vetApp.application.Mapper;

import com.myapp.vetApp.application.DTO.LoginDTO;
import com.myapp.vetApp.domain.entity.Login;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface LoginMapper {

    LoginMapper INSTANCE = Mappers.getMapper(LoginMapper.class);

    LoginDTO toDTO(Login login);
    Login toEntity(LoginDTO loginDTO);
}

