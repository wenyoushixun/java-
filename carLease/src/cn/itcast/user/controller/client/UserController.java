package cn.itcast.user.controller.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;

@RequestMapping("client/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "info", method = RequestMethod.GET)
	public String index() {
		return "client/user/info";
	}
	
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String toUsersPage() {

		return "admin/users";
	}

	@RequestMapping(value = "data/list", method = RequestMethod.GET)
	@ResponseBody
	public EasyUIResult queryUserList(
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "5") Integer rows) {
		QueryInfo queryInfo = new QueryInfo(page, rows);

		return this.userService.queryUserList(queryInfo);
	}
	
	@RequestMapping(value = "loginOut", method = RequestMethod.GET)
	public ModelAndView loginOut(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		ModelAndView result =  new ModelAndView("redirect:/rest/client/product/list");
		return result;
	}
	
	@RequestMapping(value = "toLogin", method = RequestMethod.GET)
	public String toLogin() {
		return "client/login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(String phone,String password,HttpServletRequest request) {
		ModelAndView result =null;
		User user = userService.queryByPhone(phone);
		if(user==null){
			result = new ModelAndView("client/login");
			result.addObject("msg", "手机号有误");
		}else if(!user.getPassword().equals(password)){
			result = new ModelAndView("client/login");
			result.addObject("msg", "密码有误");
		}else{
			request.getSession().setAttribute("user", user);
			result = new ModelAndView("redirect:/rest/client/product/list");
		}
		
		return result;
	}
	
	@RequestMapping(value = "toReg", method = RequestMethod.GET)
	public String toReg() {
		return "client/reg";
	}
	
	@RequestMapping(value = "reg", method = RequestMethod.POST)
	public String reg(User model) {
		ModelAndView result =null;
		User user = userService.queryByPhone(model.getPhone());
		if(user!=null){
			result = new ModelAndView("client/login");
			result.addObject("msg", "当前手机已注册");
		}else{
			userService.save(model);
			result = new ModelAndView("/client/login");
		}
		
		return "client/login";
	}
	
	
	@RequestMapping(value = "update")
	public ModelAndView update(User model,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			ModelAndView result = new ModelAndView("client/login");
			return result;
		}
		
		ModelAndView result = new ModelAndView("redirect:/rest/client/user/info");
		user.setName(model.getName());
		user.setPhone(model.getPhone());
		userService.update(user);
		return result;
	}
	
}
