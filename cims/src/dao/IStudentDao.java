package dao;

import java.util.List;

import entity.Student;

public interface IStudentDao {
	
	/**
	 * 添加学生信息
	 * @param student
	 * @throws Exception
	 */
	void saveStudent(Student student) throws Exception;
	
	/**
	 * 删除学生
	 * @param studentId
	 * @throws Exception
	 */
	void deleteStudent(int studentId) throws Exception;
	
	/**
	 * 更新学生信息
	 * @param student
	 * @throws Exception
	 */
	void updateStudent(Student student) throws Exception;
	
	/**
	 * 根据ID查找学生
	 * @param studentId
	 * @return
	 */
	Student findStudent(int studentId)throws Exception;
	
	/**
	 * 根据学号名及密码查找学生
	 * @param studentNo
	 * @param pwd
	 * @return
	 */
	Student findStudent(String studentNo, String pwd, int role)throws Exception;
	
	/**
	 * 查找所有学生
	 * @return
	 */
	List<Student> findAllStudent()throws Exception;
	
}
