package com.javastart.springhomework.Controller;

import com.javastart.springhomework.Dto.AccountDto;
import com.javastart.springhomework.Dto.AccountRequestDto;
import com.javastart.springhomework.Dto.BillRequestDto;
import com.javastart.springhomework.Entity.Bill;
import com.javastart.springhomework.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;


    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @GetMapping("/accounts/{id}")
    public AccountDto getById(@PathVariable Long id) {
        return new AccountDto(accountService.getById(id));

    }
    @PostMapping("/accounts")
    public Long create(@RequestBody AccountRequestDto accountRequestDto) {
        return accountService.save(accountRequestDto.getName(), accountRequestDto.getEmail(),
                accountRequestDto.getBills().stream().map(billRequestDto ->
                        new Bill(billRequestDto.getAmount(), billRequestDto.getDefault()))
                        .collect(Collectors.toList()));

    }


}
