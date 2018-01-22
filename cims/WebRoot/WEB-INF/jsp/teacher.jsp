<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>班导师主页--班级管理系统</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/context.css"/>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.2.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/su.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/WdatePicker.js"></script>
		<script type="text/javascript">
			$(function(){
				$('#votediv,#noticediv,#filediv').addClass('loading');
				$('#votediv').load('../vote/vote_viewVotes',function(){$('#votediv').removeClass('loading');});
				$('#noticediv').load('../notice_noticeDiv',function(){$('#noticediv').removeClass('loading');});
				$('#filediv').load('../file_fileDiv',function(){$('#filediv').removeClass('loading');});
			});
		</script>
		<STYLE type="text/css">
			table{border-color: #999;border-collapse:collapse;}
			table td{border-color: #999;padding: 4px;}
			.form_td{text-align: center;}
			.mgr td{text-align: center;}
			.question{margin: 0px auto; width: 94%; border: 1px solid; border-color: rgb(137,186,162); padding: 8px; margin-bottom: 8px;}
			legend{color: rgb(0,102,51); font-weight: bold;}
		</STYLE>
	</head>
	<body>
		<div class="top_bar" align="center">
			<a href="${pageContext.request.contextPath}/index"><img src="${pageContext.request.contextPath}/images/top_bar.png"></a>
		</div>
		<table cellpadding="0" cellspacing="0" class="tlayout" align="center">
			<tr><td width="186px;">
			<div class="left_div">
				<p><s:property value="#session.currTeacher.realName"/>老师，欢迎您<a href="../teacher/teacher_logout"><b>[登出]</b></a></p>
				<ul class="menu_ul">
					<li class="top_item">
						<a href="javascript:showCheckinMgr();">考勤管理</a>
					</li>
					<li class="top_item">
						<a href="javascript:showScoreMgr();">成绩管理</a>
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
				<!-- 通知栏面板 -->
				<div id="noticediv">
				
				</div>
				<!-- 投票面板 -->
				<div id="votediv">
				
				</div>
				<!-- 文件共享面板 -->
				<div id="filediv">
				
				</div>
			</div>
			</td>
			</tr>
		</table>
		<br/><br/>
	</body>
</html>