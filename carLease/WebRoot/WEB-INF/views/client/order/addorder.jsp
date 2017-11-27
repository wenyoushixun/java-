<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="zh_cn">
<head>
<meta charset="utf-8">
<title>订单信息</title>
<meta name="viewport" content="width=1000, maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="renderer" content="webkit">
<link href="${ctx}/resources/client/css/common.css?v=170323"
	rel="stylesheet" type="text/css" />
<link href="${ctx}/resources/client/css/user.css?v=170323"
	rel="stylesheet" type="text/css" />
	<link href="${ctx}/resources/client/css/ion.calendar.css?v=170323"
	rel="stylesheet" type="text/css" />
<link rel="shortcut icon" href="${ctx}/resources/client/img/favicon.ico">
<style type="text/css">
.goods_list li:after {
	content: "";
	display: block;
	width: 824px;
	position: absolute;
	right: 0;
	bottom: -10px;
	height: 0;
	border-top: 1px #e2e2e2 dotted;
}

.goods_list li:last-child:after {
	border: none;
}
</style>
</head>
<body>
	<div class="top_full">
		<div class="top">
			<%@include file="../public/top.jsp"%>
		</div>
	</div>
	<div class="order_box box">
		<div class="title">联系信息</div>
		<form action="${ctx}/rest/client/order/add" name="form" id="form"
			method="post" enctype="multipart/form-data" onsubmit="return dosub()">

			<table class="f14 order_details_tb">
				<tr>
					<th>&emsp;&emsp;用车时间</th>
					<td><input type="text" id="useT"
						class="form-control tip time_line_input" name="useT"
						style="width:100px"/></td>
				</tr>
				<tr>
					<th>&emsp;&emsp;&emsp;联系人</th>
					<td><input type="text" 
						class="form-control tip time_line_input" name="name" 
						style="width:100px" id="oname" /></td>
				</tr>
				<tr>
					<th>&emsp;&emsp;联系手机</th>
					<td><input type="text" 
						class="form-control tip time_line_input" name=phone 
						style="width:100px" id="phone" /></td>
				</tr>
				<tr height="160">
					<th class="remarks_label">&emsp;给车主留言
					</th>
					<td>
						<textarea name="content" value="" id="remarks"></textarea>

					</td>
				</tr>
				
			</table>
			<input type="hidden" name="marry_info">


			<div class="order_car_list">
				
				<ul class="goods_list">
					<li class="car_5458" data-t="奥迪" red="425" book="75">

						<div class="goods_thumb">

							<a href="${ctx}/rest/client/product/detail?id=${product.id}" target="_blank">
							<img
								src="${ctx}/${product.img}" style="width: 160px;height: 90px"></a>
						</div>
						<div class="goods_list_tb">
							<div class="goods_th_info">
								<p class="goods_name">
									${product.name}
								</p>
								<p class="goods_info f13 fl">
									座位：${product.zuowei}座
								</p>
							</div>
							<div class="goods_th_pay">
								<span class="red goods_red" data-red="75">&ensp;${product.amount}元&ensp;</span>
								&ensp;<span class="red J_used_pay"></span>
							</div>
						</div>
					</li>
				</ul>
			</div>
			<input type="hidden" name="pImg" value="${product.img}"> 
			<input type="hidden" name="pName" value="${product.name}"> 
			<input type="hidden" name="pId" value="${product.id}"> 
			
		<div class="order_view_total f15">
			<table>
				<tbody>
					<tr>
						<td colspan="2" class="total"><button
								class="btn btn-pay btn-red" id="order_submit">提交订单</button></td>
					</tr>
				</tbody>
			</table>
		</div>
		</form>
	</div>
</body>
<script type="text/javascript" src="${ctx}/resources/client/js/jquery.min.js"></script>
<script src="${ctx}/resources/client/js/moment.min.js"></script>
<script src="${ctx}/resources/client/js/moment.zh-cn.js"></script>
<script src="${ctx}/resources/client/js/ion.calendar.min.js"></script>
<script>
$(function(){
	$('#useT').each(function(){
		$(this).ionDatePicker({
			lang: 'zh-cn',
			format: 'YYYY-MM-DD hh:mm:ss'
		});
	});
});

function dosub(){
			var phone = $("#phone").val();
			var pass = $("#useT").val();
			var name = $("#oname").val();
			console.log(name)
			if(isEpy(pass) ){
				alert("时间不能为空");
				return false;
			}
			if(isEpy(name)){
				alert("姓名不能为空");
				return false;
			}
			if(isEpy(phone) ){
				alert("手机不能为空");
				return false;
			}
			var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
			if(!myreg.test(phone)) 
			{ 
			    alert('请输入有效的手机号码！'); 
			    return false; 
			} 
			
			
			return true;
		}
		
		function isEpy(variable1){
			if(variable1 == null || variable1 == undefined || variable1 == ''){
				return true;
			}
			return false;
		}
		
</script>

</html>