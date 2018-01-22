<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>班级管理系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Styles_HomeDefault.css" type="text/css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.2.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
	</head>
	<body style="MARGIN: 0px; OVERFLOW: hidden" bgcolor="#f8fffe">
		<table valign="center" align="center" border="0" cellpadding="0" cellspacing="0" height="100%" width="100%">
			<tbody>
				<tr>
					<td align="center" valign="middle">
						<table align="center" border="0" cellpadding="0" cellspacing="0" height="440" width="100%">
							<tbody>
								<tr>
									<td align="center" bgcolor="#f8fffe" height="75" valign="top" width="100%">
										<table border="0" cellpadding="0" cellspacing="0" height="100%" width="100%">
											<tbody>
												<tr><td><br/></td></tr>
												<tr>
													<td align="center" valign="middle" width="68%">
														<img src="${pageContext.request.contextPath}/images/index_banner.png" border="0">
													</td>
												</tr>
												<tr>
													<td colspan="3" height="20"></td>
												</tr>
												<tr>
													<td>
														<div style="float: right;">
															<span style="FONT-SIZE: 10pt; COLOR: #404275">
															<%=new SimpleDateFormat("yyyy年MM月dd日").format(new Date())%>
															</span>
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<td align="center" valign="middle" width="100%">
										<table align="center" border="0" cellpadding="0" cellspacing="0" height="258" width="100%">
											<tbody>
												<tr>
													<td colspan="2" align="right" background="images/index_border1.gif" height="19" width="100%">
														<img src="${pageContext.request.contextPath}/images/index_border1.gif" height="19" width="870">
													</td>
												</tr>
												<tr>
													<!-- 登录表单 -->
													<td style="width: 40%;" id="td1" align="center" bgcolor="#cdf2e3" height="215" width="40%">
														<form action="student/student_login" method="post" id="login_form" onsubmit="return checkVerification();">
														<input type="hidden" id="srole" value="0" name="student.role"/>
														<table width="200" height="80" cellspacing="0" cellpadding="1" border="0" class="login_table">
														<tbody>
															<tr>
																<td>身&#12288;份</td>
																<td valign="top">
																	<select onchange="changeType(this);" style="width:135px;margin-bottom:3px;" id="rolesel">
																		<option value="stu" selected="selected">学生</option>
																		<option value="monitor">班长</option>
																		<option value="xxwy">学习委员</option>
																		<option value="shwy">生活委员</option>
																		<option value="tea">班导师</option>
																		<option value="admin">管理员</option>
																	</select>
																</td>
															</tr>
																<tr>
																	<td width="50" id="role">
																		学&#12288;号
																	</td>
																	<td>
																		<input type="text" maxlength="20" style="WIDTH: 134px; HEIGHT: 20px" class="tx1" id="userId" name="student.studentNo">
																	</td>
																</tr>
																<tr>
																	<td>
																		密&#12288;码
																	</td>
																	<td>
																		<input type="password" value="" name="student.pwd" maxlength="25" style="WIDTH:134px;HEIGHT:20px" id="pwd" class="tx1">
																	</td>
																</tr>
																<tr>
																	<td>验证码</td>
																	<td><input maxlength="4" style="WIDTH:134px;HEIGHT:20px" name="cCode" id="cCode" class="tx1" onblur="checkVerification();">
																	<span id="errorInfo" style="color:red;">${msg}</span></td>
																</tr>
																<tr><td></td>
																	<td>
																		<img alt="验证码" src="getVerificationCode" id="imgCode"/><a href="javascript:changeValidateCode();">换一张</a>
																	</td>
																</tr>
																<tr>
																	<td></td>
																	<td>
																	<input type="submit" value="登录" class="but20"/>
																	<input type="reset" value="重置" class="but20"/>
																	</td>
																</tr>
															</tbody>
														</table>
														</form>
													</td>
													<!-- 登录表单End -->
													<td style="width: 60%;" id="td2" align="right" bgcolor="#cdf2e3" height="215" width="60%">
														<img src="${pageContext.request.contextPath}/images/index_bgright.gif">
													</td>
												</tr>
												<tr>
													<td colspan="2" align="right" background="${pageContext.request.contextPath}/images/index_border2.gif"
														height="19" width="100%">
														<img src="${pageContext.request.contextPath}/images/index_border2.gif" height="19" width="870">
													</td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<td align="center" bgcolor="#f8fffe">
										COPYRIGHT 2000-2013 BY XX ALL RIGHTS RESERVED
									</td>
								</tr>
							</tbody>
						</table>
					</td>
				</tr>
			</tbody>
		</table>

	</body>
</html>