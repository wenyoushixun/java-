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
			$(function(){
				$('#showNewFileForm').toggle(
					function(){
						$('#newFileForm').css('display','block');
					},
					function(){
						$('#newFileForm').css('display','none');
					});
			});
		</script>
	</head>
	<body>
		<h3 align="center">修改共享文件</h3>
		<div id="newFileForm">
			<fieldset>
			<form id="fileForm">
				<input type="hidden" value="${shareFile.fileId}" name="status"/>
				<table border="0">
					<tr>
						<td>文件</td><td><input type="file" name="file"/></td>
					</tr>
					<tr>
						<td>资源标题</td>
						<td><input type="text" name="shareFile.title" size="43" value="${shareFile.title}"/></td>
					</tr>
					<tr>
						<td>资源简介</td>
						<td><textarea rows="3" cols="35" name="shareFile.describ">${shareFile.describ}</textarea> </td>
					</tr>
					<tr><td colspan="6" align="center"><input type="reset"/>&nbsp;<input type="button" value="提交" onclick="updateFile();"/></td></tr>
				</table>
			</form>
			</fieldset>
		</div>
		<br>&nbsp;<br/>
	</body>
</html>