/*
 * ------------------班费管理--------------------------
 */
/**
 * 显示班费管理面板
 */
function showFundMgr(){
	$('#content').addClass('loading');
	$('#content').load('../showFundMgr',function(){$('#content').removeClass('loading');});
}

/**
 * 添加新班费收支记录
 * 使用jquery.form.js插件，通过ajax方式提交表单
 */
function addFund(){
     var options = {
         url : "../admin/admin_addFund",
         type : "POST",
         dataType : "json",
         success : function(data) {
	    	 	if(data ==1)
	    	 		showFundMgr();
	    	 	else{
	    	 		alert('系统繁忙，请稍候重试');
	    	 	}
     		}  
         };  
     $('#fundForm').ajaxSubmit(options);
     $('#newFundForm').css('display','none');
}

/**
 * 显示修改班费记录面板
 */
function showUpdateFund(fid){
	$('#content').addClass('loading');
	$('#content').load('../admin/admin_toUpdateFund',{'status':fid},function(){$('#content').removeClass('loading');});
}

/**
 * 更新班费记录
 * @return
 */
function updateFund(){
    var options = {
        url : "../admin/admin_updateFund",
        type : "POST",
        dataType : "json",
        success : function(data) {
	    	 	if(data ==1)
	    	 		showFundMgr();
	    	 	else{
	    	 		alert('系统繁忙，请稍候重试');
	    	 	}
    		}  
        };  
    $('#fundForm2').ajaxSubmit(options);
}

/**
 * 删除一条班费记录，使用Ajax请求
 */
function delFund(fid){
	var isConfirm = window.confirm('确定删除此记录？');
	if(isConfirm){
		$.get(
			'../admin/admin_delFund',
			{'status':fid},
			function(data){
				if(data == 1){
					alert('删除成功');
					showFundMgr();
				}else{
					alert('系统繁忙，请稍候重试');
				}
			}
		);
	}
}


/*
 * -----------------------------考勤管理--------------------------------
 */
/*
 * 显示考勤管理面板
 */
function showCheckinMgr(){
	$('#content').addClass('loading');
	$('#content').load('../toCheckinMgr',function(){$('#content').removeClass('loading');});
}

/*
 * 添加新的考勤记录
 */
function addCheckin(){
	var date = $('#cdate');
	var sno = $('#csno');
	var type = $('#ctype').val();
	if(date.val() == ''){
		$('.msg :eq(0)').text('请输入日期');
		return false;
	}
	if(sno.val() == -1){
		$('.msg :eq(1)').text('请选择学生');
		return false;
	}
	$.post(
		'../admin/admin_addCheckin',
		{'checkin.student.studentId':sno.val(),'checkin.checkdate':date.val(),'checkin.type':type},
		function(data){
			if(data == 1){
				alert('添加成功');
				showCheckinMgr();
			}else{
				alert('系统繁忙，请稍候重试');
			}
		}
	);
}

/*
 * 查看某天的考勤记录
 */
function findCheckinList(){
	var vdate = $('#viewdate').val();
	$('#content').addClass('loading');
	$('#content').load('../admin/admin_checkinList',{'checkin.checkdate':vdate},function(){$('#content').removeClass('loading');});
}

/*
 * -----------------------成绩管理--------------------------
 */
/**
 * 显示成绩管理页面
 */
function showScoreMgr(){
	$('#content').addClass('loading');
	$('#content').load('../toScoreMgr',function(){$('#content').removeClass('loading');});
}

/**
 * 添加成绩记录
 * 使用jquery.form.js插件，通过ajax方式提交表单
 */
function addScore(){
     var options = {
         url : "../admin/admin_addScore",
         type : "POST",
         dataType : "json",
         success : function(data) {
	    	 	if(data ==1)
	    	 		showScoreMgr();
	    	 	else{
	    	 		alert('系统繁忙，请稍候重试');
	    	 	}
     		}  
         };  
     $('#scoreForm').ajaxSubmit(options);
     $('#newScoreForm').css('display','none');
}

/**
 * 显示更新成绩信息面板 
 * @return
 */
function showUpdateScore(sid){
	$('#content').addClass('loading');
	$('#content').load('../admin/admin_toUpdateScore',{'status':sid},function(){$('#content').removeClass('loading');});
}

/**
 * 更新成绩
 * @return
 */
function updateScore(){
	 var options = {
	         url : "../admin/admin_updateScore",
	         type : "POST",
	         dataType : "json",
	         success : function(data) {
		    	 	if(data ==1){
		    	 		alert('修改成功');
		    	 		showScoreMgr();
		    	 	}
		    	 	else{
		    	 		alert('系统繁忙，请稍候重试');
		    	 	}
	     		}  
	         };  
	     $('#scoreForm').ajaxSubmit(options);
}

/**
 * 删除成绩
 * @param studentId
 * @return
 */
