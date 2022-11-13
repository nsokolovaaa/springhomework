package com.javastart.springhomework.Controller;

import com.javastart.springhomework.Dto.PaymentRequestDto;
import com.javastart.springhomework.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public Object pay(@RequestBody PaymentRequestDto paymentRequestDto) {
        return paymentService.pay(paymentRequestDto.getAccountId(), paymentRequestDto.getAmount());


    }

}
