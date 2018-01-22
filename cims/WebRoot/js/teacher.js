function showStudentMgr(teacherId){
	$('#content').addClass('loading');
	$('#content').load('../teacher/studentList',{'teacher.teacherId':teacherId},function(){$('#content').removeClass('loading');});
}

function showRatings(teacherId){
	$('#content').addClass('loading');
	$('#content').load('../teacher/myRatings',{'teacher.teacherId':teacherId},function(){$('#content').removeClass('loading');});
}

/**
 * 查看评分详情
 */
function showDetail(courseId){
	var teacherId = $('#teacherId').val();
	$('#content').addClass('loading');
	$('#content').load('../teacher/ratingDetail',{'teacher.teacherId':teacherId,'courseId':courseId},function(){$('#content').removeClass('loading');});
}
