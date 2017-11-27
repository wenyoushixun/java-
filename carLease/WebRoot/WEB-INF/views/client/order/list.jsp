<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户中心</title>
<meta name="viewport" content="width=1000, maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link href="${ctx}/resources/client/css/common.css?v=170323"
	rel="stylesheet" type="text/css" />
<link href="${ctx}/resources/client/css/user.css?v=170323"
	rel="stylesheet" type="text/css" />
<link rel="shortcut icon" href="${ctx}/resources/client/img/favicon.ico">


</head>
<body>
	<div class="top_full">
		<div class="top">
			<%@include file="../public/top.jsp"%>
		</div>
	</div>
	<div class="user_box">

		<div class="user_side">
			<div class="user_side">
				<div class="user_face">
					<img src="http://www.jieqinwang.com/Public/images/pc/boy.jpg"
						class="user_face_img">

					<div class="f14">
						<a href="/User/user_center.html">${sessionScope.user.name} </a>
					</div>

				</div>

				<div class="user_menu">
					<a id="to_my_tasks" href="${ctx}/rest/client/user/info"><i
						class="fa fa-user fa-fw"></i> 个人资料</a> <a id="to_my_tasks"
						href="${ctx}/rest/client/order/list" class="in"><i
						class="fa fa-shopping-cart fa-fw"></i> 我的订单</a>
				</div>
			</div>
		</div>
		<div class="content">
			<div class="box" id="order">
				<div class="header_a">
					<div class="tab">

						<a href="${ctx}/rest/client/order/list?status=0"
							<c:if test="${status==0}">class="in"</c:if>>预约中</a> <a
							href="${ctx}/rest/client/order/list?status=1"
							<c:if test="${status==1}">class="in"</c:if>>预约成功</a> <a
							href="${ctx}/rest/client/order/list?status=2"
							<c:if test="${status==2}">class="in"</c:if>>预约失败</a> <a
							href="${ctx}/rest/client/order/list?status=99"
							<c:if test="${status==99}">class="in"</c:if>>已取消</a>
					</div>
				</div>

				<div class="p20">
					<ul>
						<c:forEach items="${page.rows}" var="item">
							<li class="order_list">
								<div class="order_details">
									<div class="order_summary f18">
										<c:if test="${status==0}">
										<div class="s_1 red">预约中</div>
										</c:if>
										<c:if test="${status==1}">
										<div class="s_1 green">预约成功</div>
										</c:if>
										<c:if test="${status==2}">
										<div class="s_1 garys">预约失败</div>
										</c:if>
										<c:if test="${status==99}">
										<div class="s_1 garys">已取消</div>
										</c:if>
										
									
									</div>
									<table width="100%">
										<tr>
											<th class="order_sub" colspan="2"><p
													class="light fl f12">订单编号：${item.id}&emsp;下单时间：${item.createTime}</p>
												<p class="fr">
													用车时间：<span class="f22">${item.useTime}</span>
												</p></th>
										</tr>
										<tr>
											<td class="order_items">
												<ul class="goods_list">

													<li data-t="奥迪">
														<div class="goods_thumb">
															<a href="/Details/index/id/5458.html" target="_blank"><img
																src="${ctx}/${item.pImg}" width="160" height="90"></a>
														</div>
														<p class="goods_name">${item.pName}</p>
														<p class="goods_info f13">
															${item.name} <span class="elight">|</span>
															${item.phone} <span class="elight">|</span>${item.content}
														</p>
													</li>

												</ul>
											</td>
											<c:if test="${status==0}">
											<td class="order_action"><a
												href="${ctx}/rest/client/order/updateStatus?id=${item.id}"
												class="action_btn f13 btn-red js_pay" >取消订单</a>
											</c:if>
										</tr>
									</table>
								</div>
							</li>
						</c:forEach>
					</ul>
				</div>



				<div class="page"></div>
			</div>


		</div>





	</div>



</body>
</html>