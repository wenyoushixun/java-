package dao;

import java.util.List;

import entity.Score;

public interface IScoreDao {
	/**
	 * 新增成绩记录
	 * @param score
	 * @throws Exception
	 */
	void saveScore(Score score)throws Exception;
	
	/**
	 * 删除成绩记录
	 * @param score
	 * @throws Exception
	 */
	void deleteScore(Score score)throws Exception;
	
	/**
	 * 更新成绩
	 * @param score
	 * @throws Exception
	 */
	void updateScore(Score score)throws Exception;
	
	/**
	 * 根据ID查找一条成绩记录
	 * @param sid
	 * @return
	 * @throws Exception
	 */
	Score findScore(int sid)throws Exception;
	
	/**
	 * 查找全班的成绩
	 * @return
	 * @throws Exception
	 */
	List<Score> findAllScore()throws Exception;
	
	/**
	 * 查找某一个学生的所有成绩
	 * @param studentId
	 * @return
	 * @throws Exception
	 */
	List<Score> findAllScore(int studentId)throws Exception;
}
