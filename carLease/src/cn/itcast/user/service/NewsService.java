package cn.itcast.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.mapper.NewsMapper;
import cn.itcast.user.pojo.News;
import cn.itcast.user.pojo.QueryInfo;

@Service
public class NewsService {

	@Autowired
	private NewsMapper newsMapper;
	
	public Object queryOne(Integer id) {
		return newsMapper.selectByPrimaryKey(id);
	}

	public void save(News mode) {
		if(mode.getId()==null)
		newsMapper.insert(mode);
		else
		newsMapper.updateByPrimaryKey(mode);
	}



	public void del(Integer id) {
		newsMapper.deleteByPrimaryKey(id);
	}

	public EasyUIResult<News> queryList(QueryInfo queryInfo) {
		PageHelper.startPage(queryInfo.getPage(), queryInfo.getRows());
		List<News> users = newsMapper.select(null);
		PageInfo<News> pageInfo = new PageInfo<News>(users);
		return new EasyUIResult<News>(pageInfo, users);
	}

}
