<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>婚车租赁</title>
		<meta name="viewport" content="width=1000, maximum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-transform" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link href="${ctx}/resources/client/css/common.css?v=170323" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="${ctx}/resources/client/css/search/style.css">
		<link rel="shortcut icon" href="${ctx}/resources/client/img/favicon.ico">

	</head>

	<body>
		<div class="top_full">
			<%@include file="public/top.jsp" %>
		</div>
		
		<form action="${ctx}/rest/client/product/list" method="post" id="myform">
		<input hidden="hidden" name="cpId" id="cpId" value="${cpId}">
		<input hidden="hidden" name="orderType" id="orderType" value="${orderType}">
		<input hidden="hidden" name="page" id="page">
		<input hidden="hidden" name="rows" >
		<div class="selector">
			<div class="top_bar">
				<div class="crumbs_bar fl">
					<div class="crumbs_item fl">
						<a href="#">婚车租赁</a> <i class="fa fa-angle-right"></i>
						<a href="#"></a> </div>
					<div class="condition fl">
						
					</div>
				</div>
					<div class="clr"></div>

			</div>
			
			<div class="panel" id="brand_con">
				<label>品牌：</label>

				<div id="brand">
				
					<a <c:if test="${cpId==0}"> class='in'</c:if> rel="no_con" onclick="go_cid(0)" >不限</a>

					<div class="hot_brand">
						<c:forEach items="${tops}" var="item">
							<a onclick="go_cid(${item.id})" <c:if test="${cpId==item.id}"> class='in'</c:if> >${item.name}</a>
						</c:forEach>
					</div>
				</div>
				<div class="clr"></div>
			</div>


			<div class="panel filter">
				<div class="filter_item">
					<a onclick="go_ordertype(0)" <c:if test="${orderType==0}"> class='in'</c:if>>默认排序</a>
					<a onclick="go_ordertype(1)" <c:if test="${orderType==1}"> class='in'</c:if>>低价到高价</a>
					<a onclick="go_ordertype(2)" <c:if test="${orderType==2}"> class='in'</c:if>>高价到低价</a>
					<a onclick="go_ordertype(3)" <c:if test="${orderType==3}"> class='in'</c:if>>最新发布</a>
				</div>
				<div class="clr"></div>
			</div>
		</div>
		<div class="main" id="main">

			<ul>
				<c:forEach items="${page.rows}" var="item">
				<li>
					
					<div class="photos">
						<a href="${ctx}/rest/client/product/detail?id=${item.id}" target="_blank" title="${item.name}">
							<img src="${ctx}/${item.img}" alt="${item.name}">
						</a>
						<div class="search-this-holder">
							<a class="search-this"></a>
						</div>
					</div>
					<div class="info">
						<a class="f16" href="${ctx}/rest/client/product/detail?id=${item.id}" target="_blank" title="${item.name}">${item.name}<span class="new_car_price"></span></a>

						<div class="price">
							￥${item.amount}<span> 起</span> </div>

					</div>
					
				</li>
				</c:forEach>
				<div class="clr"></div>
			</ul>

			<div id="page">
				<ul>
					<c:forEach begin="1" end="${page.pageInfo.pages}" var="i">
					<c:if test="${page.pageInfo.pageNum == i}">
					<li  class="now">${i}</li>
					</c:if>
					<c:if test="${page.pageInfo.pageNum != i}">
					<li ><a  onclick="go_page(${i})">${i}</a></li>
					</c:if>	
					</c:forEach>
				</ul>
			</div>
		</div>
		</form>
		
		<div class="footer_cont">
			<div class="footer_full_top">
				<div class="footer">
				</div>
			</div>
			<div class="footer_full_bottom">
				<p>
					<a href="http://www.miitbeian.gov.cn" target="_blank">桂ICP备14005090号-1</a>&emsp;增值电信业务经营许可证：桂B2-20150033&emsp;
					<a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=45030502000016"><img src="http://www.jieqinwang.com/Public/images/pc/beian.png" style="position:relative;top:2px; left:0;margin-right:3px" />桂公网安备 45030502000016号</a>
				</p>
				<p>一瓶一钵科技 版权所有©2017&emsp;婚车租赁 中国专业的婚车解决方案平台</p>
			</div>

		</div>

		
		<div style="display:none">
	</body>
		<script type="text/javascript" src="${ctx}/resources/client/js/jquery.min.js"></script>
		<script type="text/javascript">
			function go_cid(id){
				$("#cpId").val(id);
				$("#myform").submit();
			}
			function go_page(page){
				$("#page").val(page);
				$("#myform").submit();
			}
			function go_ordertype(type){
				$("#orderType").val(type);
				$("#myform").submit();
			}
		</script>
</html>