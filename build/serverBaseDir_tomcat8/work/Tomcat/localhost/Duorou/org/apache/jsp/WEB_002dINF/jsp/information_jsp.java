/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-12 04:02:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/lenovo/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/C:/Users/lenovo/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1496496165329L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  <title>信息中心</title>\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write(" \t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/base.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/module.css\"  />\r\n");
      out.write("  </head>\r\n");
      out.write("    <body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t\t  <li role=\"presentation\"><a href=\"login\">亲，请先登录</a></li>\r\n");
      out.write("\t\t\t\t\t  <li role=\"presentation\"><a href=\"register\">免费注册</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"text-align:center\"><span >原创/复古/文艺</span><span>哆禸文艺</span></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"clearfix\" style=\"margin-bottom: 40px;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-8 col-md-8 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"position:relative\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \t  所有分类 \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a role=\"menuitem\" tabindex=\"-1\" href=\"tshirt.action?id=001\">T恤/外套</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a role=\"menuitem\" tabindex=\"-1\" href=\"dress.action?id=002\">连衣裙/半身裙</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li role=\"presentation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a role=\"menuitem\" tabindex=\"-1\" href=\"pants.action?id=003\">长裤/短裤</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <li role=\"presentation\"><a href=\" duorou\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"tshirt.action?id=001\">上衣</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"dress.action?id=002\">裙装</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"pants.action?id=003\">裤装</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <li role=\"presentation\"><a href=\"shoppingcart\">购物车</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <li role=\"presentation\"><a href=\"information\">信息中心</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\" style=\"margin-bottom: 60px;\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t\t       \r\n");
      out.write("\t\t       <div class=\"row\">\r\n");
      out.write("\t\t       <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\"><span class=\"glyphicon glyphicon-user\" style=\"font-size: 60px;color:lightblue\">:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t      <br>\r\n");
      out.write("\t\t      <br>\r\n");
      out.write("\t\t   <button type=\"button\" class=\"btn btn-warning popover-toggle\" \r\n");
      out.write("\t\t\t\t\ttitle=\"个人信息\" data-container=\"body\" \r\n");
      out.write("\t\t\t\t\tdata-toggle=\"popover\" data-placement=\"bottom\" \r\n");
      out.write("\t\t\t\t\tdata-content=\"用户名：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myself.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t邮箱：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myself.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t电话：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myself.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\t\t查看我的信息\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a href=\"newpwd\"><button type=\"button\" class=\"btn btn-warning popover-toggle\" >修改密码</button></a>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <script>\r\n");
      out.write("\t \t$(function () { $('.popover-show').popover('show');});\r\n");
      out.write("\t\t$(function () { $('.popover-hide').popover('hide');});\r\n");
      out.write("\t\t$(function () { $('.popover-destroy').popover('destroy');});\r\n");
      out.write("\t\t$(function () { $('.popover-toggle').popover('toggle');});\r\n");
      out.write("\t\t$(function () { $(\".popover-options a\").popover({html : true });});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t       <div class=\"col-xs-9 col-sm-9 col-md-9 col-lg-9\">\r\n");
      out.write("\t\t      \r\n");
      out.write("\t\t        <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6\"><a href=\"mycol\"><button class=\"btn btn-warning\"><span class=\"glyphicon glyphicon-heart\"></span>我的收藏</button></a>\r\n");
      out.write("\t\t        <p style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.message5}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t         <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6\"><a href=\"myord\"><button class=\"btn btn-warning\">  <span class=\"glyphicon glyphicon-th-list\"></span>我的订单</button></a  >\r\n");
      out.write("\t\t         \r\n");
      out.write("\t\t          ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t         </div>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t\t      \r\n");
      out.write("\t\t       <div class=\"clearfix\" style=\"margin-bottom: 60px;\"></div>\r\n");
      out.write("\t\t       \r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t\t    \r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/information.jsp(100,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/information.jsp(100,10) '${requestScope.collectionList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.collectionList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/information.jsp(100,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("goods");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t        <div class=\"shop-info\">\r\n");
          out.write("\t\t\t\t\t<div class=\"shop-info-img\"><a href=\"addshop.action?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"><img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.image }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" /></div>\r\n");
          out.write("\t\t\t\t\t<div class=\"shop-info-text\">\r\n");
          out.write("\t\t\t\t\t\t<h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.dipect }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"shop-price\">\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"shop-pices\">￥<b class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</b></div>\t\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"deletecollection.action?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.goodsid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" ><button class=\"btn btn-danger\" >删除</button></a>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/information.jsp(120,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/information.jsp(120,12) '${requestScope.orderList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.orderList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/information.jsp(120,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("order");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t        <div class=\"shop-info\">\r\n");
          out.write("\t\t\t\t\t<div class=\"shop-info-img\"><a href=\"addshop.action?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.goodsid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"><img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.image }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" /></div>\r\n");
          out.write("\t\t\t\t\t<div class=\"shop-info-text\">\r\n");
          out.write("\t\t\t\t\t\t<h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.dipect }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<h4>总价：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.totalprice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("\t\t\t\t\t\t<h4>数量：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.number }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("\t\t\t\t\t\t<h4>收货地址：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("\t\t\t\t\t\t<h4>收货人电话：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("\t\t\t\t\t\t<h4>订单状态：<span style=\"color:red\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.status}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span></h4>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
