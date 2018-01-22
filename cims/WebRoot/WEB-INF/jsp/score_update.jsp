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
			.mgr td{text-align: center;}
		</STYLE>
	</head>
	<body>
		<h3 align="center">成绩管理 - 添加成绩</h3>
		<fieldset>
			<form id="scoreForm">
				<input type="hidden" name="score.scoreId" value="${score.scoreId}"/>
				<input type="hidden" name="score.student.studentId" value="${score.student.studentId}"/>
				<table border="0">
					<tr align="center">
						<td>学号</td><td width="95">姓名</td><td>课程名称</td><td>任课教师</td><td>学分</td><td>成绩</td>
					</tr>
					<tr>
						<td>${score.student.studentNo}<input type="hidden" name="score.student.studentNo" value="${score.student.studentNo}"/></td>
						<td align="center">${score.student.realName}<input type="hidden" name="score.student.realName" value="${score.student.realName}"/></td>
						<td><input type="text" name="score.scoreName" size="28" value="${score.scoreName}"/></td>
						<td><input type="text" name="score.teacher" size="14" value="${score.teacher}"/></td>
						<td><input type="text" name="score.credit" size="10" value="${score.credit}"/></td>
						<td><input type="text" name="score.score" size="10" value="${score.score}"/></td>
					</tr>
					<tr><td colspan="6" align="center"><input type="reset" value="重设"/>&nbsp;<input type="button" value="提交" onclick="updateScore();"/></td></tr>
				</table>
			</form>
		</fieldset>
		<br>&nbsp;<br/>
	</body>
</html>