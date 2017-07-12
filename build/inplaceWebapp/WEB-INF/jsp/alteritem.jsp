<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  <title>修改商品信息</title>
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
		    
		<form role="form" method="post" action="alterForm" enctype="multipart/form-data">
		  <div class="form-group">
		    <label >商品名称</label>
		    <input type="text" class="form-control" name="goodsid" value="${item.goodsid}">
		  </div>
		   
		  <div class="form-group">
		    <label >商品描述</label>
		    <input type="text" class="form-control" name="dipect" value="${item.dipect}">
		  </div>
		  
		  <div class="form-group">
		    <label >商品价格</label>
		    <input type="text" class="form-control" name="price" value="${item.price}">
		  </div>
		  
		  <div class="form-group">
		    <label >商品库存</label>
		    <input type="text" class="form-control" name="amount" value="${item.amount}">
		  </div>
		 
		  <div class="form-group">
		    <label >商品类别</label>
		    <input type="text" class="form-control" name="typeid" value="${item.typeid}">
		  </div>
		  
		  <div class="form-group">
		    <label >商品图片</label>
		    <input type="image" style="width:100px;height:100px;"  src="images/${item.image}">
		  </div>
		  
		  <div class="form-group">
		     <label>更改图片</label>
		    <input type="file" name="file" >
		  </div>
		  <div class="form-group">
		    <label >图片名称</label>
		    <input type="text" class="form-control" name="image" value="${item.image}">
		  </div>
		  <div class="form-group">
		    
		      <button type="submit" style="float:right" class="btn btn-success">确认更改</button>
		      <a href="manage" ><button style="float:left" class="btn btn-danger" type="button" >取消更改</button></a>
		  
		  </div>
		  
		</form>
		
		</div>
	<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4"></div>	 
	
	</div>  
	</div>    
</body>
</html>