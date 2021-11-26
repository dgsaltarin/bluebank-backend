package com.dgsaltarin.backend.domain.service;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.domain.converter.AccountConverter;
import com.dgsaltarin.backend.domain.dto.CreateAccountRequest;
import com.dgsaltarin.backend.persistence.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AccountsService {

    private AccountsRepository accountsRepository;
    private AccountConverter accountConverter;

    @Autowired
    public AccountsService(AccountsRepository accountsRepository, AccountConverter accountConverter) {
        this.accountsRepository = accountsRepository;
        this.accountConverter = accountConverter;
    }

    public Optional<Accounts> createAccount(CreateAccountRequest createAccountRequest) {
        return Optional.of(accountsRepository.
                createAccount(accountConverter
                        .convertRequestAccountToAccount(createAccountRequest)));
    }

}
