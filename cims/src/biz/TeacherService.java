package biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.ITeacherDao;
import entity.Teacher;

@Service
public class TeacherService {
	@Resource
	private ITeacherDao teacherDao;
	
	public Teacher login(String tno, String pwd){
		try {
			return teacherDao.findTeacher(tno, pwd);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
