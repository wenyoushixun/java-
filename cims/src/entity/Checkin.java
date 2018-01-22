package entity;

import java.sql.Date;

/**
 * 考勤管理实体类
 */

public class Checkin implements java.io.Serializable {

	private static final long serialVersionUID = -1271896644164426018L;

	/**考勤记录ID*/
	private Integer checkinId;
	/**学生*/
	private Student student;
	/**考勤日期*/
	private Date checkdate;
	/**类型：0：正常；1：迟到；2：早退；3：旷课；4：请假*/
	private Integer type;


	public Checkin() {
	}

	public Checkin(Student student, Date checkdate, Integer type) {
		this.student = student;
		this.checkdate = checkdate;
		this.type = type;
	}

	public Integer getCheckinId() {
		return this.checkinId;
	}

	public void setCheckinId(Integer checkinId) {
		this.checkinId = checkinId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	public Integer getType() {
		return this.type;
	}
	
	public String getTypeStr(){
		switch (this.type) {
		case 1:
			return "迟到";
		case 2:
			return "早退";
		case 3:
			return "旷课";
		case 4:
			return "请假";
		default:
			return "正常";
		}
	}

	public void setType(Integer type) {
		this.type = type;
	}

}