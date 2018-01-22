<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<STYLE type="text/css">
			body{font-size:11pt;}
			table{border-collapse:collapse; border: none;}
			table td{padding: 4px; border: none;border: 1px #FFF solid;}
			.thead td{font-size: 12pt;text-align: center; color: rgb(87,153,121); font-weight: bold;}
			.form_td{text-align: right;}
			.notice{ display:block; white-space:nowrap; overflow:hidden; text-overflow:ellipsis; -o-text-overflow:ellipsis; width: 316px;border: none;}
			.title{ display:block;  overflow:hidden; text-overflow:ellipsis; -o-text-overflow:ellipsis; width:176px; border: none;background-color: rgb(191,229,213);}
			.evencol{background-color: rgb(191,229,213);}
			.oddcol{background-color: rgb(216,240,234); width: 78px;}
		</STYLE>
<table border='1' cellpadding='0' cellspacing='0' align="center" width="90%">
	<tr class="thead">
		<td colspan="2">${notice.title}</td>
	</tr>
	<tr>
		<td class="oddcol">发布日期</td><td  class="evencol"><s:date name="notice.publishTime" format="MM月dd日 HH:mm"/></td>
	</tr>
	<tr>
		<td class="oddcol">发布人</td><td class="evencol">${notice.publisherName}</td>
	</tr>
	<tr>
		<td class="oddcol">通知内容</td><td class="evencol">${notice.content}</td>
	</tr>
	<tr>
	</tr>	
</table>