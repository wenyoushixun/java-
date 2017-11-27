<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<form id="pagerForm" method="post" action="${ctx}/rest/admin/category/list">
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="rows" value="5" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
</form>
<div class="pageHeader">
	<form rel="pagerForm" onsubmit="return navTabSearch(this);" action="${ctx}/rest/admin/category/list" method="post">

	</form>
</div>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="${ctx}/rest/admin/category/editUI" target="navTab"><span>添加</span></a></li>
			<li><a class="delete" href="${ctx}/rest/admin/category/del?id={sid_user}"  target="ajaxTodo" title="确定要删除吗？" warn="请选择一个用户"><span>删除</span></a></li>
			<li><a class="edit" href="${ctx}/rest/admin/category/editUI?id={sid_user}" target="navTab" warn="请选择一个用户"><span>修改</span></a></li>	
		</ul>
	</div>

	<div id="w_list_print">
	<table class="list" width="100%" targetType="navTab" asc="asc" desc="desc" layoutH="116">
		<thead>
			<tr>
				<th colspan="1">id</th>
				<th colspan="1">品牌</th>
				<th colspan="1">创建时间</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${rows}" var="item">
			<tr target="sid_user" rel="${item.id}">
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.createTime}</td>
			</tr>
			<c:forEach items="${item.child}" var="item">
			<tr target="sid_user" rel="${item.id}">
				<td>${item.id}</td>
				<td>-----${item.name}</td>
				<td>${item.createTime}</td>
			</tr>
			</c:forEach>
			</c:forEach>
		</tbody>
	</table>
	</div>
	


</div>
