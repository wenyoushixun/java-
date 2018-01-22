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
		<script type="text/javascript">
			function showNewFundForm(){
				$('#newFundForm').css('display','block');
			}
			$(function(){
				$('#newForm').toggle(function(){
						$('#newFundForm').css('display','block');
					},
					function(){
						$('#newFundForm').css('display','none');
				});
			});
		</script>
	</head>
	<body>
		<h3 align="center">班费管理</h3>
		<a href="javascript:;" id="newForm"><b>[添加收支记录]</b></a>
		<div id="newFundForm" style="display: none;">
			<fieldset>
			<form id="fundForm">
				<table border="0">
					<tr><td>日期<input id="d11" type="text" onClick="WdatePicker()" name="fund.occurDate"/>
					收支类型<select name="fund.type"><option value="-1">支出</option><option value="1">收入</option></select>
					金额<input type="text" size="10" name="fund.count"></td></tr>
					<tr><td>描述<input type="text" size="55" name="fund.describ"></td></tr>
					<tr><td align="center"><input type="reset" value="重设"/>&nbsp;&nbsp;<input type="button" value="提交" onclick="addFund();"/></td></tr>
				</table>
			</form>
			</fieldset>
		</div>
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="99%" class="mgr">
			<tr class="thead">
				<td>日期</td><td>收支类型</td><td>金额</td><td>描述</td><td>操作</td>
			</tr>
			<s:iterator value="funds">
				<tr id="row_${fundId}">
					<td><s:date name="occurDate" format="yyyy-MM-dd"/></td>
					<s:if test="type eq 1"><td style="color: green;font-weight: bold;">收入</td></s:if>
					<s:else><td style="color: red;font-weight: bold;">支出</td></s:else>
					<td>${type*count}</td>
					<td>${describ}</td>
					<td>
						<a href="javascript:showUpdateFund(${fundId});">[修改]</a><a href="javascript:delFund(${fundId});">[删除]</a>
					</td>
				</tr>
			</s:iterator>
			<tr></tr>
			<tr>
				<td>合计</td><td colspan="3">${msg}</td>
			</tr>
		</table>
	</body>
</html>