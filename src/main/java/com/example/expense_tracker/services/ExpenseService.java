package com.example.expense_tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expense_tracker.models.Expense;
import com.example.expense_tracker.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;
	
	public List<Expense> findAll(){
		return expenseRepository.findAll();
	}
}
