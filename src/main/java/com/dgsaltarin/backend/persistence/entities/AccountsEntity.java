package com.dgsaltarin.backend.persistence.entities;

import com.dgsaltarin.backend.domain.Transactions;
import com.dgsaltarin.backend.domain.Users;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Accounts")
public class AccountsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double balance;

    @OneToOne
    @JoinColumn(name = "user_id", updatable = false, nullable = false)
    private UsersEntity user;

    @OneToMany(mappedBy = "account")
    private List<TransactionsEntity> transactionsList;

    private Long number;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    public List<TransactionsEntity> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(List<TransactionsEntity> transactionsList) {
        this.transactionsList = transactionsList;
    }

    public void setNumber(Long number) {
        this.balance = number;
    }

    public Long getNumber() {
        return number;
    }
}
