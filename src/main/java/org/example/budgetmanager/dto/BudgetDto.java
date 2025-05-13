package org.example.budgetmanager.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BudgetDto {
    private Long id;
    private String category;
    private Double limitAmount;
    private Double spentAmount;
    private Long userId;
}
