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
			.form_td{text-align: right;}
			.mgr td{text-align: center;}
			.notice{ display:block; white-space:nowrap; overflow:hidden; text-overflow:ellipsis; -o-text-overflow:ellipsis; width: 316px;border: none;}
			.title{ display:block;  overflow:hidden; text-overflow:ellipsis; -o-text-overflow:ellipsis; width:176px; border: none;background-color: rgb(191,229,213);}
			.evencol{background-color: rgb(191,229,213);}
			.oddcol{background-color: rgb(216,240,234);}
		</STYLE>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<h3 align="center">修改通知</h3>
		<div id="newNoticeForm">
			<fieldset>
			<form id="noticeForm">
				<table border="0">
					<tr align="center">
						<td class="form_td">标题</td>
						<td><input type="text" id="ntitle" size="49" value="${notice.title}"/></td>
					</tr>
					<tr>
						<td class="form_td">通知内容</td>
						<td><textarea rows="3" cols="40" id="ncontent" style="font-size: 11pt;">${notice.content}</textarea></td>
					</tr>
					<tr><td colspan="6" align="center"><input type="reset"/>&nbsp;<input type="button" onclick="updateNotice(${notice.noticeId});" value="重新发布"/></td></tr>
				</table>
			</form>
			</fieldset>
		</div>
		<br>&nbsp;<br/>
		
	</body>
</html>