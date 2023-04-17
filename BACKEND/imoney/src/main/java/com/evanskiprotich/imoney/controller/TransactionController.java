package com.evanskiprotich.imoney.controller;

import com.evanskiprotich.imoney.entity.TransactionEntity;
import com.evanskiprotich.imoney.model.Transaction;
import com.evanskiprotich.imoney.services.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/transactions")
    public TransactionEntity createTransaction(@Valid @RequestBody TransactionEntity transactionEntity) {
        Date createdAt = new Date();
        transactionEntity.setCreatedAt(createdAt);
        return transactionService.saveTransaction(transactionEntity);
    }

    @GetMapping("/transactions")
    public List<TransactionEntity> fetchTransactionList() {
        return transactionService.fetchTransactionList();
    }

    @GetMapping("/transactions/{merchant}/{accountNumber}")
    public List<TransactionEntity> fetchTransactionsByAccountNumber(@PathVariable("merchant") String merchant, @PathVariable("accountNumber") int accountNumber) {
        return transactionService.fetchTransactionsByAccountNumber(merchant, accountNumber);
    }

}
