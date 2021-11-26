package com.dgsaltarin.backend.domain.dto;

import lombok.Data;

@Data
public class TransactionRequest {

    private int accountNumber;
    private String operation;
    private int amount;
}
