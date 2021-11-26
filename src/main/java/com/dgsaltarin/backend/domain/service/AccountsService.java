package com.dgsaltarin.backend.domain.service;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.domain.converter.AccountConverter;
import com.dgsaltarin.backend.domain.dto.CreateAccountRequest;
import com.dgsaltarin.backend.persistence.AccountsRepository;
import com.dgsaltarin.backend.persistence.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AccountsService {

    private AccountsRepository accountsRepository;
    private AccountConverter accountConverter;
    private UsersRepository usersRepository;

    @Autowired
    public AccountsService(AccountsRepository accountsRepository, AccountConverter accountConverter,
                           UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
        this.accountsRepository = accountsRepository;
        this.accountConverter = accountConverter;
    }

    public Optional<Accounts> createAccount(CreateAccountRequest createAccountRequest) {
        Random random = new Random();
        int accountNumber = random.nextInt(999999999);
        Accounts account = accountConverter.convertRequestAccountToAccount(createAccountRequest);
        account.setNumber(accountNumber);
        account.setUser(usersRepository.createUser(account.getUser()));
        return Optional.of(accountsRepository.
                createAccount(account));
    }

    public Optional<Double> consultBalance(int accountNumber) {
        Accounts account = accountsRepository.consultBalance(accountNumber);
        return Optional.of(account.getBalance());
    }

}
