package org.example.budgetmanager.repository;


import org.example.budgetmanager.model.BudgetModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetRepository extends JpaRepository<BudgetModel, Long> {
    List<BudgetModel> findByUserId(Long userId);
}
