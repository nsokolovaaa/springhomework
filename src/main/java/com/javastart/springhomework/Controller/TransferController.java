package com.javastart.springhomework.Controller;

import com.javastart.springhomework.Dto.TransferRequestDto;
import com.javastart.springhomework.Service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {
    private final TransferService transferService;

    @Autowired
    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }


    @PostMapping("/transfer")
    public Object transfer(@RequestBody TransferRequestDto transferRequestDto) {
        return transferService.transfer(transferRequestDto.accountFromDb,
                transferRequestDto.getAccountIdTo(), transferRequestDto.getAmount());


    }
}
