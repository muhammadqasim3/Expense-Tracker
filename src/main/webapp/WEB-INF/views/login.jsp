<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
	<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>	<!-- This will give you current url path -->
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form:form action="${contextRoot}/login" method="POST" ModelAttribute="user">  
		<form:input path="email" placeholder="Enter Email" />
		<form:input path="password" placeholder="Enter Password" />
		<button type="submit">Login</button>
	</form:form>  
</body>
</html>