<%@page import="jobbean.ACCbean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>cac tai khoan</div>
	<% 	ArrayList<ACCbean> list = (ArrayList<ACCbean>)request.getAttribute("acc");
		for(ACCbean l: list){ %> 
		<div><%=l.getTendangnhap() %></div>
		<% };%>
</body>
</html>