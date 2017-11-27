package cn.itcast.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.mapper.CategoryMapper;
import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.Category;
import cn.itcast.user.pojo.QueryInfo;
import cn.itcast.user.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserMapper newUserMapper;
	
	
	// private UserMapper userMapper;

	public EasyUIResult queryUserList(QueryInfo queryInfo) {
		// 设置分页参数
		PageHelper.startPage(queryInfo.getPage(), queryInfo.getRows());
		List<User> users = this.newUserMapper.select(null);
		// 获取分页之后的信息
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		return new EasyUIResult<User>(pageInfo, users);
	}


	public Object findOne(Integer id) {
		// TODO Auto-generated method stub
		return newUserMapper.selectByPrimaryKey(id);
	}


	public void save(User user) {
		// TODO Auto-generated method stub
		if(user.getId()==null)
			newUserMapper.insert(user);
		else
			newUserMapper.updateByPrimaryKey(user);
	}


	public void del(Integer id) {
		newUserMapper.deleteByPrimaryKey(id);
	}


	public User queryByPhone(String phone) {
		User user = new User();
		user.setPhone(phone);
		return newUserMapper.selectOne(user);
	}


	public void update(User user) {
		newUserMapper.updateByPrimaryKey(user);
	}

}
