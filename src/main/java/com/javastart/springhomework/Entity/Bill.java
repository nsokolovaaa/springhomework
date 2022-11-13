package com.javastart.springhomework.Entity;

import com.javastart.springhomework.Dto.BillRequestDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal amount;
    private Boolean isDefault;

    public Bill() {
    }
    public Bill(BillRequestDto billRequestDto) {
        amount = billRequestDto.getAmount();
        isDefault = billRequestDto.getDefault();
    }

    public Bill(Long id, BigDecimal amount, Boolean isDefault) {
        this.id = id;
        this.amount = amount;
        this.isDefault = isDefault;
    }

    public Bill(BigDecimal amount, Boolean isDefault) {
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

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", amount=" + amount +
                ", isDefault=" + isDefault +
                '}';
    }
}
