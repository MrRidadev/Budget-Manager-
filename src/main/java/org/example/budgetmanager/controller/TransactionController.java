package org.example.budgetmanager.controller;

import org.example.budgetmanager.model.Transaction;
import org.example.budgetmanager.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/post")
    public Transaction postTransaction(@RequestBody Transaction transactionModel) {
        return transactionService.addTransaction(transactionModel);
    }

    @GetMapping("/")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
}
