package dao;

import java.util.List;

import entity.Vote;
import entity.Voting;

public interface IVoteDao {
	/**
	 * 发起一个投票
	 * @param v
	 * @throws Exception
	 */
	void saveVote(Vote v)throws Exception;
	
	/**
	 * 删除投票
	 * @param v
	 * @throws Exception
	 */
	void deleteVote(Vote v)throws Exception;
	
	/**
	 * 更新投票
	 * @param v
	 * @throws Exception
	 */
	void updateVote(Vote v)throws Exception;
	
	/**
	 * 查找投票信息
	 * @param vid
	 * @return
	 * @throws Exception
	 */
	Vote findVote(int vid)throws Exception;
	
	/**
	 * 查找所有投票
	 * @return
	 * @throws Exception
	 */
	List<Vote> findAllVotes()throws Exception;
	
	/**
	 * 查找某人发起的投票
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	List<Vote> findMyVotes(int uid)throws Exception;
	
	
	/**
	 * 查找某人所有参与的投票
	 * @param uid
	 * @return
	 */
	List<Vote> findMyVoted(int uid);
	
	/**
	 * 保存一次投票
	 */
	void saveVoting(Voting voting);
	
	/**
	 * 查看投票结果
	 * @param vid
	 * @return
	 */
	List<String[]> getVotingResult(int vid);
}
