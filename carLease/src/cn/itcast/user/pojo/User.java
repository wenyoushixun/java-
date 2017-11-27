package cn.itcast.user.pojo;


import javax.persistence.Table;

@Table(name = "user")
public class User extends BasePojo{

	
	private String phone;

	// 密码
	private String password;

	// 姓名
	private String name;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


}
