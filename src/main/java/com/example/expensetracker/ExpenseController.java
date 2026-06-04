package com.example.expensetracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private UserService userService;

    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) {

        User user = (User) session.getAttribute("loggedInUser");
        if (user == null) {
            return "redirect:/login";
        }

        model.addAttribute("expenses", expenseService.getByUser(user));
        return "dashboard";
    }

    @GetMapping("/expenses")
    public String expenseList(Model model, HttpSession session) {

        User user = (User) session.getAttribute("loggedInUser");
        if (user == null) {
            return "redirect:/login";
        }

        List<Expense> expenses = expenseService.getByUser(user);
        model.addAttribute("expenses", expenses);

        return "expense-list";
    }

    @GetMapping("/add")
    public String addExpense(Model model, HttpSession session) {

        User user = (User) session.getAttribute("loggedInUser");
        if (user == null) {
            return "redirect:/login";
        }

        model.addAttribute("expense", new Expense());
        return "add-expense";
    }

    @PostMapping("/add")
    public String saveExpense(Expense expense, HttpSession session) {

        User user = (User) session.getAttribute("loggedInUser");
        if (user == null) {
            return "redirect:/login";   
        }

        expense.setUser(user);
        expenseService.addExpense(expense);

        return "redirect:/dashboard";
    }

    @PostMapping("/update")
    public String updateExpense(Expense expense, HttpSession session) {

        User user = (User) session.getAttribute("loggedInUser");
        if (user == null) {
            return "redirect:/login";
        }

        expense.setUser(user);
        expenseService.updateExpense(expense);

        return "redirect:/dashboard";
    }
}