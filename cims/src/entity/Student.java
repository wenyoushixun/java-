package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生实体类
 */

public class Student implements java.io.Serializable {


	private static final long serialVersionUID = 5289313012963704734L;
	private Integer studentId;
	private String studentNo;
	private String realName;
	private String pwd;
	/**性别：M男，F女*/
	private String genger;
	private Integer age;
	/**
	 * 学生角色
	 * 0、普通学生；1、班长；2、学习委员；3、生活委员
	 */
	private Integer role;
	/**我共享的文件*/
	private Set<ShareFile> shareFiles = new HashSet<ShareFile>(0);
	/**我的考勤记录*/
	private Set<Checkin> checkins = new HashSet<Checkin>(0);
	/**我的成绩*/
	private Set<Score> scores = new HashSet<Score>(0);
	/**我发起的投票*/
	private Set<Vote> votes = new HashSet<Vote>(0);

	public Student() {
	}


	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
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
	
	public String getGengerStr() {
		return this.genger.equals("M")?"男":"女";
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

	public Integer getRole() {
		return this.role;
	}
	
	public String getRoleStr(){
		switch (this.role) {
		case 1:
			return "<b>班长</b>";
		case 2:
			return "<b>学习委员</b>";
		case 3:
			return "<b>生活委员</b>";
		default:
			return "学生";
		}
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Set<ShareFile> getShareFiles() {
		return this.shareFiles;
	}

	public void setShareFiles(Set<ShareFile> shareFiles) {
		this.shareFiles = shareFiles;
	}

	public Set<Checkin> getCheckins() {
		return this.checkins;
	}

	public void setCheckins(Set<Checkin> checkins) {
		this.checkins = checkins;
	}

	public Set<Score> getScores() {
		return this.scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	public Set<Vote> getVotes() {
		return this.votes;
	}

	public void setVotes(Set<Vote> votes) {
		this.votes = votes;
	}

}