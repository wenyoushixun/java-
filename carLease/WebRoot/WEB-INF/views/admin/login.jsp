<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>风险管理平台</title>
<link href="${ctx}/resources/admin/themes/css/login.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="login">
		<div id="login_header">
			
			
		</div>
		<div id="login_content">
			<div class="loginForm">
				<form action="${ctx}/rest/admin/login" method="post">
					
					<p>
						<label>用户名：</label>
						<input type="text" name="name" size="20" class="login_input" />
					</p>
					<p>
						<label>密码：</label>
						<input type="password" name="password" size="20" class="login_input" />
					</p>
					<p>
						${msg}
					</p>
					<div class="login_bar">
						<input class="sub" type="submit" value=" " />
					</div>
				</form>
			</div>
			<div class="login_banner"><img src="themes/default/images/login_banner.jpg" /></div>
			
		</div>
		<div id="login_footer">
			Copyright &copy; 2009 www.dwzjs.com Inc. All Rights Reserved.
		</div>
	</div>
</body>
</html>
