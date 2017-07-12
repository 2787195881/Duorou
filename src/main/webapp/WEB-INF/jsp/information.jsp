<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  <title>信息中心</title>
  <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link type="text/css" rel="stylesheet" href="css/base.css" />
<link type="text/css" rel="stylesheet" href="css/module.css"  />
  </head>
    <body>
  <div class="container">
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
							<div style="text-align:center"><span >原创/复古/文艺</span><span>哆禸文艺</span></div>
							</div>
							
							 <div class="clearfix" style="margin-bottom: 40px;"></div>
							 
							<div class="col-xs-12 col-sm-8 col-md-8 col-lg-12">
							<div style="position:relative">
							<ul class="nav nav-pills">
										  <li role="presentation" class="dropdown">
											    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
											    	  所有分类 
											    </a>
											    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
											    
																	<li role="presentation">
																		<a role="menuitem" tabindex="-1" href="tshirt.action?id=001">T恤/外套</a>
																	</li>
																	<li role="presentation">
																		<a role="menuitem" tabindex="-1" href="dress.action?id=002">连衣裙/半身裙</a>
																	</li>
																	<li role="presentation">
																		<a role="menuitem" tabindex="-1" href="pants.action?id=003">长裤/短裤</a>
																	</li>
											  </ul>
										  </li>
										  <li role="presentation"><a href=" duorou">首页</a></li>
											<li role="presentation"><a href="tshirt.action?id=001">上衣</a></li>
											<li role="presentation"><a href="dress.action?id=002">裙装</a></li>
											<li role="presentation"><a href="pants.action?id=003">裤装</a></li>
										   <li role="presentation"><a href="shoppingcart">购物车</a></li>
										   <li role="presentation"><a href="information">信息中心</a></li>
						</ul>
					</div>
					</div>
					<div class="clearfix" style="margin-bottom: 60px;"></div>
				</div>
		       </div>
		       
		       <div class="row">
		       <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3"><span class="glyphicon glyphicon-user" style="font-size: 60px;color:lightblue">:${username}</span>
		      <br>
		      <br>
		   <button type="button" class="btn btn-warning popover-toggle" 
					title="个人信息" data-container="body" 
					data-toggle="popover" data-placement="bottom" 
					data-content="用户名：${myself.username}&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
									邮箱：${myself.email}&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
									电话：${myself.phone}">		查看我的信息
				</button>
				<a href="newpwd"><button type="button" class="btn btn-warning popover-toggle" >修改密码</button></a>
		        </div>
		        <script>
	 	$(function () { $('.popover-show').popover('show');});
		$(function () { $('.popover-hide').popover('hide');});
		$(function () { $('.popover-destroy').popover('destroy');});
		$(function () { $('.popover-toggle').popover('toggle');});
		$(function () { $(".popover-options a").popover({html : true });});
		
	
	</script>
		       <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
		      
		        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6"><a href="mycol"><button class="btn btn-warning"><span class="glyphicon glyphicon-heart"></span>我的收藏</button></a>
		        <p style="color:red">${requestScope.message5}</p>
		        <c:forEach items="${requestScope.collectionList}" var="goods">
		        <div class="shop-info">
					<div class="shop-info-img"><a href="addshop.action?id=${goods.goodsid}"><img src="images/${goods.image }" /></div>
					<div class="shop-info-text">
						<h4>${goods.dipect }</h4>
					</a>
						<div class="shop-price">
							<div class="shop-pices">￥<b class="price">${goods.price}</b></div>	
						</div>
						<a href="deletecollection.action?id=${goods.goodsid}" ><button class="btn btn-danger" >删除</button></a>
					</div>
					</div>
				</c:forEach>
				</div>
				
			
		        
		        
		         <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6"><a href="myord"><button class="btn btn-warning">  <span class="glyphicon glyphicon-th-list"></span>我的订单</button></a  >
		         
		          <c:forEach items="${requestScope.orderList}" var="order">
		        <div class="shop-info">
					<div class="shop-info-img"><a href="addshop.action?id=${order.goodsid}"><img src="images/${order.image }" /></div>
					<div class="shop-info-text">
						<h4>${order.dipect }</h4>
						
					</a>
						
							
							
						<h4>总价：${order.totalprice }</h4>
						<h4>数量：${order.number }</h4>
						<h4>收货地址：${order.address }</h4>
						<h4>收货人电话：${order.phone }</h4>
						<h4>订单状态：<span style="color:red">${order.status}</span></h4>
					</div>
					</div>
				</c:forEach>
		         </div>
		       </div>
		      
		       <div class="clearfix" style="margin-bottom: 60px;"></div>
		       
		       </div>
		       </div>
		    
  </body>
</html>