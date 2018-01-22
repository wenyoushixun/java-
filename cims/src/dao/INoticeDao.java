package dao;

import java.util.List;

import entity.Notice;

public interface INoticeDao {
	/**
	 * 保存一条通知记录
	 * @throws Exception
	 */
	void saveNotice(Notice notice)throws Exception;
	
	/**
	 * 删除一条通知
	 * @param notice
	 * @throws Exception
	 */
	void deleteNotice(int noticeId) throws Exception;
	
	/**
	 * 更新通知信息
	 * @param notice
	 * @throws Exception
	 */
	void updateNotice(Notice notice)throws Exception;
	
	/**
	 * 根据ID查找通知
	 * @param noticeId
	 * @return
	 * @throws Exception
	 */
	Notice findNotice(int noticeId)throws Exception;
	
	/**
	 * 查找所有通知
	 * @return
	 * @throws Exception
	 */
	List<Notice> findAllNotices()throws Exception;
	
	/**
	 * 查找某人发布的所有通知
	 * @param userId 发布者的ID
	 * @param role 发布者角色：0、管理员；1、老师；2、学生
	 * @return
	 * @throws Exception
	 */
	List<Notice> findAllNotices(int userId, int role)throws Exception;
}
