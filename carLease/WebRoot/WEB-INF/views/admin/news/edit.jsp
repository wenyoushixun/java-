<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<h2 class="contentTitle">caozuo</h2>
<div class="pageContent">
<form method="post" action="${ctx}/rest/admin/news/edit" class="pageForm required-validate" onsubmit="return iframeCallback(this);" novalidate="novalidate" target="callbackframe">
		<div class="pageFormContent nowrap" layouth="97" style="height: 421px; overflow: auto;">

			<dl>
				<dt>咨询号：</dt>
				<dd>
					<input type="text" name="id" value="${model.id}" readonly="readonly" maxlength="20" class=" textInput">
				</dd>
			</dl>
			<dl>
				<dt>标题：</dt>
				<dd>
					<input type="text" name="title" value="${model.title}" alt="请输入标题" maxlength="20" class="required textInput">
				</dd>
			</dl>
			
			<dl>
				<dt>内容：</dt>
				<dd>
					<textarea class="editor" name="content" id="myTextarea" rows="20" cols="100">${model.content}</textarea>
				</dd>
			</dl>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">提交</button></div></div></li>
				<li><div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div></li>
			</ul>
		</div>
	<input type="hidden" name="ajax" value="1"></form>
	</div>
	
	<script>
	$(function(){
		var content = $("#content").val();
		//$("#myTextarea").text(content);
	})
	
</script>