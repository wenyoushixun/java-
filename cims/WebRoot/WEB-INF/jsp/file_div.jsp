<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
		<fieldset class="question">
		<legend>最近的共享文档</legend>
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="99%" class="mgr">
			<tr class="thead">
				<td class="evencol">文件标题</td><td class="oddcol">简介</td><td class="evencol">上传者</td><td class="oddcol">上传时间</td><td class="evencol">详情</td>
			</tr>
			<s:iterator value="files">
				<tr id="row_${fileId}">
					<td class="evencol">${title}</td>
					<td class="oddcol">${describ}</td>
					<td class="evencol"><s:if test="student eq null">管理员</s:if><s:else>${student.realName}</s:else></td>
					<td class="oddcol"><s:date name="publishTime" format="yyyy-MM-dd"/></td>
					<td class="evencol">
						<a href="javascript:showFileDetail(${fileId});">[查看]</a>
					</td>
				</tr>
			</s:iterator>
			<tr></tr>
		</table>
		</fieldset>
