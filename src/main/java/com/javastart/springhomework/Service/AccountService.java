package com.javastart.springhomework.Service;

import com.javastart.springhomework.Entity.Account;
import com.javastart.springhomework.Entity.Bill;
import com.javastart.springhomework.Exception.AccountNotFoundException;
import com.javastart.springhomework.Repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.nio.channels.AcceptPendingException;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getById(Long accountId) {
        return accountRepository.findById(accountId).orElseThrow(() -> new AccountNotFoundException("Unable to find account with id"
                + accountId));

    }

    public Long save(String name, String email, List<Bill> bills) {
        Account account = new Account(name, email, bills);
        return accountRepository.save(account).getId();


    }
    public Account update(Account account) {
        return accountRepository.save(account);
    }
}

