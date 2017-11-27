<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="uri" value="${pageContext.request.requestURI}"/>

<div class="top">
				<div class="top_left">
					<a href="http://www.jieqinwang.com" class="logo" title="婚车租赁-中国专业的婚车解决方案平台"><img src="" alt="婚车租赁">
						<h1>婚车租赁</h1></a>
					
				</div>

				<div class="nav">
					<ul>

						<li>
							<a href="${ctx}/rest/client/product/list" title="首页">首 页</a>
						</li>
						<li>
							<a href="${ctx}/rest/client/news/detail?id=2" title="关于我们">关于我们</a>
						</li>
						<li>
							<a href="${ctx}/rest/client/news/detail?id=1" title="婚车资讯">婚车资讯</a>
						</li>
					</ul>
				</div>

				<div class="login_box">
					
					<c:if test="${sessionScope.user==null}">
					<div class="before">
						<a href="${ctx}/rest/admin/toLogin" class="j_login">管理员</a> /
						<a href="${ctx}/rest/client/user/toLogin" class="j_login">登录</a> /
						<a href="${ctx}/rest/client/user/toReg" class="j_reg">注册</a>
					</div>
					</c:if>
					<c:if test="${sessionScope.user!=null}">
					<div class="drop">
			            <a id="user_head" href="${ctx}/rest/client/user/info">
			            	<span id="name">${sessionScope.user.name} <i class="fa fa-angle-down"></i></span>
			            </a>    

			            <ul class="menu_down">
			              <li><a href="${ctx}/rest/client/user/info">进入个人中心</a></li>
			              <li><a href="${ctx}/rest/client/user/loginOut" id="login_out"><i class="fa fa-power-off fa-fw"></i>退出登录</a></li>
			            </ul>
          			</div>  
          					
					</c:if>
				</div>
			</div>
			
			
			<script src="${ctx}/resources/client/js/jquery.min.js"></script>
			<script >
				
				$(function(){
					$(".drop").mousemove(function(e){
						$(".menu_down").show();
					})
					
					$(".drop").mouseleave(function(){
					 $(".menu_down").hide();
					});
					
				})
				
				
				
			</script>
			