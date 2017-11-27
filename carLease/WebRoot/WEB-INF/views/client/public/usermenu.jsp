<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="uri" value="${pageContext.request.requestURI}"/>


<div class="span3">
				
				<div class="account-container">
				
					<div class="account-avatar">
						<img src="img/headshot.png" alt="" class="thumbnail" />
					</div> <!-- /account-avatar -->
				
					<div class="account-details">
					
						<span class="account-name">${sessionScope.user.name}</span>
						
						<span class="account-role">登录账号：${sessionScope.user.loginName}</span>
						
						<span class="account-actions">
							
						</span>
					
					</div> <!-- /account-details -->
				</div> <!-- /account-container -->
				<hr />
				
				<ul id="main-nav" class="nav nav-tabs nav-stacked">
					<li  <c:if test="${fn:contains(uri, '/userinfo')}">class="active"</c:if> >
						<a href="${ctx}/user/user_info.action">
							<i class="icon-user"></i>
								个人信息			
						</a>
					</li>
					<li <c:if test="${fn:contains(uri, '/productlist')}">class="active"</c:if>>
						<a href="${ctx}/user/order_userpdList.action">
							<i class="icon-lock"></i>
							我的订单
						</a>
					</li>
					
				</ul>	
				<hr />
			</div> <!-- /span3 -->