package cn.itcast.user.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.News;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.service.NewsService;
import cn.itcast.user.util.ResultCode;

@RequestMapping("admin/news")
@Controller("admin/news")
public class NewsController extends BaseController{

	@Autowired
	private NewsService newsService;
	
	
	@RequestMapping(value = "list")
	public ModelAndView newsList(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "20") Integer rows) {
		QueryInfo queryInfo = new QueryInfo(page, rows);
		ModelAndView result = new ModelAndView("admin/news/list");
		result.addObject("page", newsService.queryList(queryInfo));
		return result;
	}

	@RequestMapping(value = "editUI")
	public ModelAndView editUI(
			 Integer id) {
		ModelAndView result = new ModelAndView("admin/news/edit");
		if(id!=null){
			result.addObject("model", newsService.queryOne(id));
		}
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "edit")
	public JSONObject edit(News news) {
		newsService.save(news);
		return result(ResultCode.SUCCESS, null, 0);
	}
	
	@ResponseBody
	@RequestMapping(value = "del")
	public JSONObject del(Integer id) {
		newsService.del(id);
		return result(ResultCode.SUCCESS, null, id);
	}
}
