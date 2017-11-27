<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<h2 class="contentTitle">caozuo</h2>
<div class="pageContent">
<form method="post" action="${ctx}/rest/admin/product/edit" enctype="multipart/form-data" class="pageForm required-validate" onsubmit="return iframeCallback(this);" novalidate="novalidate" target="callbackframe">
		<div class="pageFormContent nowrap" layouth="97" style="height: 421px; overflow: auto;">

			<dl>
				<dt>婚车号：</dt>
				<dd>
					<input type="text" name="id" value="${model.id}" readonly="readonly" maxlength="20" >
				</dd>
			</dl>
			<dl>
				<dt>婚车名称：</dt>
				<dd>
					<input type="text" name="name" value="${model.name}" alt="请输入婚车名称" maxlength="20" class="required textInput">
				</dd>
			</dl>
			<dl>
				<dt>婚车颜色：</dt>
				<dd>
					<input type="text" name="color" value="${model.color}" alt="请输入婚车颜色" maxlength="20" class="required textInput">
				</dd>
			</dl>
			<dl>
				<dt>婚车号码：</dt>
				<dd>
					<input type="text" name="chepai" value="${model.chepai}" alt="请输入婚车号码" maxlength="20" class="required textInput">
				</dd>
			</dl>
			<dl>
				<dt>图片：</dt>
				<dd>
				<input type="hidden" name="img" value="${model.img}"> 
				<input name="file" type="file" class="valid">
				</dd>
			</dl>
			<dl>
				<dt>品牌：</dt>
				<dd>
					<select name="cId" class="required combox">
					<option value="">请选择</option>
					<c:forEach var="item" items="${tops}">
					<option value="${item.id}" <c:if test="${item.id==model.cId}">selected=selected</c:if> >${item.name}</option>
					<c:forEach items="${item.child}" var="itemc">
						<option value="${itemc.id}" <c:if test="${itemc.id==model.cId}">selected=selected</c:if> >-----${itemc.name}</option>
					</c:forEach>
					</c:forEach>
					
				</select>
					
				</dd>
			</dl>
			<dl>
				<dt>价格：</dt>
				<dd>
					<input type="text" value="${model.amount}" name="amount" class="required digits textInput">
				</dd>
			</dl>
			<dl>
				<dt>座位数：</dt>
				<dd>
					<input type="text" value="${model.zuowei}" name="zuowei" class="required digits textInput">
				</dd>
			</dl>
			
			<dl class="nowrap">
				<dt>详细介绍：</dt>
				<dd>
				<textarea class="editor" name="content" id="myTextarea" rows="20" cols="100">${model.content}</textarea></dd>
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
		//$("#myTextarea").val(content);
	})
	
</script>