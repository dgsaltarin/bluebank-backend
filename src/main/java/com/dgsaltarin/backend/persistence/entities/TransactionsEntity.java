package com.dgsaltarin.backend.persistence.entities;

import com.dgsaltarin.backend.domain.Accounts;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
public class TransactionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_id", insertable = false, updatable = false)
    private AccountsEntity account;

    private int amount;

    private String operation;

    private LocalDate date;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public AccountsEntity getAccount() {
        return account;
    }

    public void setAccount(AccountsEntity account) {
        this.account = account;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
