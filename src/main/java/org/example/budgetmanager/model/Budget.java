package org.example.budgetmanager.model;


import jakarta.persistence.*;
import lombok.Setter;


import java.util.List;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private Double limitAmount;
    @Setter
    private Double spentAmount;

    @OneToMany(mappedBy = "budget")
    private List<TransactionModel> transactionModels;

    public List<TransactionModel> getTransactions() {
        return transactionModels;
    }

    public void setTransactions(List<TransactionModel> transactionModels) {
        this.transactionModels = transactionModels;
    }

    public Budget() {
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

}
