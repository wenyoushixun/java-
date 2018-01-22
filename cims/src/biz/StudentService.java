package biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import dao.ICheckinDao;
import dao.IScoreDao;
import dao.IStudentDao;
import entity.Checkin;
import entity.Score;
import entity.Student;

@Repository
public class StudentService {
	@Resource private IStudentDao studentDao;
	@Resource private IScoreDao scoreDao;
	@Resource private ICheckinDao checkinDao;
	
	public Student login(Student student){
		try {
			return studentDao.findStudent(student.getStudentNo(), student.getPwd(), student.getRole());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Score> findMyScore(int sid){
		try {
			return scoreDao.findAllScore(sid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Checkin> findMyCheckins(int sid){
		try {
			return checkinDao.findAllCheckins(sid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
