package entity;

/**
 *	管理员实体类
 */

public class Admin implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1440102574300630393L;
	private Integer adminId;
	private String adminName;
	private String pwd;


	public Admin() {
	}

	public Admin(String adminName, String pwd) {
		this.adminName = adminName;
		this.pwd = pwd;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}