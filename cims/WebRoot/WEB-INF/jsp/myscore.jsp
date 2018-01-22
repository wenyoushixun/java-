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
			.thead td{font-size: 12pt;text-align: center; color: rgb(87,153,121); font-weight: bold;}
			.form_td{text-align: center;}
			.mgr td{text-align: center;}
			.evencol{background-color: rgb(191,229,213);}
			.oddcol{background-color: rgb(216,240,234);}
		</STYLE>
		<script type="text/javascript">
			function showNewScoreForm(){
				$('#newScoreForm').css('display','block');
			}
			function showName(val){
				if(val.value == -1){
					$('#sname').val('请选择学号');
					return;
				}
				$.get(
					'../admin/admin_getStudentName',
					{'status':val.value},
					function(data){
						$('#sname').val(data);
					}
				);
			}
		</script>
	</head>
	<body>
		<h3 align="center">我的成绩</h3>
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="99%" class="mgr">
			<tr class="thead">
				<td class="evencol">学号</td><td class="oddcol">姓名</td><td class="evencol">课程名称</td><td class="oddcol">任课教师</td><td class="evencol">学分</td><td class="oddcol">成绩</td>
			</tr>
			<s:iterator value="scores">
				<tr id="row_${scoreId}">
					<td class="evencol">${student.studentNo}</td>
					<td class="oddcol">${student.realName}</td>
					<td class="evencol">${scoreName}</td>
					<td class="oddcol">${teacher}</td>
					<td class="evencol">${credit}</td>
					<td class="oddcol"><b>${score}</b></td>
				</tr>
			</s:iterator>
			<tr></tr>
		</table>
	</body>
</html>