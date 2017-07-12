<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  <title>找回密码</title>
  <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
<div class="container">
					
	 <div class="row">
	  <div class="clearfix" style="margin-bottom: 20px;"></div>
				<div class="col-xs-4 col-ms-4 col-md-4 col-lg-4">
					<hr> 
			    </div>
			    <div class="col-xs-4 col-ms-4 col-md-4 col-lg-4" style="text-align:center">
					 <span >原创/复古/文艺</span><span>哆禸文艺</span>
			    </div>
			    <div class="col-xs-4 col-ms-4 col-md-4 col-lg-4">
					 <hr> 
			    </div>
		</div>
		<div class="clearfix" style="margin-bottom: 40px;"></div>
<div class="container">
  <div class="row">
  	 <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4"></div> 
		 <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="border:1px solid #666"> 
		  <h3 style="text-align:center">修改密码</h3>
		<form role="form" action="" name="findform" >
		  <div class="form-group">
		    <label for="name">用户名</label>
		    <input type="text" class="form-control" name="username" value="${username}">
		  </div>
		  <div class="form-group">
		    <label for="name">新密码</label>
		    <input type="text" class="form-control" name="newpwd" >
		  </div>
		  <div class="form-group">
		    <label for="name">确认密码</label>
		    <input type="text" class="form-control" name="renewpwd" >
		  </div>
		  
		  <div class="form-group">
		    <input  style="float:left" class="btn btn-primary" type="submit"  value="返回上一页"onclick="findform.action='information';findform.submit();">
		      <input  style="float:right" class="btn btn-warning" type="submit"  value="确认修改"onclick="findform.action='findpwd';findform.submit();">
		  
		  </div>
		  
		</form>
		<p style="color:red">${message}</p>
		</div>
	<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4"></div>	 
	
	</div>  
	</div>    
</body>
</html>