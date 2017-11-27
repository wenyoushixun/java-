package cn.itcast.user.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.Category;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.CategoryService;
import cn.itcast.user.util.ResultCode;


@RequestMapping("admin/category")
@Controller("adminCategory")
public class CategoryController extends BaseController{

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "list")
	public ModelAndView list() {
		ModelAndView result = new ModelAndView("admin/category/list");
		result.addObject("rows",categoryService.queryAll());
		return result;
	}

	@RequestMapping(value = "editUI")
	public ModelAndView editUI(
			 Integer id) {
		ModelAndView result = new ModelAndView("admin/category/edit");
		if(id!=null){
			result.addObject("model", categoryService.queryOne(id));
		}
		List<Category> tops = categoryService.queryByPid(0);
		result.addObject("tops",tops);
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "edit")
	public JSONObject edit(Category mode) {
		categoryService.save(mode);
		return result(ResultCode.SUCCESS, null, 0);
	}
	
	@ResponseBody
	@RequestMapping(value = "del")
	public JSONObject del(Integer id) {
		categoryService.del(id);
		return result(ResultCode.SUCCESS, null, id);
	}
}
