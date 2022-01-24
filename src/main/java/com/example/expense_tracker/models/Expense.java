package com.example.expense_tracker.models;

import java.math.BigDecimal;

@Entity
@Table(name="expenses")
@Getter
@Setter
@ToString
public class Expense {
	
	@Id
	@GeneratedValue(Strategy=GenerationType.IDENTITY)  // This line will auto generate/increment the id.
	private Long id;
	@Column(name="description")
	private String expensename;
	private BigDecimal amount;
	private String note;
	private Long createdAt;
	
}