function delScore(sid){
	var isConfirm = window.confirm('确定删除此信息？');
	if(isConfirm)
		$.get(
				'../admin/admin_deleteScore',
				{'status':sid},
				function(data){
					if(data == 1){
						alert('删除成功');
						$('#row_'+sid).remove();
					}else{
						alert('系统繁忙，请稍候');
					}
				}
			);
	else
		return ;
}

/*
 * -------------------------学生信息管理-------------------------
 */
function showStudentMgr(){
	$('#content').addClass('loading');
	$('#content').load('../admin/admin_findAllStudents',function(){$('#content').removeClass('loading');});
}

/**
 * 显示添加新学生面板
 */
function toNewStudent(){
	$('#content').addClass('loading');
	$('#content').load('../admin/toNewStudent',function(){$('#content').removeClass('loading');});
}

/**
 * 根据选择的院系填充班级下拉框
 */
function fillClass(dept){
	if(dept.value == -1){
		$('#sclass').empty().append("<option>----请选择班级----</option>").attr('disabled',true);
		return;
	}
	$.get(
			'../su/su_findDeptById',
			{'dept.deptId':dept.value,'status':2},
			function(data){
				$('#sclass').empty();
				if(data[0] == null){
					$('#sclass').append("<option value='-1'>此院系暂无班级</option>");
					$('#sclass').attr('disabled',true);
				}else{
					$('#sclass').attr('disabled',false);
					for(var o=0; o<data.length;o++){
						$('#sclass').append("<option value='"+data[o].classId+"'> "+data[o].className+" </option>");
					}
				}
			}
		);
}

/**
 * 提交新增学生信息表单
 */
function addNewStudent(){
	var options = {
	         url : "../admin/admin_addNewStudent",
	         type : "POST",
	         dataType : "json",
	         success : function(data) {
		    	 	if(data ==1)
		    	 		showStudentMgr();
		    	 	else{
		    	 		alert('系统繁忙，请稍候重试');
		    	 	}
	     		}  
	         };
		if($('#studentForm'))
	     $('#studentForm').ajaxSubmit(options);
}

/**
 * 显示修改学生信息面板
 */
function toUpdateStudent(studentId){
	$('#content').addClass('loading');
	$('#content').load('../admin/admin_findStudentById',{'status':studentId},function(){$('#content').removeClass('loading');});
}

/**
 * 提交表单，更新学生信息
 */
function updateStudent(){
	var options = {
	         url : "../admin/admin_updateStudent",
	         type : "POST",
	         dataType : "json",
	         success : function(data) {
		    	 	if(data ==1)
		    	 		showStudentMgr();
		    	 	else{
		    	 		alert('系统繁忙，请稍候重试');
		    	 	}
	     		}  
	         };
	if($('#studentForm2'))
	     $('#studentForm2').ajaxSubmit(options);
}

/**
 * 删除一条学生信息
 */
function delStudent(studentId){
	var isConfirm = window.confirm('确定删除此信息？');
	if(isConfirm)
		$.get(
				'../admin/admin_deleteStudent',
				{'status':studentId},
				function(data){
					if(data == 1){
						alert('删除成功');
						$('#row_'+studentId).remove();
					}else{
						alert('系统繁忙，请稍候');
					}
				}
			);
	else
		return ;
}

/*
 * -----------------------奖学金信息------------------------
 */
function showScholarshipMgr(){
	$('#content').addClass('loading');
	$('#content').load('../su/su_findAllAdmins',function(){$('#content').removeClass('loading');});
}

/**
 * 重置密码
 */
function resetPwd(adminId,username){
	var isConfirm = window.confirm('密码将重置为"1234"');
	if(isConfirm)
		$.post(
			'../su/su_updateAdmin',
			{'admin.adminId':adminId,'admin.username':username,'admin.pwd':'1234'},
			function(data){
				if(data == 1){
					alert('重置成功');
					$('#pwd_'+adminId).html('1234<a href="javascript:resetPwd('+adminId+',\''+username+'\');">&nbsp;[重置]</a>');
				}
			}
		);
	else
		return;
}

/**
 * 修改管理员用户名
 */
function updateAdminUsername(adminId,pwd){
	var newName = prompt('请输入新的用户名','');
	if(newName == '' || newName == null){
		return;
	}
	$.post(
		'../su/su_updateAdmin',
		{'admin.adminId':adminId,'admin.username':newName,'admin.pwd':pwd},
		function(data){
			if(data == 1){
				alert('更新成功');
				$('#name_'+adminId).text(newName);
			}else{
				alert('系统繁忙，请稍候重试');
			}
		}
	);
}

/**
 * 删除管理员
 */
