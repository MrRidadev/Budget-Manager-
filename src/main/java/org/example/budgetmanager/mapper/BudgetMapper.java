package org.example.budgetmanager.mapper;



import org.example.budgetmanager.dto.BudgetDto;
import org.example.budgetmanager.model.Budget;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BudgetMapper {
    BudgetDto toDto(Budget budget);
    Budget toEntity(BudgetDto budgetDto);
}
