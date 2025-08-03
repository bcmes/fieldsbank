package com.bcmes.fieldsbank.debit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DebitController {

    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping("/debits")
    public String debit(@RequestBody DebitRequest debitRequest) {
        transactionRepository.save(debitRequest.toModel());
        return debitRequest.toString();
    }
}
