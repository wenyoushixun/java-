package cn.itcast.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.mapper.OrderMapper;
import cn.itcast.user.pojo.Order;
import cn.itcast.user.pojo.QueryInfo;

@Service
public class OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	public Object queryOne(Integer id) {
		return orderMapper.selectByPrimaryKey(id);
	}

	public void save(Order mode) {
		if(mode.getId()==null)
		orderMapper.insert(mode);
		else
		orderMapper.updateByPrimaryKey(mode);
	}



	public void del(Integer id) {
		orderMapper.deleteByPrimaryKey(id);
	}

	public EasyUIResult<Order> queryList(QueryInfo queryInfo) {
		PageHelper.startPage(queryInfo.getPage(), queryInfo.getRows());
		List<Order> users = orderMapper.select(null);
		PageInfo<Order> pageInfo = new PageInfo<Order>(users);
		return new EasyUIResult<Order>(pageInfo, users);
	}

	public Object queryList(QueryInfo queryInfo, Example example) {
		PageHelper.startPage(queryInfo.getPage(), queryInfo.getRows());
		List<Order> users = orderMapper.selectByExample(example);
		PageInfo<Order> pageInfo = new PageInfo<Order>(users);
		return new EasyUIResult<Order>(pageInfo, users);
	}

	public void updateStatus(Integer id, int status) {
		Order order = orderMapper.selectByPrimaryKey(id);
		order.setStatus(status);
		orderMapper.updateByPrimaryKey(order);
	}

}
