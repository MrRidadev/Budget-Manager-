package org.example.budgetmanager.controller;



import org.example.budgetmanager.dto.BudgetDto;
import org.example.budgetmanager.model.Budget;
import org.example.budgetmanager.service.BudgetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/budgets")
@CrossOrigin(origins = "*")
public class BudgetController {

    BudgetController(BudgetService budgetService){

        this.budgetService = budgetService;
    };
    private final BudgetService budgetService;
    @GetMapping("/{Id}")
    public Optional<Budget> getBudgets(@PathVariable Long Id) {
        return budgetService.getBudget(Id);
    }
    @GetMapping
    public List<BudgetDto> getBudgets() {
        return budgetService.getAllBudgets();
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
