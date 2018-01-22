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
		<h3 align="center">投票详情</h3>
		<form action="../vote/vote_voting" id="votingForm" method="post">
			<fieldset class="question">
			<legend>主题信息</legend>
			<table>
				<tr>
					<td class="form_td">主题名称</td>
					<td>${vote.title}</td>
				</tr>
				<tr>
					<td class="form_td">简介</td>
					<td>${vote.describ}</td>
				</tr>
				<tr>
					<td class="form_td">截止日期</td>
					<td><s:date name="vote.endDate" format="yyyy-MM-dd"/></td>
				</tr>
			</table>
			</fieldset>
			<div id="questions">
				<s:iterator value="vote.questions" status="row">
					<fieldset class="question"  id="q0">
					<legend>问题<s:property value="#row.count"/></legend>
						<table>
							<tr>
								<td class="form_td"></td><td>${content}</td>
							</tr>
							<s:iterator value="options" status="opt">
							<tr>
								<td class="form_td">
									<input type="radio" name='votings[<s:property value="#row.index"/>].option.optionId' value="${optionId}"/>
								</td>
								<td>${content}</td>
							</tr>
							</s:iterator>
							<input type="hidden" name='votings[<s:property value="#row.index"/>].question.questionId' value="${questionId}"/>
							<input type="hidden" name='votings[<s:property value="#row.index"/>].student.studentId' value="${currStudent.studentId}"/>
						</table>
					</fieldset>
				</s:iterator>
				<input type="button" value="投票" onclick="voting();"/><br/>
			</div>
		</form>
	</body>
</html>