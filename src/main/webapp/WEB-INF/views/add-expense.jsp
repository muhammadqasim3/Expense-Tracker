<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
	<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>	<!-- This will give you current url path -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Expense</title>
</head>
<body>
	<h1>Add Expense</h1>
	<form:form action="${contextRoot}/expense" method="POST" modelAttribute="expense">
		<form:input path="expensename" placeholder="Enter expense name" />
		<form:input path="amount" placeholder="Enter expense amount" />
		<form:input path="note" placeholder="Enter note (optional)" />
	
		<button type="submit">Add Expense</button>
		
	</form:form>
</body>
</html>