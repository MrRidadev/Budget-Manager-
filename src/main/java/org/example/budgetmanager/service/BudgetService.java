package org.example.budgetmanager.service;

import org.example.budgetmanager.dto.BudgetDto;
import org.example.budgetmanager.model.BudgetModel;
import org.example.budgetmanager.mapper.BudgetMapper;
import org.example.budgetmanager.repository.BudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetRepository budgetRepository;
    private final BudgetMapper budgetMapper;

    public List<BudgetDto> getAllBudgets(Long userId) {
        return budgetRepository.findByUserId(userId).stream()
                .map(budgetMapper::toDto)
                .collect(Collectors.toList());
    }

    public BudgetDto createBudget(BudgetDto budgetDto) {
        BudgetModel budget = budgetMapper.toEntity(budgetDto);
        budget.setSpentAmount(0.0); // init
        return budgetMapper.toDto(budgetRepository.save(budget));
    }

    public BudgetDto updateBudget(Long id, BudgetDto updated) {
        BudgetModel budget = budgetRepository.findById(id).orElseThrow();
        budget.setCategory(updated.getCategory());
        budget.setLimitAmount(updated.getLimitAmount());
        return budgetMapper.toDto(budgetRepository.save(budget));
    }

    public void deleteBudget(Long id) {
        budgetRepository.deleteById(id);
    }
}
