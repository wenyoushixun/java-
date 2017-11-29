<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<h4 class="form-title">
				<!-- userModel.id == null 表示新增用户,否则为编辑用户 -->
				<s:if test="%{userModel.id == null}">
				    新增用户信息
                </s:if>
				<s:else>
				    编辑用户信息
                </s:else>
			</h4>
			<s:form id="userForm" action="/user/save.action" theme="simple">
				<!-- 隐藏字段(userId)编辑用户时使用 -->
				<s:hidden name="userModel.id" />
				<!-- 打印重复提交错误信息 -->
				<s:actionerror />
				<!-- 重复提交控制 token -->
				<s:token></s:token>
				<div class="input-group ">
					<label class="input-label">用户名称：</label>
					<s:textfield name="userModel.name" class="input" placeholder="请输入您的用户名..." />
				</div>
				<div class="input-group ">
					<label class="input-label">登录密码：</label>
					<s:password name="userModel.password" class="input" placeholder="请输入您的密码..." />
				</div>
				<div class="input-group ">
					<label class="input-label">重复密码：</label>
					<s:password name="userModel.repeatPassword" class="input" placeholder="请输入您的确认密码..." />
				</div>
				<div class="input-group ">
					<label class="input-label">电子邮箱：</label>
					<s:textfield name="userModel.email" class="input" placeholder="请输入您的确认密码..." />
				</div>
				<div class="input-group">
					<label class="radio-label">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
					<div class="radio-group">
						<s:radio label="性别" list="#{'male':'男','female':'女'}" name="userModel.gender" value="userModel.gender" />
					</div>
				</div>
				<div class="form-control clr">
					<hr>
					<button type="submit" id="saveUserBtn">保存</button>
					<button type="reset">重置</button>
					<button type="button" id="returnUserBtn">返回</button>
				</div>
				<!-- </form> -->
			</s:form>
		</div>
	</div>
	<!-- 引入 jQuery 库 -->
	<script src="${ctx}/plugins/jquery-2.2.4.min.js"></script>

	<!-- 引入自定义公用 js 库 -->
	<script src="${ctx}/js/common.js"></script>

	<script type="text/javascript">
    $(function() {
        //点击返回按钮事件
        $("#returnUserBtn").click(function() {
            document.location = "${ctx}/user/list.action";
        })
        
        //点击保存按钮事件
        $("#saveUserBtn").click(function() {
            var username = $("#userForm_userModel_name").val();
            var password = $("#userForm_userModel_password").val();
            var repeatPassword = $("#userForm_userModel_repeatPassword").val();
            var email = $("#userForm_userModel_email").val();
            
            //验证用户输入信息有效性
            if ($.trim(username) === "") {
                $("#userForm_userModel_name").focus();
                alert("用户名称不允许为空！");
                return false;
            } else if ($.trim(password) === "") {
                $("#userForm_userModel_password").focus();
                alert("登录密码不允许为空！");
                return false;
            } else if ($.trim(repeatPassword) === "") {
                $("#userForm_userModel_repeatPassword").focus();
                alert("重复密码不允许为空！");
                return false;
            }else if($.trim(email) === ""){
                $("#userForm_userModel_email").focus();
                alert("电子邮箱不允许为空！");
                return false;
            } else if (username.length < 2 || username.length > 20) {
                alert("用户名长度应在2到20个字符之间！");
                return false;
            } else if (username == password || username == repeatPassword) {
                alert("密码或重复密码不能和用户名相同！");
                return false;
            } else if ($.trim(password) != $.trim(repeatPassword)) {
                alert("密码和重复密码不同，请重新输入！");
                return false;
            } else {
                alert("保存成功！");
                return true;
            }
        })
    })
    </script>
</body>

</html>