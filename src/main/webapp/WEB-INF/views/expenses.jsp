<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set><!-- This will give you current url path -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Title here</title>
	</head>
	<body>
		<h1>Expense Tracker</h1>
		<button ><a href="${contextRoot}/add-expense">Add Expense</a></button>
	
		<c:forEach var="expense" items="${expenses}">
			<div>
				<h3>Title: ${expense.expensename}</h3>
				<p>Description: ${expense.note}</p>
				<p>Amount: $${ expense.amount } </p>
				<button ><a href="${contextRoot}/expense/${expense.id}">Edit</a></button>
				<button ><a href="${contextRoot}/expense/${expense.id}/delete">Delete</a></button>
				
			</div>
		</c:forEach>
			
	</body>
</html>