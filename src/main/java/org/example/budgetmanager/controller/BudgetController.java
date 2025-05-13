package org.example.budgetmanager.controller;



import org.example.budgetmanager.dto.BudgetDto;
import org.example.budgetmanager.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BudgetController {

    private final BudgetService budgetService;

    @GetMapping("/{Id}")
    public List<BudgetDto> getBudgets(@PathVariable Long Id) {
        return budgetService.getAllBudgets(Id);
    }

    @PostMapping("/add")
    public BudgetDto create(@RequestBody BudgetDto budgetDto) {
        return budgetService.createBudget(budgetDto);
    }

    @PutMapping("/update/{id}")
    public BudgetDto update(@PathVariable Long id, @RequestBody BudgetDto budgetDto) {
        return budgetService.updateBudget(id, budgetDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        budgetService.deleteBudget(id);
    }
}
