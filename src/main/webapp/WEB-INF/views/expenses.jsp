<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Title here</title>
	</head>
	<body>
		<h1>Expense Tracker</h1>
		<p>ForEach Loop JSP</p>
		
		<c:forEach var="expense" items="${expenses}">
			<div>
				<h3>${expense.expensename}</h3>
				<p>$${ expense.amount } </p>
			</div>
		</c:forEach>
			
	</body>
</html>