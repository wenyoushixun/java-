package cn.itcast.user.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.News;
import cn.itcast.user.service.NewsService;

@RequestMapping("client/news")
@Controller("client/news")
public class NewsController extends BaseController{
	
	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value = "detail")
	public ModelAndView detail(Integer id){
		ModelAndView result = new ModelAndView("client/news/detail");
		result.addObject("item", newsService.queryOne(id));
		return result;
	}
}
