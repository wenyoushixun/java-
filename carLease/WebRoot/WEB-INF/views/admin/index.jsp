<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>简单实用国产jQuery UI框架 - DWZ富客户端框架(J-UI.com)</title>

<link href="${ctx}/resources/admin/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${ctx}/resources/admin/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="${ctx}/resources/admin/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<link href="${ctx}/resources/admin/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>
<!--[if IE]>
<link href="${ctx}/resources/admin/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
<![endif]-->

<!--[if lt IE 9]><script src="${ctx}/resources/admin/js/speedup.js" type="text/javascript"></script><script src="${ctx}/resources/admin/js/jquery-1.11.3.min.js" type="text/javascript"></script><![endif]-->
<!--[if gte IE 9]><!--><script src="${ctx}/resources/admin/js/jquery-2.1.4.min.js" type="text/javascript"></script><!--<![endif]-->

<script src="${ctx}/resources/admin/js/jquery.cookie.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/jquery.validate.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/xheditor/xheditor-1.2.2.min.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/uploadify/scripts/jquery.uploadify.js" type="text/javascript"></script>

<!-- svg图表  supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+ -->
<script type="text/javascript" src="${ctx}/resources/admin/chart/raphael.js"></script>
<script type="text/javascript" src="${ctx}/resources/admin/chart/g.raphael.js"></script>
<script type="text/javascript" src="${ctx}/resources/admin/chart/g.bar.js"></script>
<script type="text/javascript" src="${ctx}/resources/admin/chart/g.line.js"></script>
<script type="text/javascript" src="${ctx}/resources/admin/chart/g.pie.js"></script>
<script type="text/javascript" src="${ctx}/resources/admin/chart/g.dot.js"></script>

<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=6PYkS1eDz5pMnyfO0jvBNE0F"></script>
<script type="text/javascript" src="http://api.map.baidu.com/library/Heatmap/2.0/src/Heatmap_min.js"></script>

<script src="${ctx}/resources/admin/js/dwz.core.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.util.date.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.validate.method.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.barDrag.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.drag.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.tree.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.accordion.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.ui.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.theme.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.switchEnv.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.alertMsg.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.contextmenu.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.navTab.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.tab.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.resize.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.dialog.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.dialogDrag.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.sortDrag.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.cssTable.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.stable.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.taskBar.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.ajax.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.pagination.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.database.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.datepicker.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.effects.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.panel.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.checkbox.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.history.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.combox.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.file.js" type="text/javascript"></script>
<script src="${ctx}/resources/admin/js/dwz.print.js" type="text/javascript"></script>

<!-- 可以用dwz.min.js替换前面全部dwz.*.js (注意：替换时下面dwz.regional.zh.js还需要引入)
<script src="bin/dwz.min.js" type="text/javascript"></script>
-->
<script src="${ctx}/resources/admin/js/dwz.regional.zh.js" type="text/javascript"></script>

<script type="text/javascript">
$(function(){
	DWZ.init("${ctx}/resources/admin/dwz.frag.xml", {
		loginUrl:"login_dialog.html", loginTitle:"登录",	// 弹出登录对话框
//		loginUrl:"login.html",	// 跳到登录页面
		statusCode:{ok:200, error:300, timeout:301}, //【可选】
		pageInfo:{pageNum:"pageNum", numPerPage:"numPerPage", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
		keys: {statusCode:"statusCode", message:"message"}, //【可选】
		ui:{hideMode:'offsets'}, //【可选】hideMode:navTab组件切换的隐藏方式，支持的值有’display’，’offsets’负数偏移位置的值，默认值为’display’
		debug:false,	// 调试模式 【true|false】
		callback:function(){
			initEnv();
			$("#themeList").theme({themeBase:"themes"}); // themeBase 相对于index页面的主题base路径
		}
	});
});
</script>

</head>

<body>
	<div id="layout">
		<div id="header">
			<div class="headerNav">
				<a class="logo" >标志</a>
				<ul class="nav">
					<li><a href="${ctx}/rest/admin/changpasswordUI" target="dialog" width="600">设置</a></li>
					<li><a href="${ctx}/rest/admin/login">退出</a></li>
				</ul>
			</div>

			<!-- navMenu -->
			
		</div>

		<div id="leftside">
			<div id="sidebar_s">
				<div class="collapse">
					<div class="toggleCollapse"><div></div></div>
				</div>
			</div>
			<div id="sidebar">
				<div class="toggleCollapse"><h2>主菜单</h2><div>收缩</div></div>

				<div class="accordion" fillSpace="sidebar">
					
					<div class="accordionContent">
						<ul class="tree treeFolder">
							<li><a href="${ctx}/rest/admin/category/list" target="navTab">婚车信息管理</a>
								<ul>
									<li><a href="${ctx}/rest/admin/category/list" target="navTab" rel="main">品牌</a></li>
									<li><a href="${ctx}/rest/admin/product/list" target="navTab" rel="row-col">婚车</a></li>
								</ul>
							</li>
							<li><a href="${ctx}/rest/admin/user/list" target="navTab">用户信息管理</a>
								<ul>
									<li><a href="${ctx}/rest/admin/user/list" target="navTab" rel="main">用户信息</a></li>
									<li><a href="${ctx}/rest/admin/comment/list" target="navTab" rel="main">留言信息</a></li>
								</ul>
							</li>
							<li><a href="${ctx}/rest/admin/order/list" target="navTab">订单管理</a>
								<ul>
									<li><a href="${ctx}/rest/admin/order/list" target="navTab" rel="main">订单信息</a></li>
								</ul>
							</li>
							<li><a href="${ctx}/rest/admin/news/list" target="navTab">婚车资讯管理</a>
								<ul>
									<li><a href="${ctx}/rest/admin/news/list" target="navTab" rel="main">资讯信息</a></li>
								</ul>
							</li>
							
						</ul>
					</div>
					
					
				</div>
			</div>
		</div>
		<div id="container">
			<div id="navTab" class="tabsPage">
				<div class="tabsPageHeader">
					<div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
						<ul class="navTab-tab">
							<li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
						</ul>
					</div>
					<div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
					<div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
					<div class="tabsMore">more</div>
				</div>
				<ul class="tabsMoreList">
					<li><a href="javascript:;">我的主页</a></li>
				</ul>
				<div class="navTab-panel tabsPageContent layoutBox">
					<div class="page unitBox">
						<div class="accountInfo">
							<p><span>欢迎你。。。。</span></p>
						</div>
					</div>
					
				</div>
			</div>
		</div>

	</div>

	<div id="footer">Copyright &copy; 2010 <a href="demo_page2.html" target="dialog">VIP</a> 测试手段</div>

</body>
</html>