package com.javastart.springhomework.Dto;

import java.util.List;

public class AccountRequestDto {
    private Long id;
    private String name;
    private String email;
    private List<BillRequestDto> bills;

    public AccountRequestDto() {
    }

    public AccountRequestDto(Long id, String name, String email, List<BillRequestDto> bills) {
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

    public List<BillRequestDto> getBills() {
        return bills;
    }

    public void setBills(List<BillRequestDto> bills) {
        this.bills = bills;
    }
}
