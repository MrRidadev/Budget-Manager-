package org.example.budgetmanager.mapper;



import org.example.budgetmanager.dto.BudgetDto;
import org.example.budgetmanager.model.BudgetModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BudgetMapper {
    BudgetDto toDto(BudgetModel budget);
    BudgetModel toEntity(BudgetDto budgetDto);
}
