package dao;

import java.util.List;

import entity.Teacher;

public interface ITeacherDao {
	/**
	 * 保存教师信息
	 * @param t
	 * @throws Exception
	 */
	void saveTeacher(Teacher t)throws Exception;
	
	/**
	 * 删除教师
	 * @param t
	 * @throws Exception
	 */
	void deleteTeacher(Teacher t)throws Exception;
	
	/**
	 * 更新教师信息
	 * @param t
	 * @throws Exception
	 */
	void updateTeacher(Teacher t)throws Exception;
	
	/**
	 * 根据ID查找教师
	 * @param tid
	 * @return
	 * @throws Exception
	 */
	Teacher findTeacher(int tid)throws Exception;
	
	/**
	 * 根据教师的职工号名及密码查找
	 * @param pwd
	 * @param tno
	 * @return
	 * @throws Exception
	 */
	Teacher findTeacher(String pwd, String tno)throws Exception;
	
	/**
	 * 查找所有教师信息
	 * @return
	 * @throws Exception
	 */
	List<Teacher> findAllTeacher()throws Exception;
	
}