function deleteAdmin(adminId){
	var isConfirm = window.confirm('确定删除此信息？');
	if(isConfirm)
		$.get(
			'../su/su_deleteAdmin',
			{'admin.adminId':adminId},
			function(data){
				if(data == 1){
					alert('删除成功');
					$('#row_'+adminId).remove();
				}else{
					alert('系统繁忙，请稍候重试');
				}
			}
		);
}

/**
 * 添加新管理员
 * @return
 */
function addNewAdmin(){
	var newName = prompt('请输入新的用户名','');
	if(newName == '' || newName == null)
		return;
	var newPwd = prompt('请输入新密码','');
	if(newPwd == '')
		newPwd = '1234';
	else if(newPwd == null)
		return;
	$.post(
		'../su/su_addNewAdmin',
		{'admin.username':newName,'admin.pwd':newPwd},
		function(data){
			if(data != -1){
				alert('添加成功');
				var newRow = '<tr id="row_'+data+'" class="admin_row"><td id="name_'+data+'">'+newName+'</td><td id="pwd_'+data+'">'+newPwd+'<a href="javascript:resetPwd('+
				data+',\''+newName+'\');">&nbsp;[重置]</a></td><td><a href="javascript:updateAdminUsername('+data+',\''+newPwd+'\');">[修改帐号]</a>'+
				'<a href="javascript:deleteAdmin('+data+');">[删除]</a></td></tr>';
				$('#t_admin tr:last').after(newRow);
			}else{
				alert('系统繁忙，请稍候重试');
			}
		}
	);
}

/*
 * -----------------投票管理----------------------
 */
function showVoteMgr(){
	$('#content').addClass('loading');
	$('#content').load('../vote/vote_toVoteMgr',function(){$('#content').removeClass('loading');});
}

function showCreateVote(){
	$('#content').addClass('loading');
	$('#content').load('../vote/showCreateVote',function(){$('#content').removeClass('loading');});
}

function voteDetail(vid){
	$('#content').addClass('loading');
	$('#content').load('../vote/vote_voteDetail',{'status':vid},function(){$('#content').removeClass('loading');});
}


/**
 * 发起投票，使用ajax提交表单
 * @return
 */
function createVote(){
	var options = {
         url : "../vote/vote_createVote",
         type : "POST",
         dataType : "json",
         success : function(data) {
	    	 	if(data ==1)
	    	 		showVoteMgr();
	    	 	else{
	    	 		alert('系统繁忙，请稍候重试');
	    	 	}
     		}  
         };
     $('#voteForm').ajaxSubmit(options);
}

/**
 * 添加新问题
 * @param tid 问题ID
 * @return
 */
function addQuestion(tid){
	var newId = tid +1; 
	var newQuestion = '<fieldset class="question"  id="q'+newId+'"><legend>问题'+newId+'</legend>'+
		'<table><tr><td class="form_td">题目</td><td><input type="text" name="questions['+newId+'].content" size="50"/></td></tr>'+
		'<tr><td class="form_td">选项1</td><td><input type="text" name="questions['+newId+'].opts[0].content" size="50"/></td></tr>'+
		'<tr><td class="form_td">选项2</td><td><input type="text" name="questions['+newId+'].opts[1].content" size="50"/></td></tr>'+
		'<tr><td class="form_td">选项3</td><td><input type="text" name="questions['+newId+'].opts[2].content" size="50"/></td></tr>'+
		'</table><span><input type="button" value="添加选项" onclick="addOption('+newId+',3);"/></span></fieldset>';
	$('#q'+tid).after(newQuestion);
	$('#addButton').attr('onclick','addQuestion('+newId+')');
}

/**
 * 添加选项
 * @param qid 问题ID
 * @param optcount 当前选项数量
 * @return
 */
function addOption(qid,optcount){
	var count = optcount + 1;//新的选项数量
	var newOpt = '<tr><td class="form_td">选项'+count+'</td><td><input type="text" name="questions['+qid+'].opts['+optcount+'].content" size="50"/></td></tr>';
	$('#q'+qid+' tr:last').after(newOpt);
	$('#q'+qid+' input:last').attr('onclick','addOption('+qid+','+count+')');
}

/**
 * 删除投票
 * @param vid
 * @return
 */
function delVote(vid){
	var isConfirm = window.confirm('确定删除此投票？');
	if(isConfirm)
		$.get(
			'../vote/vote_deleteVote',
			{'status':vid},
			function(data){
				if(data == 1){
					alert('删除成功');
					$('#row_'+vid).remove();
				}else{
					alert('系统繁忙，请稍候重试');
				}
			}
		);
}

/**
 * 进入投票页面
 * @param vid
 * @return
 */
function toVoting(vid){
	$('#content').addClass('loading');
	$('#content').load('../vote/vote_toVoting',{'status':vid},function(){$('#content').removeClass('loading');});
}

/**
 * 投票
 * @return
 */
