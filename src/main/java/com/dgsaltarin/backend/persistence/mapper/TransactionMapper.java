package com.dgsaltarin.backend.persistence.mapper;

import com.dgsaltarin.backend.domain.Transactions;
import com.dgsaltarin.backend.persistence.entities.TransactionsEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "amount", target = "amount"),
            @Mapping(source = "operation", target = "operation"),
            @Mapping(source = "date", target = "date"),
    })
    Transactions toTransaction(TransactionsEntity transactionsEntity);

    @InheritInverseConfiguration
    TransactionsEntity toTransactionEntity(Transactions transactions);
}
