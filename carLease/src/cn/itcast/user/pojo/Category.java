package cn.itcast.user.pojo;

import java.util.List;

import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "category")
public class Category extends BasePojo{

	private String name;
	private int pId;
	
	@Transient
	private List<Category> child;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public List<Category> getChild() {
		return child;
	}
	public void setChild(List<Category> child) {
		this.child = child;
	}
	
	
}
