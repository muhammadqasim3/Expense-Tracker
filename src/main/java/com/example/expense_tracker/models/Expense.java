package com.example.expense_tracker.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table(name="expenses")
@ToString
public class Expense {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // This line will auto generate/increment the id.
	private Long id;
	@Column(name="description")
	private String expensename;
	private BigDecimal amount;
	private String note;
	private Long createdAt;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpensename() {
		return expensename;
	}

	public void setExpensename(String expensename) {
		this.expensename = expensename;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	
	
	@Override
	public String toString() {
		return "Expense [id=" + id + ", expensename=" + expensename + ", amount=" + amount + ", note=" + note
				+ ", createdAt=" + createdAt + "]";
	}
}
