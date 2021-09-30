<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome simple JSP Page</h2>
<%!int a,b,sum; %>
<%
a=10;
b=20;
sum = a+b;
out.println("Sum of two number is "+sum);
%>
</body>
</html>