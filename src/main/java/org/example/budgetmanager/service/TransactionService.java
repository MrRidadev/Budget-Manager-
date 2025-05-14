package org.example.budgetmanager.service;


import org.example.budgetmanager.model.TransactionModel;
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


    public TransactionModel addTransaction(TransactionModel transactionModel) {
       return transactionRepository.save(transactionModel);

    }

    public List<TransactionModel> getAllTransactions() {
        return transactionRepository.findAll();
    }

}
