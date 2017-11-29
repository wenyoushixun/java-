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
			<div style="width: 300px; height: 300px; float: left;">
				<canvas id="userGenderChartCanvas"></canvas>
			</div>
			<div style="width: 500px; height: 450px; float: left;">
				<canvas id="userCreateChartCanvas"></canvas>
			</div>
		</div>
	</div>
	<!-- 引入 jQuery 库 -->
	<script src="${ctx}/plugins/jquery-2.2.4.min.js"></script>
	<!-- 引入 Chart.js 库 -->
	<script src="${ctx}/plugins/chart/Chart.min.js"></script>

	<!-- 引入自定义公用 js 库 -->
	<script src="${ctx}/js/common.js"></script>

	<script type="text/javascript">
        // 用户性别统计参数（饼状图）
        var userGenderChartConfig = {
            type : 'pie',
            data : {
                labels : ${userGenderData.names},
                datasets : [ {
                    data : ${userGenderData.values},
                    backgroundColor : [ "#FF6384", "#36A2EB" ]
                } ]
            },
            options : {
                title : {
                    display : true,
                    text : '用户性别分布统计'
                },
                responsive : true
            }
        };
        
        // 用户创建日期统计参数（折线图）
        var userCreateChartConfig = {
            type : 'line',
            data : {
                labels : ${userCreateData.names},
                datasets : [ {
                    label: "创建日期",
                    fill: false,
                    data : ${userCreateData.values}
                } ]
            },
            options : {
                title : {
                    display : true,
                    text : '用户创建日期统计'
                },
                responsive : true
            }
        };

        $(function() {
            // 生成用户性别统计图
            var userGenderChartCtx = document.getElementById("userGenderChartCanvas").getContext("2d");
            var  userGenderChartCanvas = new Chart(userGenderChartCtx, userGenderChartConfig);
            
            // 生成用户创建日期统计图            
            var userCreateChartCtx = document.getElementById("userCreateChartCanvas").getContext("2d");
            var  userCreateChartCanvas = new Chart(userCreateChartCtx, userCreateChartConfig);
        });
    </script>
</body>

</html>
