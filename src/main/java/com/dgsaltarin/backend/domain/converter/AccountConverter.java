package com.dgsaltarin.backend.domain.converter;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.domain.Users;
import com.dgsaltarin.backend.domain.dto.CreateAccountRequest;
import org.springframework.stereotype.Component;

@Component
public class AccountConverter {

    public Accounts convertRequestAccountToAccount(CreateAccountRequest createAccountRequest) {
        Accounts account = new Accounts();
        Users user = new Users();
        account.setBalance(createAccountRequest.getInitialBalance());
        user.setName(createAccountRequest.getUserName());
        account.setUser(user);
        return account;
    }
}
