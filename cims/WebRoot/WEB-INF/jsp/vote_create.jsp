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
			.form_td{text-align: right;}
			.question{margin: 0px auto; width: 440px; border: 1px solid; border-color: rgb(137,186,162); padding: 8px; margin-bottom: 8px;}
			#questions{margin: 0px auto; width: 490px; margin-bottom: 20px;}
			legend{color: rgb(0,102,51); font-weight: bold;}
		</STYLE>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<h3 align="center">投票管理 - 发起新投票</h3>
		<form action="" id="voteForm">
			<fieldset class="question">
			<legend>主题信息</legend>
			<table align="center">
				<tr>
					<td class="form_td">主题名称</td>
					<td><input type="text" name="vote.title" size="50"/></td>
				</tr>
				<tr>
					<td class="form_td">简介</td>
					<td><textarea rows="3" cols="41" name="vote.describ"></textarea></td>
				</tr>
				<tr>
					<td class="form_td">截止日期</td>
					<td><input id="endDate" type="text" onClick="WdatePicker()" name="vote.endDate"/></td>
				</tr>
			</table>
			</fieldset>
			<div id="questions">
			<fieldset class="question"  id="q0">
			<legend>问题1</legend>
				<table>
					<tr>
						<td class="form_td">题目</td><td><input type="text" name="questions[0].content" size="50"/></td>
					</tr>
					<tr>
						<td class="form_td">选项1</td><td><input type="text" name="questions[0].opts[0].content" size="50"/></td>
					</tr>
					<tr>
						<td class="form_td">选项2</td><td><input type="text" name="questions[0].opts[1].content" size="50"/></td>
					</tr>
					<tr>
						<td class="form_td">选项3</td><td><input type="text" name="questions[0].opts[2].content" size="50"/></td>
					</tr>
				</table>
				<span><input type="button" value="添加选项" onclick="addOption(0,3);"/></span>
			</fieldset>
			
			<br/><span style="margin: 150px;"><input type="button" value="添加题目" onclick="addQuestion(0);" id="addButton"/>&nbsp;
			<input type="button" value="提交" onclick="createVote();"/></span><br/>
			</div>
		</form>
	</body>
</html>