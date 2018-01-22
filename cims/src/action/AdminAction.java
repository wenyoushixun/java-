package action;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import biz.AdminService;

import dao.IAdminDao;
import entity.Admin;
import entity.Checkin;
import entity.Fund;
import entity.Score;
import entity.Student;

public class AdminAction extends BaseAction{
	private static final long serialVersionUID = -2760377580954923041L;
	@Resource
	private AdminService adminService;
	private Admin admin;
	private String msg;
	private int status;
	private List<Student> students;
	private List<Fund> funds;
	private List<Checkin> checkins;
	private List<Score> scores;
	private Student student;
	private Fund fund;
	private Checkin checkin;
	private Score score;
	
	/**
	 * 管理员登录
	 * @return
	 */
	public String login(){
		Admin a = adminService.adminLogin(admin);
		if(a != null){
			session.put("currAdmin", a);
			return "login";
		}else{
			msg = "用户名或密码错误";
			return "loginError";
		}
	}
	
	/**
	 * 管理员登出
	 * @return
	 */
	public String logout(){
		session.remove("currAdmin");
		return "logouted";
	}
	
	/**
	 * 查找所有学生，跳转到班级成员管理页面
	 * @return
	 * @throws Exception 
	 */
	public String findAllStudents() throws Exception{
		students = adminService.findAllStudents();
		return "studentMgr";
	}
	
	/**
	 * 添加班级成员
	 * @return
	 * @throws Exception
	 */
	public String addNewStudent(){
		try {
			adminService.saveStudent(student);
		} catch (Exception e) {
			status = -1;
			return "addStudent";
		}
		status = 1;
		return "addStudent";
	}
	
	/**
	 * 查找学生信息，跳转到更新学生信息页面
	 * @return
	 */
	public String findStudentById(){
		student = adminService.findStudentById(status);
		return "toUpdateStudent";
	}
	
	/**
	 * 更新学生信息
	 * @return
	 */
	public String updateStudent(){
		try {
			adminService.updateStudent(student);
		} catch (Exception e) {
			status = -1;
			return "updatedStudent";
		}
		status = 1;
		return "updatedStudent";
	}
	
	/**
	 * 删除学生
	 * @return
	 */
	public String deleteStudent(){
		try {
			adminService.deleteStudent(status);
		} catch (Exception e) {
			status = -1;
			return "deleteStudent";
		}
		status = 1;
		return "deleteStudent";
	}
	
	/**
	 * 查找所有班费记录及合计信息，跳转到班费管理页面
	 * @return
	 */
	public String findAllFund(){
		funds = adminService.findAllFunds();
		DecimalFormat df = new DecimalFormat("0.00");
		msg = "总收入：<span style='color:green;font-weight:bold;'>"+df.format(adminService.findIncomes())+
			"</span>\t总支出：<span style='color:red;font-weight:bold;'>"+df.format(adminService.findExpends())+
			"</span>\t余额：<span style='color:green;font-weight:bold;'>"+adminService.findBlance()+"</span>";
		return "funds";
	}
	
	/**
	 * 添加班费收支记录
	 * @return
	 */
	public String addFund(){
		try {
			adminService.saveFund(fund);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "savedFund";
		}
		status = 1;
		return "savedFund";
	}
	
	/**
	 * 查找一条班费记录，跳转到修改页面
	 * @return
	 */
	public String toUpdateFund(){
		fund = adminService.findFund(status);
		return "toUpdateFund";
	}
	
	/**
	 * 更新班费记录
	 * @return
	 */
	public String updateFund(){
		try {
			adminService.updateFund(fund);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "updatedFund";
		}
		status = 1;
		return "updatedFund";
	}
	
	public String delFund(){
		try {
			adminService.deleteFund(status);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "deletedFund";
		}
		status = 1;
		return "deletedFund";
	}
	
	/**
	 * 添加考勤记录
	 * @return
	 */
	public String addCheckin(){
		try {
			adminService.saveCheckin(checkin);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "addedCheckin";
		}
		status = 1;
		return "addedCheckin";
	}
	
	public String checkinList(){
		checkins = adminService.findCheckin(checkin.getCheckdate());
		msg = new SimpleDateFormat("yyyy年MM月dd日").format(checkin.getCheckdate());
		return "checkinList";
	}
	
	public String getStudentName(){
		msg = adminService.findStudentById(status).getRealName();
		return "sname";
	}
	
	/**
	 * 跳转到成绩管理页面
	 * @return
	 */
	public String toScoreMgr(){
		try {
			students = adminService.findAllStudents();
			scores = adminService.findAllScore();
		} catch (Exception e) {
			e.printStackTrace();
			students = null;
			scores = null;
			return "toScoreMgr";
		}
		return "toScoreMgr";
	}
	
	/**
	 * 添加新的成绩记录
	 * @return
	 */
	public String addScore(){
		try {
			adminService.saveScore(score);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "addedScore";
		}
		status = 1;
		return "addedScore";
	}
	
	public String toUpdateScore(){
		try {
			score = adminService.findScore(status);
		} catch (Exception e) {
			msg = "系统繁忙，请稍候重试";
			throw new RuntimeException("no student defind", e);
		}
		return "toScoreUpdate";
	}
	
	public String updateScore(){
		try {
			adminService.updateScore(score);
		} catch (Exception e) {
			status = -1;
			return "updatedScore";
		}
		status = 1;
		return "updatedScore";
	}
	
	public String deleteScore(){
		try {
			adminService.deleteScore(status);
		} catch (Exception e) {
			status = -1;
			return "deletedScore";
		}
		status = 1;
		return "deletedScore";
	}
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Fund getFund() {
		return fund;
	}

	public void setFund(Fund fund) {
		this.fund = fund;
	}

	public List<Fund> getFunds() {
		return funds;
	}

	public void setFunds(List<Fund> funds) {
		this.funds = funds;
	}

	public Checkin getCheckin() {
		return checkin;
	}

	public void setCheckin(Checkin checkin) {
		this.checkin = checkin;
	}

	public List<Checkin> getCheckins() {
		return checkins;
	}

	public void setCheckins(List<Checkin> checkins) {
		this.checkins = checkins;
	}

	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

}
