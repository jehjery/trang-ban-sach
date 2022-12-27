<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; chars	et=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.form-label{
    color: darkturquoise;
    form-check-label{
    color: darkturquoise!important;
    }
}
</style>
<link rel="stylesheet" href="./sachonl.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Registation Form * Form Tutorial</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

	<!-- Popper JS -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<section class="vh-100">
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h2 class="text-center">sửa thông tin tài khoản </h2>
			</div>
			<%
			response.setCharacterEncoding("utf-8");
		    String tendangnhap=request.getParameter("tendangnhap");
			String matkhau=request.getParameter("matkhau");
			String fullname=request.getParameter("fullname");
			String email=request.getParameter("email");
			String ngay=request.getParameter("ngay");
			String thang=request.getParameter("thang");
			String nam=request.getParameter("nam");
			String gioitinh=request.getParameter("gioitinh");
			%>
			<form action="Suaprofile"method="post">
			<div class="panel-body">
				<div class="form-group">
				
				  <label for="usr">Tên đăng nhập</label>
				  <input 	value="<%=tendangnhap %>" 
				  
				  name= "tendangnhap" required="true" type="text" class="form-control" id="usr">
				</div>
				<div class="form-group">
				  <label for="usr">Mật khẩu</label>
				  <input value="" 
				  name= "matkhau" required="true" type="text" class="form-control" id="usr">
				</div>
				
					<div class="form-group">
				  <label for="usr">Tên đầy đủ</label>
				  <input value="<%=fullname %>" 
				  name= "fullname" required="true" type="text" class="form-control" id="usr">
				</div>
				<div class="form-group">
				  <label for="usr">email:</label>
				  <input value="<%=email %>" 
				  name= "email" required="true" type="text" class="form-control" id="usr">
				</div>
						<div class="form-group">
				  <label for="usr">giới tính:</label>
				  <input value="<%=gioitinh %>" 
				  name= "gioitinh" required="true" type="text" class="form-control" id="usr">
				</div>
				<div class="form-group">
				  <label for="usr">ngày sinh:</label>
				  <input value="<%=ngay %>" 
				  name= "gia" required="true" type="text" class="form-control" id="usr">
				  <input value="<%=thang %>" 
				  name= "gia" required="true" type="text" class="form-control" id="usr">
				  <input value="<%=nam %>" 
				  name= "gia" required="true" type="text" class="form-control" id="usr">
				</div>
				
					
			
				<!-- <div class="form-group">
				  <label for="address">Address:</label>
				  <input type="text" class="form-control" id="address">
				</div> -->
				<!-- <div class="form-group">
				  <label for="email">Email:</label>
				  <input required="true" type="email" class="form-control" id="email">
				</div> -->
				<!-- <div class="form-group">
				  <label for="birthday">Birthday:</label>
				  <input type="date" class="form-control" id="birthday">
				</div> -->
				<button  class="btn btn-success">Register</button>
			</div>
			</form>
			
				<form action="XoaACC"method="post" style="margin: -2px;">
						<button style="color: #000;
    					background: red;" value="<%=tendangnhap%>" 
    					name="SACHXOA"type="submit">XÓA</button>
						</form>
		</div>
	</div>
</body>
</html>