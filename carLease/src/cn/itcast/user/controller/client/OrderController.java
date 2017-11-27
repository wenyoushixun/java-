package cn.itcast.user.controller.client;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.github.abel533.entity.Example;
import com.github.abel533.entity.Example.Criteria;

import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.Order;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.OrderService;
import cn.itcast.user.service.ProductService;
import cn.itcast.user.util.ResultCode;

@RequestMapping("client/order")
@Controller("client/order")
public class OrderController extends BaseController{

	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "list")
	public ModelAndView orderList(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "1000") Integer rows,@RequestParam(value = "status", defaultValue = "0") Integer status,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			ModelAndView result = new ModelAndView("client/login");
			return result;
		}
		
		QueryInfo queryInfo = new QueryInfo(page, rows);
		Example example = new Example(Order.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("uId", user.getId());
		criteria.andEqualTo("status", status);
		ModelAndView result = new ModelAndView("client/order/list");
		result.addObject("page", orderService.queryList(queryInfo,example));
		result.addObject("status", status);
		return result;
	}

	@RequestMapping(value = "editUI")
	public ModelAndView editUI(
			 Integer id) {
		ModelAndView result = new ModelAndView("client/order/edit");
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
	
	
	@RequestMapping(value = "toAdd")
	public ModelAndView toAdd(Integer id,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			ModelAndView result = new ModelAndView("client/login");
			return result;
		}
		
		ModelAndView result = new ModelAndView("client/order/addorder");
		result.addObject("product", productService.queryOne(id));
		return result;
	}
	
	@RequestMapping(value = "updateStatus")
	public ModelAndView updateStatus(Integer id,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			ModelAndView result = new ModelAndView("client/login");
			return result;
		}
		
		ModelAndView result = new ModelAndView("redirect:/rest/client/order/list?status=99");
		orderService.updateStatus(id,99);
		
		return result;
	}
	
	@RequestMapping(value = "add")
	public ModelAndView add(Order order,String useT,HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			ModelAndView result = new ModelAndView("client/login");
			return result;
		}
		order.setuId(user.getId());
		order.setUseTime(Timestamp.valueOf(useT));
		orderService.save(order);
		ModelAndView result = new ModelAndView("redirect:/rest/client/order/list");
		//result.addObject("product", productService.queryOne(id));
		return result;
	}
}
