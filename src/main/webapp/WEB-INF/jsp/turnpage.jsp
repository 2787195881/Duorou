<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单跳转页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
		<div class="row">
		<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2"></div>
		
		<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
		<p>
          <span class="glyphicon glyphicon-ok-sign"></span> 
        	订单提交成功！
      	</p>
      	<p><a href="duorou">返回商城首页</a></p><p><a href="information">查看我的订单</a></p>
      	</div>
      <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2"></div>
      </div>
	</div>
</body>
</html>