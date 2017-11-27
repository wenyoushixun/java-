package cn.itcast.user.controller.client;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.github.abel533.entity.Example;
import com.github.abel533.entity.Example.Criteria;

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.Category;
import cn.itcast.user.pojo.Product;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.service.CategoryService;
import cn.itcast.user.service.ProductService;
import cn.itcast.user.util.ResultCode;

@RequestMapping("client/product")
@Controller("client/product")
public class ProductController extends BaseController {

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "list")
	public ModelAndView list(
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "9") Integer rows,
			@RequestParam(value = "cpId", defaultValue = "0") Integer cpId,
			@RequestParam(value = "orderType", defaultValue = "0") Integer orderType) {
		QueryInfo queryInfo = new QueryInfo(page, rows);
		ModelAndView result = new ModelAndView("client/index");
		Example example = new Example(Product.class);
		Criteria criteria = example.createCriteria();
		if (cpId != 0)
			criteria.andEqualTo("cId", cpId);

			if(orderType==1){
				example.setOrderByClause("amount asc");
			}else if(orderType==2){
				example.setOrderByClause("amount desc");
			}else if(orderType==3){
				example.setOrderByClause("createTime desc");
			}
	
		EasyUIResult<Product> uiResult = productService.queryList(queryInfo,
				example);
		List<Category> tops = categoryService.queryAll();
		result.addObject("tops", tops);
		result.addObject("page", uiResult);
		//
		result.addObject("cpId", cpId);
		result.addObject("orderType", orderType);
		return result;
	}

	@RequestMapping(value = "detail")
	public ModelAndView detail(Integer id) {
		ModelAndView result = new ModelAndView("client/detail");
		Product product = productService.queryOne(id);
		if (id != null) {
			result.addObject("model", product);
		}
		QueryInfo queryInfo = new QueryInfo(1, 10);
		Example example = new Example(Product.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("cpId", product.getCpId());
		EasyUIResult<Product> uiResult = productService.queryList(queryInfo,
				example);
		result.addObject("page", uiResult);
		
		return result;
	}

	@RequestMapping(value = "addorder")
	public ModelAndView addorder(Integer id) {
		ModelAndView result = new ModelAndView("client/addorder");
		if (id != null) {
			result.addObject("model", productService.queryOne(id));
		}
		return result;
	}
}
