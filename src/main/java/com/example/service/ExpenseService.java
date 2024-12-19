package com.example.service;

import com.example.repository.ExpenseRepository;

public class ExpenseService {
    private ExpenseRepository expenseRepository = new ExpenseRepository();

    public void addExpense(String description, double amount) {
        Expense expense = new Expense(description, amount);
        expenseRepository.saveExpense(expense);
    }
}
