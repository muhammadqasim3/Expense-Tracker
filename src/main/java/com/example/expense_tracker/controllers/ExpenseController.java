package com.example.expense_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.example.expense_tracker.models.Expense;
import com.example.expense_tracker.services.ExpenseService;


@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/expenses")
	public ModelAndView getAllExpenses(){
		// create mav object and map it to view file.
		ModelAndView mav = new ModelAndView("expenses");
		// fetch all the expenses.
		List<Expense> expenses = expenseService.findAll();
		mav.addObject("expenses",expenses);
//		System.out.println("asdf");0
//		System.out.println(expenses);
		return mav;
	}
	
	@RequestMapping("/add-expense")
	public ModelAndView AddExpense(){
		ModelAndView mav = new ModelAndView("add-expense");
		mav.addObject("expense", new Expense());
		return mav;
	}
	
	@RequestMapping(value="/expense", method=RequestMethod.POST)
	public String save(@ModelAttribute("expense") Expense expense){
		expenseService.saveExpense(expense);
		return "redirect:/expenses";
	}
	
	
}
