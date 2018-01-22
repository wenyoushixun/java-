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
		<h3 align="center">文件共享管理</h3>
		<a href="javascript:;" id="showNewFileForm"><b>[上传文件]</b></a>
		<div id="newFileForm" style="display: none;">
			<fieldset>
			<form id="fileForm">
				<table border="0">
					<tr>
						<td>文件</td><td><input type="file" name="file"/></td>
					</tr>
					<tr>
						<td>资源标题</td>
						<td><input type="text" name="shareFile.title" size="43"/></td>
					</tr>
					<tr>
						<td>资源简介</td>
						<td><textarea rows="3" cols="35" name="shareFile.describ" ></textarea> </td>
					</tr>
					<tr><td colspan="6" align="center"><input type="reset"/>&nbsp;<input type="button" value="提交" onclick="addFile();"/></td></tr>
				</table>
			</form>
			</fieldset>
		</div>
		<br>&nbsp;<br/>
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="99%" class="mgr">
			<tr class="thead">
				<td class="evencol">文件标题</td><td class="oddcol">简介</td><td class="evencol">上传者</td><td class="oddcol">上传时间</td><td class="evencol">操作</td>
			</tr>
			<s:iterator value="files">
				<tr id="row_${fileId}">
					<td class="evencol">${title}</td>
					<td class="oddcol">${describ}</td>
					<td class="evencol"><s:if test="student eq null">管理员</s:if><s:else>${student.realName}</s:else></td>
					<td class="oddcol"><s:date name="publishTime" format="yyyy-MM-dd"/></td>
					<td class="evencol">
						<a href="javascript:showFileDetail(${fileId});">[查看]</a><a href="javascript:showUpdateFile(${fileId});">[修改]</a><a href="javascript:delFile(${fileId});">[删除]</a>
					</td>
				</tr>
			</s:iterator>
			<tr></tr>
		</table>
	</body>
</html>