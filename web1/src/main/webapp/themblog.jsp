
<%@ page language="java" contentType="text/html; charset=UTF-8"
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
				<h2 class="text-center">Thêm Blog </h2>
			</div>
			
			<form action="Themblog"method="post">
			<div class="panel-body">
				<div class="form-group">
				
				  <label for="usr">Mã Blog:</label>
				  <input 	 
				  name= "mablog" required="true" type="text" class="form-control" id="usr">
				</div>
				<div class="form-group">
				  <label for="usr">Tiêu đề</label>
				  <input 
				  name= "tieude" required="true" type="text" class="form-control" id="usr">
				</div>
				
						<div class="form-group">
				  <label for="usr">phụ đề</label>
				  <input 
				  name= "phude" required="true" type="text" class="form-control" id="usr">
				</div>
				<div class="form-group">
				  <label for="usr">Nội dung</label>
				  <input
				  name= "noidung" required="true" type="text" class="form-control" id="usr">
				</div>
						<div class="form-group">
				  <label for="usr">Tác giả</label>
				  <input 
				  name= "tacgia" required="true" type="text" class="form-control" id="usr">
				</div>
			
				
					<div class="form-group">
				  <label for="usr">Ảnh hoặc Link Ảnh:</label>
				  <input 
				  name= "Anh" required="true" type="text" class="form-control" id="usr">
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
		</div>
	</div>
</body>
</html>