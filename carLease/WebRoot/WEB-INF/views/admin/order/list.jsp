<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<form id="pagerForm" method="post" action="${ctx}/rest/admin/order/list">
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="rows" value="20" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
	<input type="hidden" name="orderDirection" value="${param.orderDirection}" />
</form>
<div class="pageHeader">
	<form rel="pagerForm" onsubmit="return navTabSearch(this);" action="${ctx}/rest/admin/order/list" method="post">
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
			<li><a class="delete" href="${ctx}/rest/admin/order/del?id={sid_user}"  target="ajaxTodo" title="确定要删除吗？" warn="请选择一个订单"><span>删除</span></a></li>
		</ul>
		</ul>
	</div>

	<div id="w_list_print">
	<table class="list" width="100%" targetType="navTab" asc="asc" desc="desc" layoutH="116">
		<thead>
			<tr>
				<th width="80" orderField="id" class="asc">订单号</th>
				<th width="100" orderField="phone" class="desc">预订人手机号</th>
				<th width="100" orderField="password" class="desc">预订人姓名</th>
				<th width="100" orderField="name" class="desc">预订婚车号</th>
				<th width="100" orderField="name" class="desc">预订婚车名称</th>
				<th width="100" orderField="name" class="desc">留言</th>
				<th width="100" orderField="createTime" class="desc">预订时间</th>
				<th width="100" orderField="createTime" class="desc">创建时间</th>
				<th width="100" orderField="status" class="desc">状态</th>
				<th width="100" >操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.rows}" var="item">
			<tr target="sid_user" rel="${item.id}">
				<td>${item.id}</td>
				<td>${item.phone}</td>
				<td>${item.name}</td>
				<td>${item.pId}</td>
				<td>${item.pName}</td>
				<td>${item.content}</td>
				<td>${item.useTime}</td>
				<td>${item.createTime}</td>
				<td><c:if test="${item.status==0}">预约中</c:if> 
					<c:if test="${item.status==1}">预约陈功</c:if> 
					<c:if test="${item.status==2}">预约失败</c:if> 
					<c:if test="${item.status==99}">用户取消</c:if> </td>
				<td>
				<div>
					<c:if test="${item.status==0}">
					<a title="确定预约？" target="ajaxTodo" href="${ctx}/rest/admin/order/updateStatus?id=${item.id}&status=1" >确定预约</a>			
					<a title="确定取消？" target="ajaxTodo" href="${ctx}/rest/admin/order/updateStatus?id=${item.id}&status=2" >取消预约</a>	
					</c:if> 		
				</div></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	
	<div class="panelBar" >
		
		
		<div class="pagination" targetType="navTab" totalCount="${page.pageInfo.total}" numPerPage="20" pageNumShown="${page.pageInfo.pages}" currentPage="${page.pageInfo.pageNum}"></div>

	</div>

</div>
