<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>登陆页面</title>
</head>
<body>
<div class="container">
	<div class="row">
	
	<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
	</div>

	<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
		<div  style="border:1px solid #666;margin-top:50%" ">
		<h3 style="text-align:center">登录</h3>
			<form:form action=""  method="post" name="form1">
			<div class="table-responsive" style="text-align:center">
				<table class="table">
					<tr>
						<td>用户名：</td>
						<td><input name="username" type="text" ></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input name="password" type="password" ></td>
					</tr>
					<tr>
						<td><input type="submit" class="btn btn-warning"  value="用户登录" onclick="form1.action='loginform';form1.submit();"></td>
						<td><input type="button" class="btn btn-primary" value="管理员登录" onclick="form1.action='managerform';form1.submit();"></td>
					</tr>
					<tr>
					<td><input type="checkbox">记住密码</td>
					<td><a href="forgetpwd"><input class="btn btn-default" type="button" value="忘记密码？" ></a></td>
					</tr>
				</table>
				</div>
				<p><font color="red">${requestScope.message}</font></p>
				<p><font color="red">${requestScope.message3}</font></p>
				<p><font color="red">${requestScope.message4}</font></p>
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