package org.example.budgetmanager.service;


import org.example.budgetmanager.model.Transaction;
import org.example.budgetmanager.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    public Transaction addTransaction(Transaction transactionModel) {
       return transactionRepository.save(transactionModel);

    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public void deleteTransaction(Transaction transactionModel) {
        transactionRepository.delete(transactionModel);
    }

    public void updateTransaction(Transaction transactionModel) {
        transactionRepository.save(transactionModel);
    }

}
