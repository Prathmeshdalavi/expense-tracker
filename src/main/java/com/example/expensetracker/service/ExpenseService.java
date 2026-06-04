package com.example.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.model.User;
import com.example.expensetracker.repository.ExpenseRepository;

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
