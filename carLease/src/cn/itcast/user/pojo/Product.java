package cn.itcast.user.pojo;

import javax.persistence.Table;

@Table(name = "product")
public class Product extends BasePojo{
	
	private String img;
	private String name;
	private String content;
	private Integer zuowei;
	private Integer amount;
	private Integer cId;
	private Integer cpId;
	private String color;
	private String chepai;
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getZuowei() {
		return zuowei;
	}
	public void setZuowei(Integer zuowei) {
		this.zuowei = zuowei;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Integer getCpId() {
		return cpId;
	}
	public void setCpId(Integer cpId) {
		this.cpId = cpId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getChepai() {
		return chepai;
	}
	public void setChepai(String chepai) {
		this.chepai = chepai;
	}
	
	
}
