<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
		<STYLE type="text/css">
			body{font-size:11pt;}
			table{border-collapse:collapse; border: none;}
			table td{padding: 4px; border: none;border: 1px #FFF solid;}
			.thead td{font-size: 12pt;text-align: center; color: rgb(87,153,121); font-weight: bold;}
			.form_td{text-align: right; width: 80px;}
			.evencol{background-color: rgb(191,229,213);}
			.oddcol{background-color: rgb(216,240,234);}
		</STYLE>
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="90%">
			<tr class="thead">
				<td colspan="2">${shareFile.title}</td>
			</tr>
			<tr>
				<td class="oddcol form_td">上传日期</td><td  class="evencol"><s:date name="shareFile.publishTime" format="yyyy-MM-dd"/></td>
			</tr>
			<tr>
				<td class="oddcol form_td">发布人</td><td class="evencol"><s:if test="student eq null">管理员</s:if><s:else>${shareFile.student.realName}</s:else></td>
			</tr>
			<tr>
				<td class="oddcol form_td">简介</td><td class="evencol">${shareFile.describ}</td>
			</tr>
			<tr>
				<td colspan="2" align="center">${shareFile.fileName}<a href="../file_download?status=${shareFile.fileId}"><b>[下载]</b></a></td>
			</tr>	
		</table>
