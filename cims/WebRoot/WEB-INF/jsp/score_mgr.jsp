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
		<h3 align="center">成绩管理</h3>
		<a href="javascript:showNewScoreForm();"><b>[添加成绩记录]</b></a>
		<div id="newScoreForm" style="display: none;">
			<fieldset>
			<form id="scoreForm">
				<table border="0">
					<tr align="center" class="thead">
						<td>学号</td><td>姓名</td><td>课程名称</td><td>任课教师</td><td>学分</td><td>成绩</td>
					</tr>
					<tr>
						<td>
							<s:select id="sno" list="students" listValue="studentNo" listKey="studentId" headerValue="-请选择-" headerKey="-1" 
								theme="simple" onchange="showName(this);" name="score.student.studentId"></s:select>
						</td>
						<td><input type="text" id="sname" disabled="disabled" size="14" style="color: #000; text-align: center;"/></td>
						<td><input type="text" name="score.scoreName" size="28"/></td>
						<td><input type="text" name="score.teacher" size="14"/></td>
						<td><input type="text" name="score.credit" size="10"/></td>
						<td><input type="text" name="score.score" size="10"/></td>
					</tr>
					<tr><td colspan="6" align="center"><input type="reset"/>&nbsp;<input type="button" value="提交" onclick="addScore();"/></td></tr>
				</table>
			</form>
			</fieldset>
		</div>
		<br>&nbsp;<br/>
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="99%" class="mgr">
			<tr class="thead">
				<td class="evencol">学号</td><td class="oddcol">姓名</td><td class="evencol">课程名称</td><td class="oddcol">任课教师</td><td class="evencol">学分</td><td class="oddcol">成绩</td><td class="evencol">操作</td>
			</tr>
			<s:iterator value="scores">
				<tr id="row_${scoreId}">
					<td class="evencol">${student.studentNo}</td>
					<td class="oddcol">${student.realName}</td>
					<td class="evencol">${scoreName}</td>
					<td class="oddcol">${teacher}</td>
					<td class="evencol">${credit}</td>
					<td class="oddcol"><b>${score}</b></td>
					<td class="evencol">
						<a href="javascript:showUpdateScore(${scoreId});">[修改]</a><a href="javascript:delScore(${scoreId});">[删除]</a>
					</td>
				</tr>
			</s:iterator>
			<tr></tr>
		</table>
	</body>
</html>