package com.javastart.springhomework.Dto;

import com.javastart.springhomework.Entity.Bill;

import java.math.BigDecimal;

public class BillResponseDto {
    private Long id;
    private BigDecimal amount;
    private Boolean isDefault;
    public BillResponseDto(Bill bill) {
        id = bill.getId();
        amount = bill.getAmount();
        isDefault = bill.getDefault();

    }

    public BillResponseDto(Long id, BigDecimal amount, Boolean isDefault) {
        this.id = id;
        this.amount = amount;
        this.isDefault = isDefault;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
