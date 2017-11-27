package cn.itcast.user.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.Order;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.OrderService;
import cn.itcast.user.util.ResultCode;

@RequestMapping("admin/order")
@Controller("admin/order")
public class OrderController extends BaseController{

	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping(value = "list")
	public ModelAndView orderList(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "20") Integer rows) {
		QueryInfo queryInfo = new QueryInfo(page, rows);
		ModelAndView result = new ModelAndView("admin/order/list");
		result.addObject("page", orderService.queryList(queryInfo));
		return result;
	}

	@RequestMapping(value = "editUI")
	public ModelAndView editUI(
			 Integer id) {
		ModelAndView result = new ModelAndView("admin/order/edit");
		if(id!=null){
			result.addObject("model", orderService.queryOne(id));
		}
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "edit")
	public JSONObject edit(Order order) {
		orderService.save(order);
		return result(ResultCode.SUCCESS, null, 0);
	}
	
	@ResponseBody
	@RequestMapping(value = "del")
	public JSONObject del(Integer id) {
		orderService.del(id);
		return result(ResultCode.SUCCESS, null, id);
	}
	
	@ResponseBody
	@RequestMapping(value = "updateStatus")
	public JSONObject updateStatus(Integer id,Integer status,HttpServletRequest request) {
		orderService.updateStatus(id,status);
		return result(ResultCode.SUCCESS, null, id);
	}
}
