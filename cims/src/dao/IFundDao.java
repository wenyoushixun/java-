package dao;

import java.sql.Date;
import java.util.List;

import entity.Fund;

public interface IFundDao {
	
	/**
	 * 添加一条班费记录
	 * @param log
	 * @throws Exception
	 */
	void saveFundLog(Fund log) throws Exception;
	
	/**
	 * 删除一条班费记录
	 * @param log
	 * @throws Exception
	 */
	void deleteFundLog(Fund log) throws Exception;
	
	/**
	 * 更新班费记录
	 * @param log
	 * @throws Exception
	 */
	void updateFunLog(Fund log)throws Exception;
	
	/**
	 * 查找所有班费记录
	 * @throws Exception
	 */
	List<Fund> findAllFundLog()throws Exception;
	
	/**
	 * 查找总支出
	 * @return
	 */
	Double findExpend();
	
	/**
	 * 查找总收入
	 * @return
	 */
	Double findIncomes();
	
	/**
	 * 查找一条班费记录
	 * @param fid
	 * @return
	 */
	Fund findFund(final int fid);
}
