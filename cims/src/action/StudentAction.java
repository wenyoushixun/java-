package action;

import java.util.List;

import javax.annotation.Resource;

import biz.StudentService;
import entity.Checkin;
import entity.Score;
import entity.Student;

public class StudentAction extends BaseAction{
	@Resource
	private StudentService studentService;
	private Student student;
	private String msg;
	private List<Score> scores;
	private int status;
	private List<Checkin> checkins;
	
	public String login(){
		Student std = studentService.login(student);
		if(std != null){
			session.put("currStudent", std);
			return "logined";
		}else{
			msg = "学号或密码错误";
			return "loginError";
		}
	}
	
	public String logout(){
		session.remove("currStudent");
		return "logout";
	}
	
	public String showMyScore(){
		Student sdt = (Student) session.get("currStudent");
		scores = studentService.findMyScore(sdt.getStudentId());
		return "scores";
	}
	
	public String showMyCheckin(){
		Student std = (Student) session.get("currStudent");
		checkins = studentService.findMyCheckins(std.getStudentId());
		return "checkins";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<Checkin> getCheckins() {
		return checkins;
	}

	public void setCheckins(List<Checkin> checkins) {
		this.checkins = checkins;
	}
}
