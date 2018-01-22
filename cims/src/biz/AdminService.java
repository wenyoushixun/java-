package biz;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.IAdminDao;
import dao.ICheckinDao;
import dao.IFundDao;
import dao.IScoreDao;
import dao.IStudentDao;
import entity.Admin;
import entity.Checkin;
import entity.Fund;
import entity.Score;
import entity.Student;

@Service
public class AdminService {
	@Resource
	private IAdminDao adminDao;
	@Resource
	private IStudentDao studentDao;
	@Resource
	private IFundDao fundDao;
	@Resource
	private ICheckinDao checkinDao;
	@Resource
	private IScoreDao scoreDao;
	
	public Admin adminLogin(Admin admin){
		return adminDao.findAdmin(admin.getAdminName(), admin.getPwd());
	}
	
	/**
	 * 查找所有学生
	 * @return
	 * @throws Exception 
	 */
	public List<Student> findAllStudents() throws Exception{
		return studentDao.findAllStudent();
	}
	
	/**
	 * 新增班级成员
	 * @param student
	 * @throws Exception
	 */
	public void saveStudent(Student student) throws Exception{
		studentDao.saveStudent(student);
	}
	
	public Student findStudentById(int studentId){
		try {
			return studentDao.findStudent(studentId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void updateStudent(Student student) throws Exception{
		studentDao.updateStudent(student);
	}
	
	public void deleteStudent(int studentId) throws Exception{
		studentDao.deleteStudent(studentId);
	}
	
	public void saveFund(Fund fund) throws Exception{
		fundDao.saveFundLog(fund);
	}
	
	public List<Fund> findAllFunds() {
		try {
			return fundDao.findAllFundLog();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Fund findFund(int fid){
		return fundDao.findFund(fid);
	}
	
	public void updateFund(Fund fund) throws Exception{
		fundDao.updateFunLog(fund);
	}
	
	public void deleteFund(int fid) throws Exception{
		Fund fund = fundDao.findFund(fid);
		fundDao.deleteFundLog(fund);
	}
	
	public double findExpends(){
		return fundDao.findExpend();
	}
	
	public double findIncomes(){
		return fundDao.findIncomes();
	}
	
	/**
	 * 查找班费余额
	 * @return
	 */
	public double findBlance(){
		return fundDao.findIncomes().doubleValue() - fundDao.findExpend().doubleValue();
	}
	
	/**
	 * 添加考勤记录
	 * @param c
	 * @throws Exception
	 */
	public void saveCheckin(Checkin c) throws Exception{
		checkinDao.saveCheckin(c);
	}
	
	public List<Checkin> findCheckin(Date date){
		try {
			return checkinDao.findAllCheckins(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void saveScore(Score score) throws Exception{
		scoreDao.saveScore(score);
	}
	
	public List<Score> findAllScore(){
		try {
			return scoreDao.findAllScore();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Score findScore(int sid) throws Exception{
		return scoreDao.findScore(sid);
	}
	
	public void updateScore(Score score) throws Exception{
		scoreDao.updateScore(score);
	}
	
	public void deleteScore(int sid) throws Exception{
		Score score = scoreDao.findScore(sid);
		scoreDao.deleteScore(score);
	}
}
