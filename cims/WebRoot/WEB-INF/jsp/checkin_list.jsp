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
			.mgr{text-align: center;}
		</STYLE>
		
	</head>
	<body>
		<h3>考勤记录</h3>
		<table border='1' cellpadding='0' cellspacing='0' width="50%" class="mgr">
			<tr>
				<td>日期</td><td>学号</td><td>姓名</td><td>考勤状况</td>
			</tr>
			<s:iterator value="checkins">
				<tr>
					<td><s:date name="checkdate" format="yyyy-MM-dd"/></td><td>${student.studentNo}</td><td>${student.realName}</td><td>${typeStr}</td>
				</tr>
			</s:iterator>
		</table>
		
	</body>
</html>