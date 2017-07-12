<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
 	<meta name="format-detection" content="telephone=no">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
 <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/shopping.js"></script>

<link type="text/css" rel="stylesheet" href="css/base.css" />
<link type="text/css" rel="stylesheet" href="css/module.css"  />
 
  </head>
    <body>
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
					<div class="clearfix" style="margin-bottom: 5px;"></div>
				</div>
		       </div>
	 <div class="container">
		 <div class="row">
				
			<p>${message3}</p>	
	
		
	<!-- 	<div class="row">
			<c:forEach items="${goodsList}" var="goods">
			<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
				<div>
					<a href="addshop.action?id=${goods.goodsid }"><img src="images/${goods.image }" style="margin-bottom: 10px;" class="img-responsive">
					<br>
					</span>${goods.dipect}</span><span style="color:red;">&emsp;&emsp;￥${goods.price }</span>
					</a>
				</div>
			</div>
			<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4"></div>
			</c:forEach>
		</div>
	 -->
	</div>
	<div class="header">
	<h1>购物车</h1>
	
	<a href="#" class=""></a>
</div>
<!--头部结束-->
<div class="shopping">
	
	<div class="shop-group-item">
		<div class="shop-name">
			<input type="checkbox" class="check goods-check shopCheck">
			<h4><a href="duorou">哆禸文艺</a></h4>
			<div class="coupons"><span>领券</span><em>|</em><span>编辑</span></div>
		</div>
		<ul>
		<c:forEach items="${requestScope.cartList}" var="goods">
			<li>
				<div class="shop-info">
					<input type="checkbox" class="check goods-check goodsCheck">
					<div class="shop-info-img"><a href="addshop.action?id=${goods.goodsid}"><img src="images/${goods.image }" /></a></div>
					<div class="shop-info-text">
						<h4>${goods.dipect }</h4>
						<div class="shop-brief"><span>尺寸：均码</span><span>颜色:图片色</span></div>
						<div class="shop-price">
							<div class="shop-pices">￥<b class="price">${goods.price}</b></div>
							<div class="shop-arithmetic">
								<a href="javascript:;" class="minus">-</a>
								<span class="num">${goods.amount}</span>
								<a href="javascript:;" class="plus">+</a>
								<a href="deletecart.action?id=${goods.goodsid}" ><button class="btn btn-danger" >删除</button></a>
							</div>
							
						
						</div>
					</div>
				</div>
			</li>	
			</c:forEach>		
		</ul>
		<div class="shopPrice">本店总计：￥<span class="shop-total-amount ShopTotal">0.00</span></div>
	</div>	
</div>

<div class="payment-bar">
	<div class="all-checkbox"><input type="checkbox" class="check goods-check" id="AllCheck">全选</div>
	<div class="shop-total">
		<strong>总价：<i class="total" id="AllTotal">0.00</i></strong>
		<span>减免：123.00</span>
	</div>
	<a href="buy" class="settlement">结算</a>
</div>
</div>
</div>
  </body>
</html>