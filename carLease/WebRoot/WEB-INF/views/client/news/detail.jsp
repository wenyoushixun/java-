<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="uri" value="${pageContext.request.requestURI}"/>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>帮助中心</title>
    <meta name="viewport" content="maximum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Cache-Control" content="no-transform"/>
	<meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link href="${ctx}/resources/client/css/common.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/client/css/stylen.css">
<link rel="shortcut icon"
	href="${ctx}/resources/client/img/favicon.ico">
  </head>
  <body>

  	<div class="top_full">
  		<%@include file="../public/top.jsp" %>
  	</div>
	<div class="crumbs_bar f13">
        <div class="crumbs_item">
            <a href="/">${item.title}</a> <i class="fa fa-angle-right"></i>
        </div>   
    </div>
	<div class="help_box">
	    <div class="help_menu" style="background-color: #fff; ">
	      <div class="text_cont menu_in">${item.content}</div>
		</div>
	</div>
	
</body>
</html>