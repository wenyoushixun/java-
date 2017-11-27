<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>${mode.name}</title>
<meta name="viewport" content="width=1000, maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-transform" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${ctx}/resources/client/css/common.css?v=170323" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="${ctx}/resources/client/css/style.css?v=170331">
<link rel="shortcut icon"
	href="${ctx}/resources/client/img/favicon.ico">
</head>
<body>
	<div class="top_full">
		<%@include file="public/top.jsp" %>
	</div>

	<div class="crumbs_bar f14">
		<div class="crumbs_item">
			<a href="#">首页</a>
			<i class="fa fa-angle-right"></i><span>${model.name}</span>
		</div>
	</div>
	<div class="box">
		<div class="car_main">
			<div class="pic p20">
				<div class="photos">
					<ul class="holder">
						<li><img
							src="${ctx}/${model.img}"
							width="612" alt="${model.name}"></li>
					</ul>
					
					<div class="num">
						<ul></ul>
					</div>
				</div>
				<div class="info">
					

				</div>
				<div class="clr"></div>
			</div>



			<div class="choose">
				<form method="post" action="/Details/joinTeam">
					<div class="line">
						<h2>${model.name}</h2>
						
					</div>

					<div class="line">
						<div class="cost">
							<div class="dt" style="margin-top:2px;">费用</div>
							<div class="dd">
								<span class="booking">￥${model.amount}</span> <label class="tips" id="yukuan"><span
									class="redpacket"></span>
								</label>
							</div>
						</div>

					</div>

					<div class="line">
						<div class="row">
							<div class="dt">车身颜色</div>
							<div class="dd">
								${model.color}
							</div>
							<div class="clr"></div>
						</div>
						<div class="row">
							<div class="dt">车牌号</div>
							<div class="dd">
								${model.chepai}
							</div>
							<div class="clr"></div>
						</div>
						<div class="row">
							<div class="dt">车载人数：</div>
							<div class="dd">
								${model.zuowei}人
							</div>
							<div class="clr"></div>
						</div>
						
					</div>
					
					<div class="submit_holder">
						<input type="hidden" id="red" value="0"> <input
							type="hidden" id="book" value="0"> <input type="hidden"
							id="areaid" value="0">
						<a href="${ctx}/rest/client/order/toAdd?id=${model.id}" type="button" class="btn btn-red btn-normal submit fl">立即预订</a>
						
						<div class="clr"></div>
					</div>
				</form>
			</div>

			<div class="clr"></div>
		</div>

		<div class="details_side">

			<div class="sider_car">
				<div class="sider_car_header">
					<h2 class="f16">猜您喜欢</h2>
				</div>
				<ul>
					<c:forEach items="${page.rows}" var="item">
					<li><a href="${ctx}/rest/client/product/detail?id=${item.id}" title="${item.name}"
						target="_blank"> <img class="sider_car_face"
							src="${ctx}/${item.img}"
							alt="${item.name}" width="160" height="90" />
							<div class="f13">
								${item.name}<font class="red f14"> ￥${item.amount}</font> 起
							</div>
					</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="details_main">

			<div class="detbox">
				<div class="detbox_title">
					<h3>车辆描述</h3>
				</div>
				<p class="mt10 car_describe">${model.content}</p>
			</div>

			<div class="detbox">
				<div class="detbox_title">
					<h3>用户咨询</h3>
				</div>

				<div class="comment_content">
					<ul class="comment_ul" id="qa"></ul>
					<ul class="comment_ul">
						<li style="border-bottom:none"><img
							src="http://www.jieqinwang.com/Public/images/pc/boy.jpg"
							class="comment_head">
							<div class="comment_text_holder comment_text">
								<textarea name="contents" id="comment_text"
									placeholder="请输入您的问题"></textarea>
								<div class="comment_sub_holder">
									
									<button id="comment_btn" onclick="addComment()">立即留言</button>
								</div>
							</div>
							<div class="clr"></div></li>
					</ul>

				</div>
			</div>


		</div>
		<div class="clr"></div>
	</div>
</body>
<script type="text/javascript" src="${ctx}/resources/client/js/jquery.min.js"></script>
<script type="text/javascript">
	
	function addComment(){
		var content = $("#comment_text").val();
		var params = {content:content};
		$.ajax({
							url : '${ctx}/rest/client/comment/add',
							type : 'post',
							data : params,
							dataType : 'json',
							success : function(data) {
								console.log(data);
								if(data.statusCode==300){
									alert("请登录");
									window.open('${ctx}/rest/client/user/toLogin','_self');
								}else{
									$("#comment_text").val("");
									alert("留言成功");
								}
								
							},
							error : function() {
							},
							complete : function() {
							}
						});
	}

</script>
</html>