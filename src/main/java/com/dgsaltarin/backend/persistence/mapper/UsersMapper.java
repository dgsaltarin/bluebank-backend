package com.dgsaltarin.backend.persistence.mapper;

import com.dgsaltarin.backend.domain.Users;
import com.dgsaltarin.backend.persistence.entities.UsersEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UsersMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
    })
    Users toUser(UsersEntity userEntity);

    @InheritInverseConfiguration
    @Mapping(target = "account", ignore = true)
    UsersEntity toUserEntity(Users user);
}
