package dao;

import java.util.List;

import entity.ShareFile;

public interface IShareFileDao {
	/**
	 * 保存一条共享文件记录
	 * @param file
	 * @throws Exception
	 */
	void saveShareFile(ShareFile file) throws Exception;
	
	/**
	 * 删除共享文件记录
	 * @param file
	 * @throws Exception
	 */
	void deleteShareFile(ShareFile file) throws Exception;
	
	/**
	 * 更新共享文件记录
	 * @param file
	 * @throws Exception
	 */
	void updateShareFile(ShareFile file) throws Exception;
	
	/**
	 * 根据ID查找共享文件记录
	 * @param fildId
	 * @return
	 * @throws Exception
	 */
	ShareFile findShareFile(int fildId)throws Exception;
	
	/**
	 * 查找所有共享文件
	 * @return
	 * @throws Exception
	 */
	List<ShareFile> findAllShareFiles()throws Exception;
	
	/**
	 * 查找某人发布的所有共享文件
	 * @param sid
	 * @return
	 * @throws Exception
	 */
	List<ShareFile> findAllShareFiles(int sid)throws Exception;
}
