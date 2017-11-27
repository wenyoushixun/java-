<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户中心</title>
<meta name="viewport" content="width=1000, maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link href="${ctx}/resources/client/css/common.css?v=170323"
	rel="stylesheet" type="text/css" />
<link href="${ctx}/resources/client/css/user.css?v=170323"
	rel="stylesheet" type="text/css" />
<link rel="shortcut icon" href="${ctx}/resources/client/img/favicon.ico">

</head>
<body>

	<div class="top_full">
		<div class="top">
			<%@include file="../public/top.jsp"%>
		</div>
	</div>



	<div class="user_box">
		<div class="user_side">
			<div class="user_face">
				<img src="http://www.jieqinwang.com/Public/images/pc/boy.jpg"
					class="user_face_img">

				<div class="f14">
					<a href="/User/user_center.html">${sessionScope.user.name} </a>
				</div>

			</div>

			<div class="user_menu">
				<a id="to_my_tasks" href="${ctx}/rest/client/user/info" class="in"><i
					class="fa fa-user fa-fw"></i> 个人资料</a> <a id="to_my_tasks"
					href="${ctx}/rest/client/order/list"><i
					class="fa fa-shopping-cart fa-fw"></i> 我的订单</a>
			</div>
		</div>
		<div class="content">
			<div class="box" id="settings" style="display:block">
				<div class="header">
					<a id="my_info" class="in">我的资料</a>
				</div>
				<div id="info">
					<form name="from1" action="${ctx}/rest/client/user/update"
						id="myinfo" method="post">
						<table>
							<tr>
								<td width="80" align="right">姓名</td>
								<td><input type="text" name="name"
									value="${sessionScope.user.name}" class="form-control tipss"
									maxlength="6"></td>
							</tr>
							<tr>
								<td width="80" align="right">手机号</td>
								<td><input type="text" name="phone"
									value="${sessionScope.user.phone}" class="form-control tipss"
									maxlength="6" readonly="readonly"></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" class="user_btn" id="save"
									value="保 存"></td>
							</tr>
						</table>
					</form>
				</div>

				<div id="pw">
					<table>
						<tr>
							<td>输入原密码</td>
							<td><input type="password" class="form-control" size="15"
								id="oldPwd"></td>
						</tr>
						<tr>
							<td>设置新密码</td>
							<td><input type="password" class="form-control" size="15"
								id="newPwd"></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="button" class="user_btn" id="updatePwd"
								value="保 存" /></td>
						</tr>
					</table>
				</div>
			</div>

		</div>
	</div>
</body>
</html>