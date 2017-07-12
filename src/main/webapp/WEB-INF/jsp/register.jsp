<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>注册页面</title>
   
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
		</div>

		<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
		<div style="border:1px solid #666;margin-top:50%" id="registerform">
			<h3 style="text-align:center">注册</h3>
			<form:form modelAttribute="user" method="post" action="registerform" >
			<div class="table-responsive">
			<table  class="table">
				<tr>
					<td>用户名：</td>
					<td><form:input path="username"/></td>
					<td><form:errors path="username" cssStyle="color:red"/></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><form:input type="password" path="password"/></td>
					<td><form:errors path="password" cssStyle="color:red"/></td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td><form:input path="email"/></td>
					<td><form:errors path="email" cssStyle="color:red"/></td>
				</tr>
				<tr>
					<td>电话：</td>
					<td><form:input path="phone"/></td>
					<td><form:errors path="phone" cssStyle="color:red"/></td>
				</tr>
				<tr>
				<td></td>
					<td style="text-align:center"><input class="btn btn-success" type="submit" value="我要注册"/></td>
				
				</tr>
		
			</table>
			</div>
		</form:form>
		</div>
	</div>
	
		<div class="col-xs-4 col-ms-4 col-md-4 col-lg-4">
		
		</div>
	</div>
</div>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>
