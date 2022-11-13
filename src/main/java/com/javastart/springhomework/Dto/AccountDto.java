package com.javastart.springhomework.Dto;

import com.javastart.springhomework.Entity.Account;
import com.javastart.springhomework.Entity.Bill;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

public class AccountDto {

    private Long id;
    private String name;
    private String email;
    private List<BillResponseDto> bills;

    public AccountDto() {
    }
    public AccountDto(Account account) {
        id = account.getId();
        name = account.getName();
        email = account.getEmail();
        bills = account.getBills().stream().map(BillResponseDto ::new)
                .collect(Collectors.toList());
    }

    public AccountDto(Long id, String name, String email, List<BillResponseDto> bills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bills = bills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BillResponseDto> getBills() {
        return bills;
    }

    public void setBills(List<BillResponseDto> bills) {
        this.bills = bills;
    }
}
