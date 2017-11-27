package cn.itcast.user.bean;

import java.sql.Timestamp;
import java.util.List;

public class CategoryResult {
	
	private int id;
	private String name;
	private Timestamp createTime;
	
	private List<CategoryResult> child;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public List<CategoryResult> getChild() {
		return child;
	}
	public void setChild(List<CategoryResult> child) {
		this.child = child;
	}
	
	
}
