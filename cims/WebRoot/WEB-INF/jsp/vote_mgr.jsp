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
		</script>
	</head>
	<body>
		<h3 align="center">投票管理</h3>
		<a href="javascript:showCreateVote();" style="display: none;"><b>[发起投票]</b></a>
		
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="99%" class="mgr">
			<tr class="thead">
			<td>序号</td><td>名称</td><td>发布日期</td><td>截止日期</td><td>发起人</td><td>操作</td>
			</tr>
			<s:iterator value="votes" status="row">
				<tr id="row_${voteId}">
					<td><s:property value="#row.count"/></td>
					<td>${title}</td>
					<td><s:date name="publishDate" format="yyyy-MM-dd"/></td>
					<td><s:date name="endDate" format="yyyy-MM-dd"/></td>
					<td>${student.realName}</td>
					<td>
						<a href="javascript:voteDetail(${voteId});">[查看]</a><a href="javascript:delVote(${voteId});">[删除]</a>
					</td>
				</tr>
			</s:iterator>
			<tr></tr>
		</table>
	</body>
</html>