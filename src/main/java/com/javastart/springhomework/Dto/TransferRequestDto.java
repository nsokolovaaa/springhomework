package com.javastart.springhomework.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class TransferRequestDto {
    @JsonProperty("account_from_db")
    public Long accountFromDb;
    @JsonProperty("account_id_to")
    public Long accountIdTo;
    @JsonProperty("amount")
    private BigDecimal amount;

    public TransferRequestDto() {
    }

    public TransferRequestDto(Long accountFromDb, Long accountIdTo, BigDecimal amount) {
        this.accountFromDb = accountFromDb;
        this.accountIdTo = accountIdTo;
        this.amount = amount;
    }

    public Long getAccountFromDb() {
        return accountFromDb;
    }

    public void setAccountFromDb(Long accountFromDb) {
        this.accountFromDb = accountFromDb;
    }

    public Long getAccountIdTo() {
        return accountIdTo;
    }

    public void setAccountIdTo(Long accountIdTo) {
        this.accountIdTo = accountIdTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
