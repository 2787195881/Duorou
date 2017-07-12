<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
 <title>订单管理</title>
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
	  <div class="clearfix" style="margin-bottom: 80px;"></div>
		 
		<div>
		<a href="orders" class="btn bg-primary">管理订单</a>	
		<a href="manage" class="btn bg-primary">管理商品</a>
		<p><font color="red">${message6}</font></p>
	</div>
	 
	 <form name="itemsForm" action="queryItems" method="post">
	<!--  <div>
		<a href="${pageContext.request.contextPath }/editItemsQuery" class="btn bg-primary">批量修改</a>
	</div>-->
查询条件：
	<div>
		<input type="text" name="itemsCustomer.name">
		<input type="button" value="查询" class="btn btn-primary" onclick="queryItems();"/>
	</div>
	<!--  <div>
		<input type="button" value="批量删除" class="btn btn-primary" onclick="delItems();">
	</div>-->
订单列表：
<div id="tshirt">
<table class="table table-striped">
<tr>

	<th>用户名</th>
	<th>商品图片</th>
	<th>商品描述</th>
	<th>商品价格</th>
	<th>购买数量</th>
	<th>总金额</th>
	<th>收货地址</th>
	<th>下单电话</th>
	<th>物流状态</th>
	<th>操作</th>
	<th>选择</th>
</tr>

<tr>

	<c:forEach orders="${orserList}" var="order">
	<td>${order.username}</td>
	<td><img style="width:100px;height:100px;" src="images/${order.image }" /></td>
	<td>${order.depict}</td>
	<td style="color:red"><b>￥${order.price}</b></td>
	<td>${order.number}</td>
	<td>${order.totalprice}</td>
	<td>${order.address}</td>
	<td>${order.phone}</td>
	<td>${order.status}</td>
	
	<td><a class="btn btn-primary btn-sm" href="alteritem.action?id=${order.orderid}">更新物流</a>
		<a class="btn btn-danger btn-sm" href="deleteItem.action?id=${order.orderid}">删除订单</a>
	</td>
	<td><input type="checkbox" name="goodsid" value="${order.goodsid}"></td>
</tr>
</c:forEach>

</table>
</div>

</form>


		     
		     

 </div>

  </body>
</html>