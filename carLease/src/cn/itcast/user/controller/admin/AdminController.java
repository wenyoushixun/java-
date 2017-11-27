package cn.itcast.user.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.Admin;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.AdminService;
import cn.itcast.user.service.UserService;
import cn.itcast.user.util.ResultCode;

@RequestMapping("admin")
@Controller
public class AdminController extends BaseController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "admin/index";
	}
	
	@RequestMapping(value = "changpasswordUI", method = RequestMethod.GET)
	public String changpasswordUI() {
		return "admin/changpassword";
	}
	
	

	@ResponseBody
	@RequestMapping(value = "changpassword")
	public JSONObject changpassword(@RequestParam(value = "oldPassword") String oldPassword,
			@RequestParam(value = "newPassword") String newPassword,HttpServletRequest request) {
		Admin admin =(Admin) request.getSession().getAttribute("admin");
		admin.setPassword(newPassword);
		adminService.changpassword(admin);
		return result(ResultCode.FAIL, null, 0);
	}

	
	@RequestMapping(value = "toLogin", method = RequestMethod.GET)
	public String toLogin() {
		return "admin/login";
	}
	
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(String name,String password,HttpServletRequest request) {
		Admin admin = adminService.queryByName(name);
		ModelAndView result =null;
		if(admin==null){
			result = new ModelAndView("admin/login");
			result.addObject("msg", "手机号有误");
		}else if(!admin.getPassword().equals(password)){
			result = new ModelAndView("admin/login");
			result.addObject("msg", "密码有误");
		}else{
			request.getSession().setAttribute("admin", admin);
			result = new ModelAndView("admin/index");
		}
		
		return result;
		
	}
	
	// ============================demo
//	@RequestMapping(value = "user/list")
//	public ModelAndView userList(
//			@RequestParam(value = "pageNum", defaultValue = "1") Integer page,
//			@RequestParam(value = "rows", defaultValue = "5") Integer rows) {
//		QueryInfo queryInfo = new QueryInfo(page, rows);
//		ModelAndView result = new ModelAndView("admin/user/list");
//		result.addObject("page", userService.queryUserList(queryInfo));
//		return result;
//	}
//
//	@RequestMapping(value = "user/editUI")
//	public ModelAndView editUI(
//			 Integer id) {
//		ModelAndView result = new ModelAndView("admin/user/edit");
//		if(id!=null){
//			result.addObject("model", userService.findOne(id));
//		}
//		return result;
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "user/edit")
//	public JSONObject edit(User user) {
//		userService.save(user);
//		return result(ResultCode.SUCCESS, null, 0);
//	}
//	
//	@ResponseBody
//	@RequestMapping(value = "user/del")
//	public JSONObject del(Integer id) {
//
//		return result(ResultCode.SUCCESS, null, id);
//	}
}
