/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2018-01-15 04:10:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.opportunity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"opportunityTablePanel\" class=\"\">\r\n");
      out.write("\t<!-- 销售机会列表 -->\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<article class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div class=\"widget \">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div class=\"widget-body-toolbar\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"add-opportunity-btn btn btn-primary pull-left\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-plus\"></i> 新增\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"form-control list-search\" name=\"name\" id=\"name\" placeholder=\"销售机会名称\" type=\"text\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"search-opportunity-btn btn btn-success\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"reset-opportunity-btn btn btn-default\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-mail-reply\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"widget-body no-padding\">\r\n");
      out.write("\t\t\t\t\t\t<table id=\"opportunityTable\" class=\"table table-striped table-hover list-table\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>销售机会编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>客户名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>销售阶段</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>潜在客户来源</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>负责人</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>预计结束日期</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var opportunityTable;\r\n");
      out.write("    var $opportunityTablePanel;\r\n");
      out.write("    $(function() {\r\n");
      out.write("        // 定义数据列\r\n");
      out.write("        var columnData = [ {\r\n");
      out.write("            \"data\" : \"code\"\r\n");
      out.write("        }, {\r\n");
      out.write("            \"data\" : \"name\"\r\n");
      out.write("        }, {\r\n");
      out.write("            \"data\" : \"customer.name\"\r\n");
      out.write("        }, {\r\n");
      out.write("            \"data\" : \"status.name\"\r\n");
      out.write("        }, {\r\n");
      out.write("            \"data\" : \"resource.name\"\r\n");
      out.write("        }, {\r\n");
      out.write("            \"data\" : \"user.name\"\r\n");
      out.write("        }, {\r\n");
      out.write("            \"data\" : \"endDate\"\r\n");
      out.write("        }, {\r\n");
      out.write("            \"data\" : \"\"\r\n");
      out.write("        }, ];\r\n");
      out.write("        // 显示列数\r\n");
      out.write("        var columnNumber = columnData.length - 1;\r\n");
      out.write("        // 初始化表格信息\r\n");
      out.write("        opportunityTable = $qingshixun.dataTable($('#opportunityTable'), {\r\n");
      out.write("            \"ajax\" : {\r\n");
      out.write("                \"url\" : \"opportunity/list/data\",\r\n");
      out.write("                \"type\" : \"POST\"\r\n");
      out.write("            },\r\n");
      out.write("            \"columns\" : columnData,\r\n");
      out.write("            \"columnDefs\" : [ {\r\n");
      out.write("                \"data\" : null,\r\n");
      out.write("                \"defaultContent\" : \"<button type='button' title='修改' class='btn btn-primary btn-xs edit'>\" + \"<i class='fa fa-pencil'></i>\" + \"</button>\" + \"&nbsp;&nbsp;\" + \"<button type='button' title='删除' class='btn btn-danger btn-xs delete'>\" + \"<i class='fa fa-trash-o'></i>\" + \"</button>\",\r\n");
      out.write("                orderable : false, // 禁止排序\r\n");
      out.write("                targets : [ columnNumber ] // 最后一列禁止排序\r\n");
      out.write("            } ],\r\n");
      out.write("            \"createdRow\" : function(row, data, index) {\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            rowCallback : function(row, data) {\r\n");
      out.write("                // 编辑操作\r\n");
      out.write("                $('td', row).last().find(\".edit\").click(function() {\r\n");
      out.write("                    editOpportunity(data.id);\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // 删除操作\r\n");
      out.write("                $('td', row).last().find(\".delete\").click(function() {\r\n");
      out.write("                    deleteOpportunity(data.id);\r\n");
      out.write("                });\r\n");
      out.write("            },\r\n");
      out.write("            \"fnDrawCallback\" : function(row) {\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            \"fnServerParams\" : function(aoData) {\r\n");
      out.write("                aoData.columnNumber = columnNumber;\r\n");
      out.write("                aoData.name = $(\"#name\").val();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $opportunityTablePanel = $(\"#opportunityTablePanel\");\r\n");
      out.write("\r\n");
      out.write("        // 初始化新增按钮\r\n");
      out.write("        $opportunityTablePanel.find('.add-opportunity-btn').click(function() {\r\n");
      out.write("            loadContent(\"opportunity/form/0\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 初始化查询按钮\r\n");
      out.write("        $opportunityTablePanel.find('.search-opportunity-btn').click(function() {\r\n");
      out.write("            opportunityTable.ajax.reload();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 初始化重置按钮\r\n");
      out.write("        $opportunityTablePanel.find('.reset-opportunity-btn').click(function() {\r\n");
      out.write("            $(\"#name\").val(\"\");\r\n");
      out.write("            opportunityTable.ajax.reload();\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 编辑销售机会\r\n");
      out.write("    function editOpportunity(opportunityId) {\r\n");
      out.write("        loadContent(\"opportunity/form/\" + opportunityId);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 删除销售机会\r\n");
      out.write("    function deleteOpportunity(opportunityId) {\r\n");
      out.write("        $.confirm({\r\n");
      out.write("            title : false,\r\n");
      out.write("            content : '是否确认删除该销售机会？',\r\n");
      out.write("            confirmButton : '确认',\r\n");
      out.write("            cancelButton : '取消',\r\n");
      out.write("            confirm : function() {\r\n");
      out.write("                // 执行删除\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    type : \"post\",\r\n");
      out.write("                    async : false,\r\n");
      out.write("                    url : 'opportunity/delete/' + opportunityId,\r\n");
      out.write("                    data : {\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    dataType : \"json\",\r\n");
      out.write("                    success : function(result) {\r\n");
      out.write("                        // 如果返回的状态是-1表示该删除删除的时候被引用\r\n");
      out.write("                        if (result.status == 3) {\r\n");
      out.write("                            toastr.error('该销售机会已被引用,不能删除！');\r\n");
      out.write("                            return;\r\n");
      out.write("                        }\r\n");
      out.write("                        opportunityTable.ajax.reload();\r\n");
      out.write("                        toastr.success('销售机会删除成功！');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            },\r\n");
      out.write("            cancel : function() {\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
