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
			function showNewNoticeForm(){
				$('#newNoticeForm').css('display','block');
			}
			$(function(){
				$('#newForm').toggle(function(){
						$('#newNoticeForm').css('display','block');
					},
					function(){
						$('#newNoticeForm').css('display','none');
				});
			});
			
		</script>
	</head>
	<body>
		<h3 align="center">通知管理</h3>
		<a href="javascript:;" id="newForm"><b>[发布新通知]</b></a>
		<div id="newNoticeForm" style="display: none;">
			<fieldset>
			<form id="noticeForm">
				<table border="0">
					<tr align="center">
						<td class="form_td">标题</td>
						<td><input type="text" id="ntitle" size="49"/></td>
					</tr>
					<tr>
						<td class="form_td">通知内容</td>
						<td><textarea rows="3" cols="40" id="ncontent" style="font-size: 11pt;"></textarea></td>
					</tr>
					<tr><td colspan="6" align="center"><input type="reset"/>&nbsp;<input type="button" onclick="addNotice(0);" value="发布"/></td></tr>
				</table>
			</form>
			</fieldset>
		</div>
		<br>&nbsp;<br/>
		<table border='1' cellpadding='0' cellspacing='0' align="center" width="99%" class="mgr">
			<tr class="thead">
				<td class="evencol">标题</td><td class="oddcol">发布日期</td><td class="evencol">发布人</td><td class="oddcol">通知内容</td><td class="evencol">操作</td>
			</tr>
			<s:iterator value="notices">
				<tr id="row_${noticeId}">
					<td class="title">${title}</td>
					<td  class="oddcol"><s:date name="publishTime" format="MM月dd日 HH:mm"/></td>
					<td class="evencol">${publisherName}</td>
					<td class="notice oddcol">${content}</td>
					<td  class="evencol">
						<a href="javascript:showUpdateNotice(${noticeId});">[修改]</a><a href="javascript:delNotice(${noticeId});">[删除]</a>
					</td>
				</tr>
			</s:iterator>
			<tr></tr>
		</table>
	</body>
</html>