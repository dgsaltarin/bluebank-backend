package com.dgsaltarin.backend.domain;

import lombok.Data;

@Data
public class Transactions {

    private Long id;
    private double amount;
    private String operation;
}
