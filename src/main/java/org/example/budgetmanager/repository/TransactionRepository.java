package org.example.budgetmanager.repository;

import org.example.budgetmanager.model.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionModel, Long> {


}
