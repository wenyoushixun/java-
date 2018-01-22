<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<STYLE type="text/css">
			body{font-size:11pt;}
			table{border-collapse:collapse; border: none;}
			table td{padding: 4px; border: none;border: 1px #FFF solid;}
			.thead{font-size: 12pt;text-align: center;}
			.mgr td{text-align: center;}
			.evencol{background-color: rgb(191,229,213);}
			.oddcol{background-color: rgb(216,240,234);}
		</STYLE>
	</head>
	<body>
		<h3 align="center">学生信息管理</h3>
		<a href="javascript:toNewStudent();"><b>[添加新学生]</b></a>
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="780" class="mgr">
			<tr class="thead">
				<td class="evencol">学号</td><td class="oddcol">姓名</td><td class="evencol">性别</td><td class="oddcol">年龄</td><td class="evencol">职务</td><td class="oddcol">操作</td>
			</tr>
			<s:iterator value="students">
				<tr id="row_${studentId}">
					<td class="evencol">${studentNo}</td>
					<td class="oddcol">${realName}</td>
					<td class="evencol">${gengerStr}</td>
					<td class="oddcol">${age}</td>
					<td class="evencol">${roleStr}</td>
					<td class="oddcol">
						<a href="javascript:toUpdateStudent(${studentId});">[修改]</a><a href="javascript:delStudent(${studentId});">[删除]</a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</body>
</html>