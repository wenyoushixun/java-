/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2018-01-15 04:08:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.security.authentication.BadCredentialsException;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("jar:file:/Users/wenyou/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("file:/Users/wenyou/.m2/repository/org/springframework/spring-webmvc/4.1.6.RELEASE/spring-webmvc-4.1.6.RELEASE.jar", Long.valueOf(1510209635000L));
    _jspx_dependants.put("file:/Users/wenyou/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1507706400000L));
    _jspx_dependants.put("jar:file:/Users/wenyou/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/Users/wenyou/.m2/repository/org/springframework/spring-webmvc/4.1.6.RELEASE/spring-webmvc-4.1.6.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1427245024000L));
    _jspx_dependants.put("/common/taglibs.jsp", Long.valueOf(1515397279000L));
    _jspx_dependants.put("jar:file:/Users/wenyou/.m2/repository/org/springframework/spring-webmvc/4.1.6.RELEASE/spring-webmvc-4.1.6.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1427245024000L));
    _jspx_dependants.put("jar:file:/Users/wenyou/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.springframework.security.authentication.BadCredentialsException");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en-us\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>轻实训-CRM</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"description\" content=\"轻实训\">\r\n");
      out.write("<meta name=\"author\" content=\"轻实训\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- 字体图标css 官网地址http://fontawesome.dashgame.com/ -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- 基于bootstrap的提示框架 下载地址https://github.com/CodeSeven/toastr -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap-toastr/toastr.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- 自定义css文件 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"login\" class=\"animated fadeInDown\">\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t<div id=\"logo-group\">\r\n");
      out.write("\t\t\t<span id=\"logo\"> 轻实训 CRM </span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"main\" role=\"main\">\r\n");
      out.write("\t\t<div id=\"content\" class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-7 col-lg-8 hidden-xs hidden-sm\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"txt-color-red login-header-big\">轻实训-客户关系管理系统</h1>\r\n");
      out.write("\t\t\t\t\t<div class=\"hero\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pull-left login-desc-box-l\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"paragraph-header\">CRM（Customer Relationship Management）。企业利用相应的信息技术以及互联网技术来协调企业与顾客间在销售、营销和服务上的交互，从而提升其管理方式，向客户提供创新式的个性化的客户交互和服务的过程。</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>演示用户：admin/admin 或 sales/sales</h4> \r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>为保证演示数据完整性，系统中“更新”和“删除”操作已经屏蔽</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-5 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"well no-padding\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/dologin\" method=\"post\" id=\"login-form\" class=\"smart-form\">\r\n");
      out.write("\t\t\t\t\t\t\t<header> 系统登录 </header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label\">登录名</label> <label class=\"input\"> <i class=\"icon-append fa fa-user\"></i> <input type=\"text\" name=\"username\"> <b class=\"tooltip tooltip-top-right\"><i class=\"fa fa-user txt-color-teal\"></i> 请输入登录名</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label\">登录密码</label> <label class=\"input\"> <i class=\"icon-append fa fa-lock\"></i> <input type=\"password\" name=\"password\"> <b class=\"tooltip tooltip-top-right\"><i class=\"fa fa-lock txt-color-teal\"></i> 请输入登录密码</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<section class=\"col col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"label\">验证码</label> <label class=\"input\"> <input type=\"text\" id=\"captchaValue\" name=\"captcha\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"note\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<section class=\"col col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"label login-label\">&nbsp;</label> <label class=\"input\"> <img class=\"login-captcha\" id=\"captcha\" alt=\"验证码\" onclick=\"changeCaptcha()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								    Object error = session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
											if (error != null) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"alert alert-warning fade in\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									    String errorMessage = ((Exception) error).getMessage();
													String errorHitKey = errorMessage;
													if (errorMessage == null || errorMessage.equals("Bad credentials")) {
														errorHitKey = "errors.password.mismatch";
													}
													session.removeAttribute("SPRING_SECURITY_LAST_EXCEPTION");
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  fmt:message
      org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
      try {
        _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fmessage_005f0.setParent(null);
        // /WEB-INF/views/login.jsp(92,9) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fmessage_005f0.setKey(errorHitKey);
        int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
        if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } finally {
        _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								    }
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<footer>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-block\" onclick=\"validation()\">登录</button>\r\n");
      out.write("\t\t\t\t\t\t\t</footer>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery压缩库，版本号query-2.0.2 jquey官网地址https://jquery.com -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-2.0.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-ui-1.10.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery UI 是一个建立在 jQuery JavaScript 库上的小部件和交互库 官网地址http://jqueryui.com/download -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jquery校验框架 官网地址https://jqueryvalidation.org/-->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-validate/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 基于bootstrap的提示框架 下载地址https://github.com/CodeSeven/toastr -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap-toastr/toastr.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("        $(function() {\r\n");
      out.write("            // 初始化验证码\r\n");
      out.write("            changeCaptcha();\r\n");
      out.write("\r\n");
      out.write("            // 登录form校验\r\n");
      out.write("            $(\"#login-form\").validate({\r\n");
      out.write("                // 校验规则\r\n");
      out.write("                rules : {\r\n");
      out.write("                    username : {\r\n");
      out.write("                        required : true\r\n");
      out.write("                    },\r\n");
      out.write("                    password : {\r\n");
      out.write("                        required : true,\r\n");
      out.write("                        minlength : 3,\r\n");
      out.write("                        maxlength : 20\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("\r\n");
      out.write("                // 校验提示\r\n");
      out.write("                messages : {\r\n");
      out.write("                    username : {\r\n");
      out.write("                        required : '请输入登录名'\r\n");
      out.write("                    },\r\n");
      out.write("                    password : {\r\n");
      out.write("                        required : '请输入密码'\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("\r\n");
      out.write("                // 不要改变一下的代码(使用方式)\r\n");
      out.write("                errorPlacement : function(error, element) {\r\n");
      out.write("                    error.insertAfter(element.parent());\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 刷新验证码\r\n");
      out.write("        function changeCaptcha() {\r\n");
      out.write("            $(\"#captcha\").attr(\"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/captcha/generate?temp=\" + Math.random());\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //回车触发登录\r\n");
      out.write("        $(document).keyup(function(event) {\r\n");
      out.write("            //点击回车触发\r\n");
      out.write("            if (event.keyCode == 13) {\r\n");
      out.write("                validation();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 利用 Ajax 方式验证码校验\r\n");
      out.write("        function validation() {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type : \"post\",\r\n");
      out.write("                url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/captcha/check',\r\n");
      out.write("                data : {\r\n");
      out.write("                    \"captcha\" : $(\"#captchaValue\").val()\r\n");
      out.write("                },\r\n");
      out.write("                success : function(result) {\r\n");
      out.write("                    // 如果返回的状态是0表示操作成功\r\n");
      out.write("                    if (result.status == 0) {\r\n");
      out.write("                        $(\"#login-form\").submit();\r\n");
      out.write("                    } else {\r\n");
      out.write("                        toastr.error('验证码错误！');\r\n");
      out.write("                        $(\"#captchaValue\").focus();\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /common/taglibs.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /common/taglibs.jsp(7,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/common/taglibs.jsp(7,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    }
    return false;
  }
}
