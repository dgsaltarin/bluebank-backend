package com.dgsaltarin.backend.persistence.entities;

import com.dgsaltarin.backend.domain.Transactions;
import com.dgsaltarin.backend.domain.Users;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "accounts")
public class AccountsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "balance")
    private int balance;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    @OneToMany(mappedBy = "account")
    private List<TransactionsEntity> transactionsList;

    @Column(name = "number")
    private int number;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
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

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
