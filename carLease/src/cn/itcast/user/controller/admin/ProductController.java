package cn.itcast.user.controller.admin;

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

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.controller.BaseController;
import cn.itcast.user.pojo.Category;
import cn.itcast.user.pojo.Product;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.service.CategoryService;
import cn.itcast.user.service.ProductService;
import cn.itcast.user.util.ResultCode;

@RequestMapping("admin/product")
@Controller("adminProduct")
public class ProductController extends BaseController {

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "list")
	public ModelAndView list(
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "5") Integer rows) {
		QueryInfo queryInfo = new QueryInfo(page, rows);
		ModelAndView result = new ModelAndView("admin/product/list");
		EasyUIResult<Product> uiResult = productService.queryList(queryInfo);
		result.addObject("page", uiResult);
		return result;
	}

	@RequestMapping(value = "editUI")
	public ModelAndView editUI(Integer id) {
		ModelAndView result = new ModelAndView("admin/product/edit");
		if (id != null) {
			result.addObject("model", productService.queryOne(id));
		}
		List<Category> tops = categoryService.queryAll();
		result.addObject("tops", tops);
		return result;
	}

	@ResponseBody
	@RequestMapping(value = "edit")
	public JSONObject edit(
			@RequestParam(value = "file", required = false) MultipartFile file,
			Product mode, HttpServletRequest request) throws IOException {
		
		if(file.getBytes().length!=0){
			String upload ="upload";
			String path = request.getSession().getServletContext()
					.getRealPath("upload");
			String fileName = file.getOriginalFilename();
			String fileType= fileName.substring(fileName.indexOf("."));
			fileName = System.currentTimeMillis()+fileType;
			File targetFile = new File(path, fileName);
			if (!targetFile.exists()) {
				targetFile.mkdirs();
			}

			// 保存
			try {
				file.transferTo(targetFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
			mode.setImg(upload+"//"+fileName);
		}
		
		productService.save(mode);
		return result(ResultCode.SUCCESS, null, 0);
	}

	@ResponseBody
	@RequestMapping(value = "del")
	public JSONObject del(Integer id) {
		productService.del(id);
		return result(ResultCode.SUCCESS, null, id);
	}
}
