<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<h2 class="contentTitle">caozuo</h2>
<div class="pageContent">
<form method="post" action="${ctx}/rest/admin/user/edit" enctype="multipart/form-data" class="pageForm required-validate" onsubmit="return iframeCallback(this);" novalidate="novalidate" target="callbackframe">
		<div class="pageFormContent nowrap" layouth="97" style="height: 421px; overflow: auto;">

			<dl>
				<dt>用户号：</dt>
				<dd>
					<input type="text" name="id" value="${model.id}" readonly="readonly" maxlength="20" class=" textInput">
				</dd>
			</dl>
			<dl>
				<dt>手机号：</dt>
				<dd>
					<input type="text" name="phone" value="${model.phone}" alt="请输入手机号" maxlength="20" class="required textInput">
				</dd>
			</dl>
			
			<dl>
				<dt>密码：</dt>
				<dd>
					<input type="text" name="password" value="${model.password}" alt="请输入密码" maxlength="20" class="required textInput">
				</dd>
			</dl>
			
			<dl>
				<dt>姓名：</dt>
				<dd>
					<input type="text" name="name" value="${model.name}" alt="请输入姓名" maxlength="20" class="required textInput">
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
		$("#myTextarea").val(content);
	})
	
</script>