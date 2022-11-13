package com.javastart.springhomework.Service;

import com.javastart.springhomework.Entity.Account;
import com.javastart.springhomework.Entity.Bill;
import com.javastart.springhomework.utils.AccountUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {
    public PaymentService(AccountService accountService) {
        this.accountService = accountService;
    }

    private final AccountService accountService;

    public Object pay(Long id, BigDecimal paymentAmount) {
        Account account = accountService.getById(id);
        Bill defaultBill = AccountUtils.findDefaultBill(account);
        defaultBill.setAmount(defaultBill.getAmount().subtract(paymentAmount));
        accountService.update(account);
        return "Success";



    }

}
