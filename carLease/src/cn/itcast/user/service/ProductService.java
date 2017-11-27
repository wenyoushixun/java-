package cn.itcast.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.mapper.CategoryMapper;
import cn.itcast.user.mapper.ProductMapper;
import cn.itcast.user.pojo.Category;
import cn.itcast.user.pojo.Product;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;

import com.github.abel533.entity.Example;
import com.github.abel533.entity.Example.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ProductService {

	
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	public Product queryOne(Integer id) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(id);
	}

	public void save(Product mode) {
		// TODO Auto-generated method stub
		Category category = categoryMapper.selectByPrimaryKey(mode.getcId());
		mode.setCpId(category.getpId());
		if(mode.getId()==null)
			productMapper.insert(mode);
		else
			productMapper.updateByPrimaryKey(mode);
	}



	public void del(Integer id) {
		productMapper.deleteByPrimaryKey(id);
	}

	public EasyUIResult<Product> queryList(QueryInfo queryInfo) {
		return queryList(queryInfo, null);
	}

	public EasyUIResult<Product> queryList(QueryInfo queryInfo, Example example) {
		PageHelper.startPage(queryInfo.getPage(), queryInfo.getRows());
		
		List<Product> users = productMapper.selectByExample(example);
		// 获取分页之后的信息
		PageInfo<Product> pageInfo = new PageInfo<Product>(users);
		return new EasyUIResult<Product>(pageInfo, users);
	}
	
	
	
}
