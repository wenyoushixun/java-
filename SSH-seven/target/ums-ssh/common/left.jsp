<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 定义 ContextPath 变量 -->
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<div id="left" class="left">
	<ul class="menu">
		<li>
			<a href="${ctx}/user/list.action">用户查询</a>
		</li>
		<li>
			<a href="${ctx}/user/add.action">用户新增</a>
		</li>
		<li>
			<a href="${ctx}/user/analyze.action">用户分析</a>
		</li>
	</ul>
	<div class="head-avatar">
		<img src="${ctx}/images/avatar.png" />
		<h5>当前登录用户</h5>
	</div>
</div>