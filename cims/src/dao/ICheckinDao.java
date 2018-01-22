package dao;

import java.sql.Date;
import java.util.List;

import entity.Checkin;

public interface ICheckinDao {
	
	/**
	 * 添加一条考勤记录
	 * @param checkin
	 * @throws Exception
	 */
	void saveCheckin(Checkin checkin)throws Exception;
	
	/**
	 * 更新考勤记录
	 * @param checkin
	 * @throws Exception
	 */
	void updateCheckin(Checkin checkin)throws Exception;
	
	/**
	 * 删除考勤记录
	 * @param checkin
	 * @throws Exception
	 */
	void deleteCheckin(Checkin checkin)throws Exception;
	
	/**
	 * 查找某一天的所有考勤记录
	 * @param date
	 * @return
	 * @throws Exception
	 */
	List<Checkin> findAllCheckins(Date date)throws Exception;
	
	/**
	 * 查找某学生的所有考勤记录
	 * @param studentId
	 * @return
	 * @throws Exception
	 */
	List<Checkin> findAllCheckins(int studentId)throws Exception;
}
