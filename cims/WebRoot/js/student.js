function showRatingPage(studentId){
	$('#content').addClass('loading');
	$('#content').load('../student/ratingPage',{'student.studentId':studentId},function(){$('#content').removeClass('loading');});
}

/**
 * 显示评分面板
 */
function toRatePage(teacherId,courseId,studentId){
	$('#content').addClass('loading');
	$('#content').load(
		'../student/toRatePage',
		{'student.studentId':studentId,'teacher.teacherId':teacherId,'course.courseId':courseId},
		function(){$('#content').removeClass('loading');}
	);
}

/**
 * 提交评分表单
 */
function submitRate(){
	var item1 = parseInt($('input[name="item1"]:checked').val());
	var item2 = parseInt($('input[name="item2"]:checked').val());
	var item3 = parseInt($('input[name="item3"]:checked').val());
	var item4 = parseInt($('input[name="item4"]:checked').val());
	var item5 = parseInt($('input[name="item5"]:checked').val());
	var totalScore;
	
	if(item1 == 'undefined' || item2 == 'undefined' || item3 == 'undefined' || item4 == 'undefined' || item5 == 'undefined'){
		alert('请对每一项进行评分');
		return;
	}
	else{
		totalScore = item1+item2+item3+item4+item5;
		var studentId = $('#studentId').val();
		var teacherId = $('#teacherId').val();
		var courseId = $('#courseId').val();
		var advice = $('#advice').val();
		$.post(
			'../student/rate',
			{'rating.student.studentId':studentId,'rating.teacher.teacherId':teacherId,'rating.course.courseId':courseId,'rating.score':totalScore,'rating.advice':advice},
			function(data){
				if(data == 1)
					showRatingPage(studentId);
				else
					alert('系统繁忙，请稍候重试');
			}
		);
	}
}
