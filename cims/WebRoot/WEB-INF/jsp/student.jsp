<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>主页--班级管理系统</title>
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
			function showMyScore(){
				$('#content').addClass('loading');
				$('#content').load('student_showMyScore',function(){$('#content').removeClass('loading');});
			}
			function showMyCheckin(){
				$('#content').addClass('loading');
				$('#content').load('student_showMyCheckin',function(){$('#content').removeClass('loading');});
			}
			function showMyNotice(){
				$('#content').addClass('loading');
				$('#content').load('../notice_showMyNotice',function(){$('#content').removeClass('loading');});
			}
			function showMyFile(){
				$('#content').addClass('loading');
				$('#content').load('../file_myFiles',function(){$('#content').removeClass('loading');});
			}
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
				<p><s:property value="#session.currStudent.realName"/><s:if test="#session.currStudent.role eq 0">[同学]</s:if><s:elseif test="#session.currStudent.role eq 1">[班长]</s:elseif>
				<s:elseif test="#session.currStudent.role eq 2">[学习委员]</s:elseif><s:else>[生活委员]</s:else><a href="../student/student_logout"><b>[登出]</b></a></p>
				<ul class="menu_ul">
					<li class="top_item">
						<b onclick="javascript:location.href='toStudentPage'" style="cursor: pointer; color: rgb(0,102,51);">主页</b>
					</li>
					<li class="top_item">
						<s:if test="#session.currStudent.role eq 1 or #session.currStudent.role eq 2">
							<a href="javascript:showCheckinMgr();">考勤管理</a>
						</s:if>
						<s:else><a href="javascript:showMyCheckin();">我的考勤记录</a></s:else>
					</li>
					<s:if test="#session.currStudent.role eq 1 or #session.currStudent.role eq 3">
					<li class="top_item">
						<a href="javascript:showFundMgr();">班费管理</a>
					</li>
					</s:if>
					<s:if test="#session.currStudent.role eq 2">
					<li class="top_item">
						<a href="javascript:showScoreMgr();">成绩管理</a>
					</li>
					</s:if>
					<s:else>
					<li class="top_item">
						<a href="javascript:showMyScore();">查看成绩</a>
					</li>
					</s:else>
					
					<li class="top_item">
						<a href="javascript:showMyFile();">我共享的文件</a>
					</li>
					<li class="top_item">
						<a href="javascript:showMyNotice();">通知管理</a>
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
			</div></td>
			</tr>
		</table>
		<p style="margin-top: 20px;">&nbsp;</p>
	</body>
</html>