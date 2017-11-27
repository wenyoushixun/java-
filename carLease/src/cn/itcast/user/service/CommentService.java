package cn.itcast.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itcast.user.bean.EasyUIResult;
import cn.itcast.user.mapper.CommentMapper;
import cn.itcast.user.pojo.Comment;
import cn.itcast.user.pojo.QueryInfo;

@Service
public class CommentService {

	@Autowired
	private CommentMapper commentMapper;
	
	public Object queryOne(Integer id) {
		return commentMapper.selectByPrimaryKey(id);
	}

	public void save(Comment mode) {
		if(mode.getId()==null)
			commentMapper.insert(mode);
		else
			commentMapper.updateByPrimaryKey(mode);
	}



	public void del(Integer id) {
		commentMapper.deleteByPrimaryKey(id);
	}

	public EasyUIResult<Comment> queryList(QueryInfo queryInfo) {
		PageHelper.startPage(queryInfo.getPage(), queryInfo.getRows());
		List<Comment> users = commentMapper.select(null);
		PageInfo<Comment> pageInfo = new PageInfo<Comment>(users);
		return new EasyUIResult<Comment>(pageInfo, users);
	}

}
