package com.dgsaltarin.backend.domain.dto;

import lombok.Data;

@Data
public class CreateAccountRequest {

    private String userName;
    private int initialBalance;
}
