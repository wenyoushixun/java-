/*
 * 课程汇总
 */
function showRatingDiv(){
	$('#content').addClass('loading');
	$('#content').load('../su/su_showRating',function(){$('#content').removeClass('loading');});
}

/*
 * 班级汇总
 */
function ratingByClass(){
	$('#content').addClass('loading');
	$('#content').load('../admin/ratingsByClass',function(){$('#content').removeClass('loading');});
}


