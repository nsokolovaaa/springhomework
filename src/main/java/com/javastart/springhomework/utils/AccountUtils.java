package com.javastart.springhomework.utils;

import com.javastart.springhomework.Entity.Account;
import com.javastart.springhomework.Entity.Bill;
import com.javastart.springhomework.Exception.NotDefaultBillException;

public class AccountUtils {
    public static Bill findDefaultBill(Account accountFrom) {
        return accountFrom.getBills().stream().filter(Bill::getDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("unable to find default bill" +accountFrom.getId()));
    }
}
