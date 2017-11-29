<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/paging" prefix="qsx"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户查询</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="轻实训用户注册案例">
<meta name="author" content="轻实训">
<!-- 定义 ContextPath 变量 -->
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!-- 引入自定义样式文件 -->
<link rel="stylesheet" href="${ctx}/css/style.css">
</head>
<body>
	<!-- 利用 struts 的 s:include 标签引入公用的 header.jsp 文件 -->
	<s:include value="/common/header.jsp" />
	
	<div class="content">
		<!-- 引入左侧菜单 left.jsp 文件 -->
		<s:include value="/common/left.jsp" />
		
		<div id="right" class="right">
			<div class="toolbar">
				<form method="get" action="list.action" name="searchForm">
					<label for="name">用户名称：</label>
					<s:textfield id="name" name="userModel.name" />
					<button type="submit">查询</button>
				</form>
			</div>
			<table class="table">
				<thead>
					<tr>
						<td>编号</td>
						<td>用户名称</td>
						<td>邮箱</td>
						<td>性别</td>
						<td>创建时间</td>
						<td>更新时间</td>
						<td align="center">操作</td>
					</tr>
				</thead>
				<tbody>
					<!-- 利用 JSTL 的 c:forEach 标签循环输出用户信息 -->
					<c:forEach var="item" items="${userPage.result}" varStatus="status">
						<tr>
							<td>${status.index + 1}</td>
							<td>${item.name }</td>
							<td>${item.email }</td>
							<td><c:if test="${item.gender=='male'}">
							     男
								</c:if> <c:if test="${item.gender=='female'}">
								 女
								</c:if></td>
							<td>${item.createTime }</td>
							<td>${item.updateTime }</td>
							<td align="center"><a href="${ctx}/user/edit.action?userId=${item.id }">编辑</a> <a href="JavaScript:doDeleteUser('${item.id }','${item.name }');">删除</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<br>
			<!-- 数据分页 TagLib -->
			<qsx:paging pageSize="${userPage.pageSize}" pageNo="${userPage.pageNo}" url="list.action" totalCount="${userPage.totalCount}" />
		</div>
	</div>
	<!-- 引入 jQuery 库 -->
	<script src="${ctx}/plugins/jquery-2.2.4.min.js"></script>

	<!-- 引入自定义公用 js 库 -->
	<script src="${ctx}/js/common.js"></script>

	<script type="text/javascript">
        //删除用户
        function doDeleteUser(userId, userName) {
            //提示是否确认删除
            var deleteConfirm = confirm("是否确认删除用户：" + userName + " ?");
            if (deleteConfirm == true) {
                document.location = "${ctx}/user/delete.action?userId=" + userId;
                alert("用户删除成功！");
            }
        }
    </script>
</body>

</html>
