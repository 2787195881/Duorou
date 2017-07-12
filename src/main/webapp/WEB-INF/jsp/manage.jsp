<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
 <title>商品管理</title>
  <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>


  <script type="application/javascript">
function delItems(){
document.itemsForm.action="${pageContext.request.contextPath }/deleteItems";
document.itemsForm.submit();
}
function queryItems(){
	document.itemsForm.action="${pageContext.request.contextPath }/queryItems";
	document.itemsForm.submit();
}
	</script>
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
		<a href="alorder" class="btn bg-primary">管理订单</a>	
		<a href="additem" class="btn bg-primary">新增商品</a>
		<p><font color="red">${message6}</font></p>
	</div>
	
	
	 
	 <form name="itemsForm" action="queryItems" method="post">
	
	<br/>
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
上衣列表：
<div id="tshirt">
<table class="table table-striped">
<tr>

	
	<th>商品名称</th>
	<th>商品图片</th>
	<th>商品价格</th>
	<th>商品描述</th>
	<th>操作</th>
	<th>选择</th>
</tr>
<c:forEach items="${tshirtList}" var="item">
<tr>

	
	<td>${item.goodsid}</td>
	<td><img style="width:100px;height:100px;" src="images/${item.image }" /></td>
	<td style="color:red"><b>￥${item.price}</b></td>
	<td>${item.dipect }</td>
	
	<td><a class="btn btn-primary btn-sm" href="alteritem.action?id=${item.goodsid}">修改</a>
		<a class="btn btn-danger btn-sm" href="deleteItem.action?id=${item.goodsid}">删除</a>
	</td>
	<td><input type="checkbox" name="goodsid" value="${item.goodsid}"></td>
</tr>
</c:forEach>

</table>
</div>
裙装列表：
<div id="dress">
<table class="table table-striped">
<tr>

	
	<th>商品名称</th>
	<th>商品图片</th>
	<th>商品价格</th>
	<th>商品描述</th>
	<th>操作</th>
	<th>选择</th>
</tr>
<c:forEach items="${dressList}" var="item">
<tr>

	
	<td>${item.goodsid}</td>
	<td><img style="width:100px;height:100px;" src="images/${item.image }" /></td>
	<td style="color:red"><b>￥${item.price}</b></td>
	<td>${item.dipect }</td>
	
	<td><a class="btn btn-primary btn-sm" href="alteritem.action?id=${item.goodsid}">修改</a>
		<a class="btn btn-danger btn-sm" href="deleteItem.action?id=${item.goodsid}">删除</a>
	</td>
	<td><input type="checkbox" name="goodsid" value="${item.goodsid}"></td>
</tr>
</c:forEach>

</table>
</div>
裤装列表：
<div id="pants">
<table class="table table-striped">
<tr>

	
	<th>商品名称</th>
	<th>商品图片</th>
	<th>商品价格</th>
	<th>商品描述</th>
	<th>操作</th>
	<th>选择</th>
</tr>
<c:forEach items="${pantsList}" var="item">
<tr>

	
	<td>${item.goodsid}</td>
	<td><img style="width:100px;height:100px;" src="images/${item.image }" /></td>
	<td style="color:red"><b>￥${item.price}</b></td>
	<td>${item.dipect }</td>
	
	<td><a class="btn btn-primary btn-sm" href="alteritem.action?id=${item.goodsid}">修改</a>
		<a class="btn btn-danger btn-sm" href="deleteItem.action?id=${item.goodsid}">删除</a>
	</td>
	<td><input type="checkbox" name="goodsid" value="${item.goodsid}"></td>
</tr>
</c:forEach>

</table>
</div>
</form>

<ul class="pagination">
    <li><a href="">&laquo;</a></li>
    <li><a href="#tshirt">1</a></li>
    <li><a href="#dress">2</a></li>
    <li><a href="#pants">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li><a href="#">&raquo;</a></li>
</ul>
		     
		     

 </div>

  </body>
</html>