function voting(){
	var options = {
         url : "../vote/vote_voting",
         type : "POST",
         dataType : "json",
         success : function(data) {
	    	 	if(data ==1){
	    	 		alert('投票成功，感谢您的参与');
	    	 		location.href="toStudentPage";
	    	 	}
	    	 	else{
	    	 		alert('系统繁忙，请稍候重试');
	    	 	}
     		}  
         };
	if($('#votingForm')){
		$('#votingForm').ajaxSubmit(options);
	}
}

/**
 * 查看投票结果
 * @param vid
 * @return
 */
function toVotingResult(vid){
	$('#content').addClass('loading');
	$('#content').load('../vote/vote_voteResult',{'status':vid},function(){$('#content').removeClass('loading');});
}

/*
 * -------------------------通知管理------------------------
 */
function showNoticeMgr(){
	$('#content').addClass('loading');
	$('#content').load('../notice_toNoticeMgr',function(){$('#content').removeClass('loading');});
}

function addNotice(role){
	var title = $('#ntitle').val();
	var content = $('#ncontent').val();
	$.post(
		'../notice_saveNotice',
		{'notice.title':title,'notice.content':content,'notice.publisherRole':role},
		function(data){
			if(data == 1){
				alert('发布成功');
				if(role == 2)
					showMyNotice();
				else
					showNoticeMgr();
			}else{
				alert('系统繁忙，请稍候重试');
			}
		}
	);
}

function showUpdateNotice(nid){
	$('#content').addClass('loading');
	$('#content').load('../notice_toNoticeUpdate',{'status':nid},function(){$('#content').removeClass('loading');});
}

/**
 * 修改通知
 * @param nid
 * @return
 */
function updateNotice(nid){
	var title = $('#ntitle').val();
	var content = $('#ncontent').val();
	$.post(
		'../notice_updateNotice',
		{'status':nid,'notice.title':title,'notice.content':content},
		function(data){
			if(data == 1){
				alert('修改成功');
				if(showMyNotice)
					showMyNotice();
				else
					showNoticeMgr();
			}else{
				alert('系统繁忙，请稍候重试');
			}
		}
	);
}

function delNotice(nid){
	var isConfirm = window.confirm('确定删除此通知？');
	if(isConfirm)
		$.get(
			'../notice_deleteNotice',
			{'status':nid},
			function(data){
				if(data == 1){
					alert('删除成功');
					$('#row_'+nid).remove();
				}else{
					alert('系统繁忙，请稍候重试');
				}
			}
		);
}

function noticeDetail(nid){
	$('#content').addClass('loading');
	$('#content').load('../notice_noticeDetail',{'status':nid},function(){$('#content').removeClass('loading');});
}

/*
 * ---------------------共享文件管理-------------------
 */
function showShareMgr(){
	$('#content').addClass('loading');
	$('#content').load('../file_toFileMgr',function(){$('#content').removeClass('loading');});
}

function addFile(){
	var options = {
	         url : "../file_saveNewFile",
	         type : "POST",
	         dataType : "json",
	         success : function(data) {
		    	 	if(data ==1){
		    	 		alert('上传成功');
		    	 		showShareMgr();
		    	 	}
		    	 	else{
		    	 		alert('系统繁忙，请稍候重试');
		    	 	}
	     		}  
	         };
	     $('#fileForm').ajaxSubmit(options);
}

function showUpdateFile(fid){
	$('#content').addClass('loading');
	$('#content').load('../file_toUpdateFile',{'status':fid},function(){$('#content').removeClass('loading');});
}

function updateFile(){
	var options = {
	         url : "../file_updateFile",
	         type : "POST",
	         dataType : "json",
	         success : function(data) {
		    	 	if(data ==1){
		    	 		alert('更新成功');
		    	 		if(showMyFile)
		    	 			showMyFile();
		    	 		else
		    	 			showShareMgr();
		    	 	}
		    	 	else{
		    	 		alert('系统繁忙，请稍候重试');
		    	 		if(showMyFile)
		    	 			showMyFile();
		    	 		else
		    	 			showShareMgr();
		    	 	}
	     		}  
	         };
	     $('#fileForm').ajaxSubmit(options);
}

function delFile(fid){
	var isConfirm = window.confirm('确定删除此文件？');
	if(isConfirm)
		$.get(
			'../file_deleteFile',
			{'status':fid},
			function(data){
				if(data == 1){
					alert('删除成功');
					$('#row_'+fid).remove();
				}else{
					alert('系统繁忙，请稍候重试');
				}
			}
		);
}

function showFileDetail(fid){
	$('#content').addClass('loading');
	$('#content').load('../file_toFileDetail',{'status':fid},function(){$('#content').removeClass('loading');});
}

function downloadFile(fid){
	$.get(
		'../file_download',
		{'status':fid},
		function(data){
			alert(data);
		}
	);
}
