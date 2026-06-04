package com.example.expensetracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired

    private ExpenseRepository expenseRepository;

    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses(User user) {
        return expenseRepository.findByUser(user);
    }

    public void updateExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    public List<Expense> getByUser(User user) {
        return expenseRepository.findByUser(user);
    }
}
