<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = "dhiraj";
		out.println(name);
	%>
	<% 
		session.setAttribute("session name", "jsp demo");
	%>
	<form action = "OutPut1.jsp" method = "get">
		<input type = "text" name = "name1" placeholder = "Enter Name">
		<input type = "password" name = "pass1">
		<input type = "submit" value = "submit">
	</form>
</body>
</html>

