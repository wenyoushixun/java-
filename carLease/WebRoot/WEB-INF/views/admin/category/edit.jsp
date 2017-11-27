<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>



<div class="pageContent">
	<form method="post" action="${ctx}/rest/admin/category/edit" class="pageForm required-validate" onsubmit="return validateCallback(this, navTabAjaxDone);">
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>品牌号：</label>
				<input name="id" type="text" size="30" value="${model.id}" readonly="readonly"/>
			</p>
			<p>
				<label>品牌名称：</label>
				<input name="name"  class="required" type="text" size="30" value="${model.name}" alt="请输入名称"/>
			</p>
			<p>
				<label>类型：</label>
				<select name="pId" class="required combox">
					<option value="0"<c:if test="${0==model.pId}">selected=selected</c:if>>顶级类别</option>
					<!-- 
					<c:forEach var="item" items="${tops}">
					<option value="${item.id}" <c:if test="${item.id==model.pId}">selected=selected</c:if> >${item.name}</option>
					</c:forEach>
					 -->
				</select>
			</p>
		</div>
		<div class="formBar">
			<ul>
				<!--<li><a class="buttonActive" href="javascript:;"><span>保存</span></a></li>-->
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>
