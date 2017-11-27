package cn.itcast.user.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.Comment;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.CommentService;
import cn.itcast.user.service.UserService;
import cn.itcast.user.util.ResultCode;

@RequestMapping("admin/comment")
@Controller("admin/comment")
public class CommentController extends BaseController{

	@Autowired
	private CommentService commentService;
	
	
	@RequestMapping(value = "list")
	public ModelAndView userList(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "20") Integer rows) {
		QueryInfo queryInfo = new QueryInfo(page, rows);
		ModelAndView result = new ModelAndView("admin/comment/list");
		result.addObject("page", commentService.queryList(queryInfo));
		return result;
	}

	@RequestMapping(value = "editUI")
	public ModelAndView editUI(
			 Integer id) {
		ModelAndView result = new ModelAndView("admin/comment/edit");
		if(id!=null){
			result.addObject("model", commentService.queryOne(id));
		}
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "edit")
	public JSONObject edit(Comment user) {
		commentService.save(user);
		return result(ResultCode.SUCCESS, null, 0);
	}
	
	@ResponseBody
	@RequestMapping(value = "del")
	public JSONObject del(Integer id) {
		commentService.del(id);
		return result(ResultCode.SUCCESS, null, id);
	}
}
