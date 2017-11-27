<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>婚车租赁</title>
		<meta name="viewport" content="width=1000, maximum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-transform" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link href="${ctx}/resources/client/css/common.css?v=170323" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="${ctx}/resources/client/css/search/style.css">
		<link rel="shortcut icon" href="${ctx}/resources/client/img/favicon.ico">

	</head>

	<body>
		<div class="top_full">
			<%@include file="public/top.jsp" %>
		</div>
		<div class="login-mask"></div>
		<div class="login" style="display: block;">
			<div class="login_tab">
				<div class="login_tab_item">登录</div>
			</div>
			<form name="loginform" method="post" action="${ctx}/rest/client/user/reg" id="loginform" onsubmit="return dosub()">
				<div class="form_holder">
					
					<div class="form_line">
						<input type="text" value="" placeholder="姓名" class="form-control signup" name="name" id="name" maxlength="11">
					</div>
					
					<div class="form_line">
						<input type="text" value="" placeholder="手机号" class="form-control signup" name="phone" id="phone" maxlength="11">
					</div>

					<div class="form_line pwholder js_login_type">
						<span class="pwtext">密码</span>
						<input type="password" value="" placeholder="密码" class="form-control signup" name="password" id="pass">
					</div>
					<div class="form_line">
						${msg}
					</div>
					<div class="form_line">
						<button type="submit" class="btn btn-normal btn-red" id="submit">注册</button>
					</div>

					<div class="form_line form_footer f13">
						<a href="${ctx}/rest/client/user/toLogin" class="j_reg">已有账号</a>
					</div>

				</div>
			</form>
		</div>
		<div style="display:none">
	</body>
	<script src="${ctx}/resources/client/js/jquery.min.js"></script>
	<script type="text/javascript">
		function dosub(){
			
			var phone = $("#phone").val();
			var pass = $("#pass").val();
			var name = $("#name").val();
			if(isEpy(phone) || isEpy(pass) || isEpy(name)){
				alert("不能为空");
				return false;
			}
			var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
			if(!myreg.test(phone)) 
			{ 
			    alert('请输入有效的手机号码！'); 
			    return false; 
			} 
			return true;
		}
		
		function isEpy(variable1){
			if(variable1 == null || variable1 == undefined || variable1 == ''){
				return true;
			}
			return false;
		}
	</script>
	
</html>