package cn.itcast.user.pojo;

import javax.persistence.Table;


@Table(name = "comment")
public class Comment extends BasePojo{

	private String content;
	private Integer uId;
	private String uPhone;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	
	
}
