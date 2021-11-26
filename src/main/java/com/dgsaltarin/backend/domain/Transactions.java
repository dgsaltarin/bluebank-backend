package com.dgsaltarin.backend.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Transactions {

    private Long id;
    private int amount;
    private String operation;
    private LocalDate date;
}
