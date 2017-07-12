<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>哆禸文艺</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script> 	
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
<link href="http://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css" rel="stylesheet">
<link href="bootstrap/bootstrap-spinner.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src="bootstrap/jquery.spinner.min.js"></script>


</head>

<body>
<script>
function validateForm(){
var x=document.forms["buyForm"]["username"].value;
var p=document.forms["buyForm"]["number"].value;
var y=document.forms["buyForm"]["address"].value;
var z=document.forms["buyForm"]["phone"].value;
if (x==null || x==""){
  alert("请先登陆！");
  return false;
  }
else if(p<1 || p>5){
	  alert("至少购买1件，最多购买5件");
	  return false;
	  }
  else if(y==null || y==""){
	  alert("请输入地址！");
	  return false;
	  }
  else if(z==null || z==""){
	  alert("请输入电话！");
	  return false;
	  }

}
</script>

<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<ul class="nav nav-pills">
					  <li role="presentation"><a href="login">亲，请先登录</a></li>
					  <li role="presentation"><a href="register">免费注册</a></li>
					</ul>
					<hr>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>
	  <div class="container">
		<div class="row">
							
			<div class="col-xs-12 col-sm-12">
			<span>欢迎您${username}</span>
				<div style="text-align:center"><span >原创/复古/文艺</span><span>哆禸文艺</span></div>
			</div>
							
			
<div class="container">
<div class="row">
<div class="col-xs-2 col-ms-3 col-md-3 col-lg-3"></div>
<div class="col-xs-8 col-ms-6 col-md-6 col-lg-6">
		<div style="text-align:center; margin-top:30%">
		<img alt="" src="images/${goods.image }">
    			<form id="buyForm" role="form" action="buyForm" onsubmit="return validateForm()"  method="post">
    			
    					
        				<label>
        				<input type="text" name="image" id="image" value="${goods.image }" /></label>
        				<label>商品名：
    					<input type="text" name="goodsid" id="goodsid" value="${goods.goodsid }" class="form-control"/></label><br>
        				<label>商品描述：
        				<input type="text" name="dipect" id="dipect" value="${goods.dipect }" class="form-control"/></label>
        				<label>商品库存：<input type="text" value="${goods.amount }" class="form-control"/></label><br>
        				
        		<div ng-app=""ng-init="price=${goods.price}" > 
				 	<label>商品价格 :<input type="text"   value="${goods.price }" name="price" id="price" class="form-control"/></label>
				 	<label>购买数量：<input type="number"   ng-model="number" name="number" id="number" class="form-control"/></label><br>
				 	<label>总价：<input type="text" name="totalprice" id="totalprice" value= "{{number*price}}" class="form-control"/></label>
				</div>
				
  			<input type="hidden" value="${username}" name="username"  id="username">
  			<br>
  			<label>
  			收货人地址
  				<input type="text" class="form-control" name="address" id="address">
  			</label>  		
  			<label>
  			收货人电话
  				<input type="text" class="form-control" name="phone" id="phone">
  			</label>	
  			<br>
  			
		<input class="btn btn-warning" type="submit" value="提交订单">
			</form>
			<br>
			<a href="duorou"><button class="btn btn-warning" >取消订单</button></a>
  		</div>

  	
		<div class="col-xs-2 col-ms-3 col-md-3 col-lg-3"></div>
		</div>
		</div>
		
		
</body>
</html>