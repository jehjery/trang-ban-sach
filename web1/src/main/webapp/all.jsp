<%@page import="jobbean.hoadonbean"%>
<%@page import="jobbean.blogbean"%>
<%@page import="jobbean.sanphambean"%>
<%@page import="jobbean.loaibean"%>
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
	<h1>danh sách các giờ hóa đơn</h1>	
	<% 	request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		ArrayList<hoadonbean> list1 = (ArrayList<hoadonbean>)request.getAttribute("hd");
		for(hoadonbean l: list1){ %> 
		<div><%=l.getNgaythanhtoan()%></div>	
		<% };%>
	<h1>danh sách các nick</h1>	
	<% 	request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		ArrayList<ACCbean> list = (ArrayList<ACCbean>)request.getAttribute("acc");
		for(ACCbean l: list){ %> 
		<div><%=l.getTendangnhap()%></div>
		<div><%=l.getMatkhau()%></div>
		<div><%=l.getFullname()%></div>
		<% };%>
		<h1>danh sách các blog</h1>	
	<%ArrayList<blogbean> listblog = (ArrayList<blogbean>)request.getAttribute("blog");
	  for(blogbean l: listblog){ %>	
		<div><%=l.getTacgia()%></div>
		<div><%=l.getTieude()%></div>
		<div><%=l.getPhude()%></div>
		<% };%>
		
	<h1>danh sách các loai</h1>		
	<% 	ArrayList<loaibean> listloai = (ArrayList<loaibean>)request.getAttribute("loai");
		for(loaibean l: listloai){ %> 
		<div><%=l.getMaloai()%></div>
		<div><%=l.getTenloai()%></div>
		<div><%=l.getsoluongsanpham()%></div>
		<% };%>
		
		<h1>danh sách các San pham </h1>		
	<% 	ArrayList<sanphambean> listsp = (ArrayList<sanphambean>)request.getAttribute("sp");
		for(sanphambean l: listsp){ %> 
		<div><%=l.getMaloai()%></div>

		<% };%>	
</body>
</html>