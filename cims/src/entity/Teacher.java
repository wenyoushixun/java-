package entity;

/**
 * 班导师实体类
 */

public class Teacher implements java.io.Serializable {

	private static final long serialVersionUID = -5278647079157198376L;
	private Integer teacherId;
	private String teacherNo;
	private String realName;
	private String pwd;
	private String genger;
	private Integer age;

	public Teacher() {
	}


	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherNo() {
		return this.teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGenger() {
		return this.genger;
	}

	public void setGenger(String genger) {
		this.genger = genger;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}