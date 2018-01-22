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
		</STYLE>
		
	</head>
	<body>
		<h3 align="center">学生信息管理</h3>
		<form id="studentForm2">
			<input type="hidden" value="${student.studentId}" name="student.studentId"/>
			<table border='1' cellpadding='2' cellspacing='0' width="80%" align="center">
				<tr class="thead">
					<td>学号</td><td>姓名</td><td>性别</td><td>年龄</td><td>登录密码</td><td>职务</td>
				</tr>
				<tr class="form_td">
					<td><input type="text" name="student.studentNo" value="${student.studentNo}" size="15"/></td>
					<td><input type="text" name="student.realName" value="${student.realName}" size="10"/></td>
					<td>
						<s:if test="student.gender eq 'M'">
						<input type="radio" value="M" name="student.genger" checked="checked">男
						<input type="radio" value="F" name="student.genger">女
						</s:if>
						<s:else>
						<input type="radio" value="M" name="student.genger">男
						<input type="radio" value="F" name="student.genger" checked="checked">女
						</s:else>
					</td>
					<td><input type="text" name="student.age" size="4" value="${student.age}"/></td>
					<td><input type="text" name="student.pwd" size="10" value="${student.pwd}"/></td>
					<td>
						<select name="student.role">
							<option value="0" selected="selected">学生</option>
							<option value="1">班长</option>
							<option value="2">学习委员</option>
							<option value="3">生活委员</option>
						</select>
					</td>
				</tr>
				<tr><td colspan="7" align="center"><input type="button" onclick="updateStudent();" value="提交"/><input type="reset"/></td></tr>
			</table>
		</form>
	</body>
</html>