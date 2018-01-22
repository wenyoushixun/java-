<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>管理员主页--班级管理系统</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/context.css"/>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.2.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/su.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/WdatePicker.js"></script>
	</head>
	<body>
		<div class="top_bar" align="center">
			<a href="${pageContext.request.contextPath}/index"><img src="${pageContext.request.contextPath}/images/top_bar.png"></a>
		</div>
		<table cellpadding="0" cellspacing="0" class="tlayout" align="center">
			<tr><td width="186px;">
			<div class="left_div">
				<p><s:property value="#session.currAdmin.adminName"/>，欢迎您&nbsp;&nbsp;<a href="../admin/admin_logout"><b>[登出]</b></a></p>
				<ul class="menu_ul">
					<li class="top_item">
						<a href="javascript:showStudentMgr();">班级成员管理</a>
					</li>
					<li class="top_item">
						<a href="javascript:showCheckinMgr();">考勤管理</a>
					</li>
					<li class="top_item">
						<a href="javascript:showFundMgr();">班费管理</a>
					</li>
					<li class="top_item">
						<a href="javascript:showScoreMgr();">成绩管理</a>
					</li>
					
					<li class="top_item">
						<a href="javascript:showVoteMgr();">网上投票</a>
					</li>
					<li class="top_item">
						<a href="javascript:showShareMgr();">文件共享</a>
					</li>
					<li class="top_item">
						<a href="javascript:showNoticeMgr();">通知管理</a>
					</li>
				</ul>
			</div></td><td width="806px;" align="left" valign="top">
			<div id="content">
				<h2 style="color:green;text-align: center;">欢迎使用班级管理系统</h2>
			</div></td>
			</tr>
		</table>
	</body>
</html>