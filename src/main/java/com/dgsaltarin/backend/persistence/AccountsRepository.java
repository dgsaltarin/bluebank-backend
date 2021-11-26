package com.dgsaltarin.backend.persistence;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.persistence.crud.AccountsCrudRepository;
import com.dgsaltarin.backend.persistence.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountsRepository {

    private AccountsCrudRepository accountsCrudRepository;
    private AccountMapper accountMapper;

    @Autowired
    public AccountsRepository(AccountsCrudRepository accountsCrudRepository, AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
        this.accountsCrudRepository = accountsCrudRepository;
    }

    public Accounts createAccount(Accounts account) {
        return accountMapper.toAccount(accountsCrudRepository.save(accountMapper.toAccountEntity(account)));
    }

    public Accounts consultBalance(int accountNumber) {
        return accountMapper.toAccount(accountsCrudRepository.findAccountsEntitiesByNumber(accountNumber));
    }
}
