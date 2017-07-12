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
	<link href="http://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css" rel="stylesheet">
	<link href="bootstrap/bootstrap-spinner.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	<script src="bootstrap/jquery.spinner.min.js"></script>
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
						<div class="clearfix" style="margin-bottom: 5px;"></div>
					</div>
			       </div>
			       
   			<!-- 商品详情 -->
		  <div class="container">
			  <div class="row">
				  <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
				  </div>
				  
				  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				   <div class="table-responsive">
						  <table class="table">
						    <tbody>
						    
						      <tr>
						        <td colspan="3" style="text-align:center"><img src="images/${goods.image }" class="img-responsive"><br>
						        <span>${goods.dipect }</span><br>				        
						        <span>￥${goods.price }</span>&emsp;&emsp;&emsp;<span>库存：${goods.amount}</span>
						        </td>
						      </tr>	      		 
						      <tr>
						        <td style="width:195px;"> <a href="collect.action?id=${goods.goodsid }" ><button  class="btn btn-default">收藏</button></a><span>${message}</span></td>
						        <td style="width:195px;"><a href="buy.action?id=${goods.goodsid}"><button class="btn btn-default">立即购买</button></a></td>
						        <td style="width:195px;">
							        <form action="addcart">
							        <input type="hidden" name="goodsid" value="${goods.goodsid }"/>
							        <div class="input-group spinner" data-trigger="spinner" id="spinner">
										<input name="amount" type="text" class="form-control" value="1" data-max="10" data-min="1" data-step="1">	
										<div class="input-group-addon">
											<a href="javascript:;" class="spin-up" data-spin="up"><i class="icon-sort-up"></i></a>
											<a href="javascript:;" class="spin-down" data-spin="down"><i class="icon-sort-down"></i></a>
										</div>
										
									</div>				
							    	<input  class="form-control btn btn-warning" type="submit" value="加入购物车" />
							    	<p>${message2}</p>
							        </form>
							       
						       </td>
						      </tr>							          
						    </tbody>
						  </table>
					</div>
				</div>
				
				<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
				
				</div>
			</div>
		</div>	 	
	
		<!-- 评论区 -->
		
		<div class="container">
		<!--提交 商品评论 -->
				<div class="row">
					  <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					 <label>商品评论</label>
					<hr>
		<!--  	 	<form:form modelAttribute="remark" method="post" action="submitForm" >
			<table>
				<tr>
					
					<td><form:input type="hidden" path="username" value="${username}"/></td>
					<td><form:errors path="username" cssStyle="color:red"/></td>
				</tr>
				<tr>
					
					<td><form:input type="hidden" path="goodsid" value="${goods.goodsid }"/></td>
					<td><form:errors path="goodsid" cssStyle="color:red"/></td>
				</tr>
				<tr>
					
					<td><form:input  path="comment"/></td>
					<td><form:errors path="comment" cssStyle="color:red"/></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="提交"/></td>
				</tr>
		
			</table>
		</form:form>
		--> 	
		
		  <form:form method="post" action="submitForm" >
			
					<div class="input-group">
					<input type="hidden"  class="form-control" name="username" id="username" value="${username}"/>
				
					
					<input type="hidden"  class="form-control" name="goodsid" id="goodsid" value="${goods.goodsid }"/>
					
				
					
					<input type="text"  class="form-control" name="comment" id="comment"/>
					<span class="input-group-btn" class="clearfix">
						<button class="btn btn-default" type="submit">
							提交评论
						</button>
					</span>
					
					<span class="clearfix">${message1}</span>
					
				
				
		
		 </div>
		</form:form>
		 
		<!-- 商品评论展示 -->
	
					<div>
						<table class="table">
						 <tbody>
								<c:forEach items="${requestScope.remarkList}" var="remark">
									<tr>
									<td class="col-sm-1" > <span class="glyphicon glyphicon-user" ></span>${remark.username}:</td>
									<td class="col-sm-9" >${remark.comment}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>	
			</div>	
		</div>

	</div> 	
  </body>
</html>