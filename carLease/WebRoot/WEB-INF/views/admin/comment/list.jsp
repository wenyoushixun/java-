<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<form id="pagerForm" method="post" action="${ctx}/rest/admin/comment/list">
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="rows" value="20" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
</form>
<div class="pageHeader">
	<form rel="pagerForm" onsubmit="return navTabSearch(this);" action="${ctx}/rest/admin/comment/list" method="post">
	<div class="searchBar">
		<ul class="searchContent">
			<li>
			
			</li>
			<li>
			</li>
		</ul>
		<!--
		<table class="searchContent">
			<tr>
				<td>
					我的客户：<input type="text"/>
				</td>
				<td>
					<select class="combox" name="province">
						<option value="">所有省市</option>
						<option value="北京">北京</option>
						<option value="上海">上海</option>
						<option value="天津">天津</option>
						<option value="重庆">重庆</option>
						<option value="广东">广东</option>
					</select>
				</td>
			</tr>
		</table>
		-->
		<div class="subBar">
		</div>
	</div>
	</form>
</div>

<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<ul class="toolBar">
			<li><a class="delete" href="${ctx}/rest/admin/comment/del?id={sid_user}"  target="ajaxTodo" title="确定要删除吗？" warn="请选择一个用户"><span>删除</span></a></li>
			</ul>
			
		</ul>
	</div>

	<div id="w_list_print">
	<table class="list" width="100%" targetType="navTab" asc="asc" desc="desc" layoutH="116">
		<thead>
			<tr>
				<th width="80" orderField="id" class="asc">用户好</th>
				<th width="100" orderField="phone" class="desc">手机号</th>
				<th width="100" orderField="password" class="desc">留言</th>
				<th width="100" orderField="createTime" class="desc">创建时间</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.rows}" var="item">
			<tr target="sid_user" rel="${item.id}">
				<td>${item.uId}</td>
				<td>${item.uPhone}</td>
				<td>${item.content}</td>
				<td>${item.createTime}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	
	<div class="panelBar" >
		
		
		<div class="pagination" targetType="navTab" totalCount="${page.pageInfo.total}" numPerPage="20" pageNumShown="${page.pageInfo.pages}" currentPage="${page.pageInfo.pageNum}"></div>

	</div>

</div>
