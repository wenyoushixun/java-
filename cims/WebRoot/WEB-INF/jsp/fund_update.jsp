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
		</script>
	</head>
	<body>
		<h3 align="center">修改班费记录</h3>
		<div id="newFundForm">
			<fieldset>
			<form id="fundForm2">
				<input type="hidden" name="fund.fundId" value="${fund.fundId}"/>
				<table border="0">
					<tr>
						<td>日期<input type="text" id="mydate" onclick="WdatePicker();" name="fund.occurDate" value="<s:date name="fund.occurDate" format="yyyy-MM-dd"/>"/>
						收支类型<select name="fund.type"><option value="-1">支出</option><option value="1">收入</option></select>
						金额<input type="text" size="10" name="fund.count" value="${fund.count}"></td></tr>
					<tr><td>描述<input type="text" size="55" name="fund.describ" value="${fund.describ}"></td></tr>
					<tr><td align="center"><input type="reset" value="重设"/>&nbsp;&nbsp;<input type="button" value="提交" onclick="updateFund();"/></td></tr>
				</table>
			</form>
			</fieldset>
		</div>
		
	</body>
</html>