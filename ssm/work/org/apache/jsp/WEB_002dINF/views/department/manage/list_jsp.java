/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2017-11-16 07:46:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.department.manage;

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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("file:/Users/wenyou/.m2/repository/org/springframework/spring-webmvc/4.1.6.RELEASE/spring-webmvc-4.1.6.RELEASE.jar", Long.valueOf(1510209635000L));
    _jspx_dependants.put("jar:file:/Users/wenyou/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("/commons/taglibs.jsp", Long.valueOf(1510816672000L));
    _jspx_dependants.put("jar:file:/Users/wenyou/.m2/repository/org/springframework/spring-webmvc/4.1.6.RELEASE/spring-webmvc-4.1.6.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1427245024000L));
    _jspx_dependants.put("file:/Users/wenyou/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar", Long.valueOf(1510209656000L));
    _jspx_dependants.put("jar:file:/Users/wenyou/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/fmt.tld", Long.valueOf(1098682290000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"departmentManageListPanel\">\n");
      out.write("\t<div class=\"toolbar-menu-panel\">\n");
      out.write("\t\t<button class=\"btn btn-bg add-department-btn\">添加</button>\n");
      out.write("\t\t<button class=\"btn btn-bg remove-departments-btn\">删除</button>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"real-content-panel\">\n");
      out.write("\t\t<table class=\"table table-stripe table-hover\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<th class=\"check-all-btn cursor-pointer\" width=\"100px\">序号</th>\n");
      out.write("\t\t\t\t<th width=\"150px\">编码</th>\n");
      out.write("\t\t\t\t<th>名称</th>\n");
      out.write("\t\t\t\t<th>创建时间</th>\n");
      out.write("\t\t\t\t<th>操作</th>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\tvar $departmentManageListPanel = $(\"#departmentManageListPanel\");\n");
      out.write("\n");
      out.write("\t\t// 添加部门\n");
      out.write("\t\t$departmentManageListPanel.find(\".add-department-btn\").on(\"click\", function() {\n");
      out.write("\t\t\tloadMainContent(\"/department/content/add\", function() {\n");
      out.write("\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\tdepartmentId : -1\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t// 编辑部门\n");
      out.write("\t\t$departmentManageListPanel.find(\".edit-department-btn\").on(\"click\", function() {\n");
      out.write("\t\t\tvar $this = $(this);\n");
      out.write("\t\t\tvar departmentId = $this.parent().parent().data(\"id\");\n");
      out.write("\n");
      out.write("\t\t\tloadMainContent(\"/department/content/add\", function() {\n");
      out.write("\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\tdepartmentId : departmentId\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t// 删除部门\n");
      out.write("\t\t$departmentManageListPanel.find(\".remove-department-btn\").on(\"click\", function() {\n");
      out.write("\t\t\tvar $this = $(this);\n");
      out.write("\t\t\tvar departmentId = $this.parent().parent().data(\"id\");\n");
      out.write("\n");
      out.write("\t\t\t// 操作确认\n");
      out.write("\t\t\tif (!confirm(\"确定删除该部门？\")) {\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tdoAction(\"/department/content/remove\", {\n");
      out.write("\t\t\t\tdepartmentId : departmentId\n");
      out.write("\t\t\t}, function(data) {\n");
      out.write("\t\t\t\t// 刷新列表\n");
      out.write("\t\t\t\ttriggerCurrentMenu();\n");
      out.write("\t\t\t}, \"删除成功！\");\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// 选中所有\n");
      out.write("\t\t$departmentManageListPanel.find(\".check-all-btn\").on(\"click\", function () {\n");
      out.write("\t\t\t// 获取所有复选框数量\n");
      out.write("\t\t\tvar allItemNum = $departmentManageListPanel.find(\".department-item-id\").length;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 获取被选中的复选框数量\n");
      out.write("\t\t\tvar checkedItemNum = $departmentManageListPanel.find(\".department-item-id:checked\").length;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 对比复选框是否全部被选中\n");
      out.write("\t\t\tvar isChecked = allItemNum === checkedItemNum;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 如果全部被选中，则反选，否则全选\n");
      out.write("\t\t\t$departmentManageListPanel.find(\".department-item-id\").prop(\"checked\", !isChecked);\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// 删除多个部门\n");
      out.write("\t\t$departmentManageListPanel.find(\".remove-departments-btn\").on(\"click\", function () {\n");
      out.write("\t\t\t// 获取被选中复选框\n");
      out.write("\t\t\tvar checkedItems = $departmentManageListPanel.find(\".department-item-id:checked\");\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 非空判断\n");
      out.write("\t\t\tif (checkedItems.length === 0) {\n");
      out.write("\t\t\t\talert(\"请选择待删除部门！\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 操作确认\n");
      out.write("\t\t\tif (!confirm(\"确定删除选中部门？\")) {\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 获取所有被选中项的id列表\n");
      out.write("\t\t\tvar departmentIds = \"\";\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 循环遍历被选中项\n");
      out.write("\t\t\tcheckedItems.each(function () {\n");
      out.write("\t\t\t\tdepartmentIds += $(this).val() + \",\";\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// 截取多余字符\n");
      out.write("\t\t\tdepartmentIds = departmentIds.substr(0, departmentIds.length - 1);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tdoAction(\"/department/content/removes\", {\n");
      out.write("\t\t\t\tdepartmentIds: departmentIds\n");
      out.write("\t\t\t}, function () {\n");
      out.write("\t\t\t\t// 刷新列表\n");
      out.write("\t\t\t\ttriggerCurrentMenu();\n");
      out.write("\t\t\t}, \"删除成功！\");\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>");
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
      // /commons/taglibs.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /commons/taglibs.jsp(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/department/manage/list.jsp(19,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("department");
      // /WEB-INF/views/department/manage/list.jsp(19,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${departments }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/department/manage/list.jsp(19,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("status");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t<tr data-id=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("\t\t\t\t\t\t<td><input type=\"checkbox\" class=\"department-item-id\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">&nbsp;");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.code }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.createTime }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td>\n");
            out.write("\t\t\t\t\t\t\t<button class=\"btn btn-xs edit-department-btn\">\n");
            out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-pencil\"></i>\n");
            out.write("\t\t\t\t\t\t\t</button>\n");
            out.write("\t\t\t\t\t\t\t<button class=\"btn btn-xs remove-department-btn\">\n");
            out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-trash-o\"></i>\n");
            out.write("\t\t\t\t\t\t\t</button>\n");
            out.write("\t\t\t\t\t\t</td>\n");
            out.write("\t\t\t\t\t</tr>\n");
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
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}