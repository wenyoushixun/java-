package cn.itcast.user.controller.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.alibaba.fastjson.JSONObject;

import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.Comment;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.CommentService;
import cn.itcast.user.util.ResultCode;

@RequestMapping("client/comment")
@Controller("client/comment")
public class CommentController extends BaseController{
	
	@Autowired
	private CommentService commentService;
	
	@ResponseBody
	@RequestMapping(value = "add")
	public JSONObject add(Comment comment,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			return result(ResultCode.FAIL, null, 0);
		}
		comment.setuId(user.getId());
		comment.setuPhone(user.getPhone());
		commentService.save(comment);
		return result(ResultCode.SUCCESS, null, 0);
	}
}
