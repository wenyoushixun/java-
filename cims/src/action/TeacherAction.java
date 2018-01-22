package action;

import java.util.List;

import javax.annotation.Resource;

import biz.TeacherService;

import entity.Teacher;

public class TeacherAction extends BaseAction{
	
	private Teacher teacher;
	private List<Teacher> teachers;
	private int status;
	@Resource
	private TeacherService service;
	
	public String login(){
		Teacher t = service.login(teacher.getTeacherNo(), teacher.getPwd());
		if(t != null){
			session.put("currTeacher", t);
			return "logined";
		}else{
			return "loginError";
		}
	}
	
	public String logout(){
		session.remove("currTeacher");
		return "logout";
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
