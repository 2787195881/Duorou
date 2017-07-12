<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>哆禸文艺</title>
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
							<div style="float:right"> <span>当前在线人数：${applicationScope.count} </span></div>
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
			
	<!-- 首页轮播图 -->
	<div class="container">			
         <div class="row">              
             <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                 <!--轮播图-->
                 <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                     <ol class="carousel-indicators">
                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                      </ol>

                        <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                  <div class="item active" style="background: ;background-size: cover;">
                       <a href="addshop.action?id=d1"> <img src="images/duorou/d1.jpg" alt="轮播图1" class="img-responsive img-rounded"></a>
                        <div class="carousel-caption">
                        </div>
                        </div>
                  <div class="item">
                        <a href="addshop.action?id=d2"><img src="images/duorou/d2.jpg" alt="轮播图2" class="img-responsive img-rounded"></a>
                        <div class="carousel-caption">
                        </div>
                  </div>
                  <div class="item">
                       <a href="addshop.action?id=t2"><img src="images/duorou/t2.jpg" alt="轮播图3" class="img-responsive img-rounded"></a>
                        <div class="carousel-caption">
                        </div>
                   </div>
                 </div>
               </div>
            </div>

                    <!-- 分隔栏 -->
          <div class="clearfix" style="margin-bottom: 20px;"></div>
         <div class="row">
                   <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                     <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    	<hr>
                    	</div>
                    	<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    	<div style="text-align:center;"><span >哆禸文艺</span></div>
                    	</div>
                    	<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    	<hr>
                    	</div>
                    	</div>
                    	 <div class="clearfix" style="margin-bottom: 20px;"></div>
                    	</div>
                    	
                    	 
                    <!--商品区-->
                    <div class="container">
                     <div class="row">
                   
                    <div class="row">
                        <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                            <a href="addshop.action?id=t3"><img src="images/duorou/t3.jpg" class="img-responsive img-thumbnail"  style="margin-bottom: 10px;"/></a>
                          
                        </div>
                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                            <span>春红知立夏__________<br>
								 印记时光！____________<br>
								风属于天的
								<br>
								          我借来吹吹<br>
								__________ 却吹起人间烟火！
							</span>
                          
                        </div> 
                         
                        <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                           <a href="addshop.action?id=t9"><img src="images/duorou/t9.jpg"  style="margin-bottom: 10px;" class="img-responsive img-thumbnail" /></a>
                            
                        </div>
                        <div class="clearfix" style="margin-bottom: 20px;"></div>
                        <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
                            <p>明夏__________<br>
								 <br>
								__________ 立艺！
							</p>
                          
                        </div>
                        <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                           <a href="addshop.action?id=d9"><img src="images/duorou/d9.jpg" style="margin-bottom: 10px;" class="img-responsive img-thumbnail " /></a>
                           
                        </div>
                        <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
                            <p>哆禸__________<br>
								 <br>
								__________ 怡情！
							</p>
                          
                        </div>
                        <div class="clearfix" style="margin-bottom: 20px;"></div>
                        <div class="col-xs-6 col-sm-4">
                            <a href="addshop.action?id=p3"><img src="images/duorou/p3.jpg" style="margin-bottom: 10px;" class="img-responsive img-thumbnail" /></a>
                            
                        </div>
                        <div class="col-xs-6 col-sm-4">
                            <a href="addshop.action?id=d6"><img src="images/duorou/d6.jpg" style="margin-bottom: 10px;" class="img-responsive img-thumbnail" /></a>
                           
                        </div>
                        <div class="col-xs-6 col-sm-4">
                            <a href="addshop.action?id=p7"><img src="images/duorou/p7.jpg" style="margin-bottom: 10px;" class="img-responsive img-thumbnail" /></a>
                            
                        </div>

                    </div>

                </div>

                <!--右侧栅格-->
               <!--   <div class="col-xs-3 col-sm-2">

                </div>
                -->
                </div>
                </div>
           
        </div>
      </div>
 </div>  
   
  </body>
</html>