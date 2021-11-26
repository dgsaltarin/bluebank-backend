package com.dgsaltarin.backend.persistence.mapper;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.persistence.entities.AccountsEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "balance", target = "balance"),
            @Mapping(source = "user", target = "user"),
            @Mapping(source = "number", target = "number"),
    })
    Accounts toAccount(AccountsEntity accountsEntity);

    @InheritInverseConfiguration
    AccountsEntity toAccountEntity(Accounts account);

}
