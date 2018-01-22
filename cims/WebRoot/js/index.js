$(function(){
	changeType($('#rolesel').get(0));
	$('#cCode').val('');
});

function changeValidateCode(){
	var m = new Date();
	$("#imgCode").attr('src', 'getVerificationCode.action?' + m);
}

function checkVerification(){
	$('#errorInfo').html(' ');
	var checked;
	var code = $('#cCode').val();
	if(code == ''){
		$('#errorInfo').css({'color':'red'}).html('请输入验证码');
		checked = false;
		return false;
	}else{
		$.ajax({
			'async':false,
			'url': 'validateCode', 
			'type': 'get',
			'data': {'verificationCode':code},
			'dataType': 'json',
			'success': function(data){
					if(data){
						$('#errorInfo').css({'color':'green'}).html('验证码正确');
						checked =  true;
					}else{
						$('#errorInfo').css({'color':'red'}).html('验证码错误');
						checked = false;
					}
				}
			}
		);
	}
	return checked;
}

/**
 * 改变登录身份
 * 修改相应表单属性
 * @param role
 * @return
 */
function changeType(role){
	if(role.value == 'stu'){//一般学生
		$('#role').text('学   号');
		$('#userId').attr({'name':'student.studentNo'});
		$('#srole').attr({'value':0});
		$('#pwd').attr({'name':'student.pwd'});
		$('#login_form').attr({'action':'student/student_login'});
	}else if(role.value == 'tea'){//老师
		$('#role').text('职工号');
		$('#userId').attr({'name':'teacher.teacherNo'});
		$('#pwd').attr({'name':'teacher.pwd'});
		$('#login_form').attr({'action':'teacher/teacher_login'});
	}else if(role.value == 'monitor'){//班长
		$('#role').text('学   号');
		$('#srole').attr({'value':1});
		$('#userId').attr({'name':'student.studentNo'});
		$('#pwd').attr({'name':'student.pwd'});
		$('#login_form').attr({'action':'student/student_login'});
	}else if(role.value == 'xxwy'){//学习委员
		$('#role').text('学   号');
		$('#srole').attr({'value':2});
		$('#userId').attr({'name':'student.studentNo'});
		$('#pwd').attr({'name':'student.pwd'});
		$('#login_form').attr({'action':'student/student_login'});
	}else if(role.value == 'shwy'){//生活委员
		$('#role').text('学   号');
		$('#srole').attr({'value':3});
		$('#userId').attr({'name':'student.studentNo'});
		$('#pwd').attr({'name':'student.pwd'});
		$('#login_form').attr({'action':'student/student_login'});
	}else if(role.value == 'admin'){//管理员
		$('#role').text('帐   号');
		$('#userId').attr({'name':'admin.adminName'});
		$('#pwd').attr({'name':'admin.pwd'});
		$('#login_form').attr({'action':'admin/admin_login'});
	}
}

