<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<STYLE type="text/css">
			body{font-size:11pt;}
			table{border-color: #999;border-collapse:collapse;}
			table td{border-color: #999;padding: 4px;}
			.thead{font-size: 12pt;text-align: center;}
			.form_td{text-align: center;}
			.msg{color: red; font-size: 10pt;}
		</STYLE>
		
	</head>
	<body>
		<h3 align="center">考勤管理</h3>
		<div>
			<h3>查看考勤记录</h3>
			选择日期：<input id="viewdate" type="text" onClick="WdatePicker()" size="12"/>&nbsp;<input type="submit" value="查看" onclick="findCheckinList();"/>
			<hr style="color: #CCCCCC;"/>
			<h3>添加考勤记录</h3>
			<table>
				<tr><td>日期</td><td><input id="cdate" type="text" onClick="WdatePicker()" size="10"/></td><td class="msg"></td></tr>
				<tr>
					<td>姓名</td>
					<td>
						<s:select id="csno" list="students" listValue="realName" listKey="studentId" headerValue="-请选择-" headerKey="-1" theme="simple"></s:select>
					</td>
					<td class="msg"></td>
				</tr>
				<tr>
					<td>状态</td><!-- 类型：0：正常；1：迟到；2：早退；3：旷课；4：请假 -->
					<td>
						<select style="width:82px;" id="ctype">
							<option value="0">正常</option>
							<option value="1">迟到</option>
							<option value="2">早退</option>
							<option value="3">旷课</option>
							<option value="4">请假</option>
						</select>
					</td>
				</tr>
				<tr><td></td><td><input type="button" value="提交" onclick="addCheckin();"/></td></tr>
			</table>
		</div>
	</body>
</html>