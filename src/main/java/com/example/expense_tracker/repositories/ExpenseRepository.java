package com.example.expense_tracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.expense_tracker.models.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
}
