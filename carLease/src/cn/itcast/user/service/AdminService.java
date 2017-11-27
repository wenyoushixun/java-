package cn.itcast.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.user.mapper.AdminMapper;
import cn.itcast.user.pojo.Admin;


@Service
public class AdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	public void changpassword(Admin admin) {
		adminMapper.updateByPrimaryKey(admin);
	}

	public Admin queryByName(String name) {
		Admin arg0 = new Admin();
		arg0.setName(name);
		
		return adminMapper.selectOne(arg0);
	}

}
