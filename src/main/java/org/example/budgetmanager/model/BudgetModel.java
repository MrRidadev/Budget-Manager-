package org.example.budgetmanager.model;


import jakarta.persistence.*;



import java.util.List;

@Entity
public class BudgetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private Double limitAmount;
    private Double spentAmount;
    
    @OneToMany(mappedBy = "budget")
    private List<Transaction> transactionModels;

    public List<Transaction> getTransactions() {
        return transactionModels;
    }

    public void setTransactions(List<Transaction> transactionModels) {
        this.transactionModels = transactionModels;
    }

    public BudgetModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Double getSpentAmount() {
        return spentAmount;
    }

    public void setSpentAmount(Double spentAmount) {
        this.spentAmount = spentAmount;
    }
}
