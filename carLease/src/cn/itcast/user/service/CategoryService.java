package cn.itcast.user.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;
import com.github.abel533.entity.Example.Criteria;

import cn.itcast.user.mapper.CategoryMapper;
import cn.itcast.user.pojo.Category;
import cn.itcast.user.pojo.User;

@Service
public class CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;


	public List<Category> queryAll() {
		List<Category> categories = categoryMapper.selectByExample(null);

		Map<Integer, Category> parentMap = new LinkedHashMap<Integer, Category>();
		Map<Integer, List<Category>> map = new LinkedHashMap<Integer, List<Category>>();
		for (Category category : categories) {
			if (category.getpId() == 0) {
				parentMap.put(category.getId(), category);
			} else {
				List<Category> categories2 = map.get(category.getpId());
				if (categories2 == null)
					categories2 = new ArrayList<Category>();
				categories2.add(category);
				map.put(category.getpId(), categories2);
			}
		}

		List<Category> fCategory = new ArrayList<Category>();
		for (Map.Entry<Integer, Category> entry : parentMap.entrySet()) {
			Category category = entry.getValue();
			category.setChild(map.get(entry.getKey()));
			fCategory.add(category);
		}

		return fCategory;
	}

	public Object queryOne(Integer id) {
		// TODO Auto-generated method stub
		return categoryMapper.selectByPrimaryKey(id);
	}

	public void save(Category mode) {
		// TODO Auto-generated method stub
		if(mode.getId()==null)
			categoryMapper.insert(mode);
		else
			categoryMapper.updateByPrimaryKey(mode);
	}


	public List<Category> queryByPid(int id) {
		Example example = new Example(Category.class);
		 Criteria criteria  =example.createCriteria();
		 criteria.andEqualTo("pId", id);
		return categoryMapper.selectByExample(example);
	}

	public void del(Integer id) {
		categoryMapper.deleteByPrimaryKey(id);
	}
}
