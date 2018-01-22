<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<fieldset class="question">
<legend>最近的投票</legend>
<s:if test="#session.currStudent != null"><a href="javascript:showCreateVote();"><b>[发起投票]</b></a></s:if>
<table border='1' cellpadding='0' cellspacing='0' align="center" width="99%" class="mgr">
	<tr class="thead">
	<td  class="evencol">序号</td><td  class="oddcol">名称</td><td  class="evencol">发布日期</td><td  class="oddcol">截止日期</td><td  class="evencol">发起人</td><td  class="oddcol">操作</td>
	</tr>
	<s:iterator value="votes" status="row">
		<tr id="row_${voteId}">
			<td class="evencol"><s:property value="#row.count"/></td>
			<td class="oddcol">${title}</td>
			<td class="evencol"><s:date name="publishDate" format="yyyy-MM-dd"/></td>
			<td class="oddcol"><s:date name="endDate" format="yyyy-MM-dd"/></td>
			<td class="evencol">${student.realName}</td>
			<td class="oddcol">
				<a href="javascript:toVoting(${voteId});">[投票]</a><a href="javascript:toVotingResult(${voteId});">[查看]</a>
			</td>
		</tr>
	</s:iterator>
	<tr></tr>
</table>
</fieldset>