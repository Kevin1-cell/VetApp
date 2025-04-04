package com.myapp.vetApp.application.Mapper;

import com.myapp.vetApp.application.DTO.AdminDTO;
import com.myapp.vetApp.domain.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AdminMapper {

    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);

    AdminDTO toDTO(Admin admin);
    Admin toEntity(AdminDTO adminDTO);
}
