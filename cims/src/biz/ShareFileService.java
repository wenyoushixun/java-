package biz;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.IShareFileDao;

import entity.ShareFile;

@Service("fileService")
public class ShareFileService {
	@Resource
	private IShareFileDao fileDao;
	
	public void saveShareFile(ShareFile shareFile) throws Exception{
		shareFile.setPublishTime(new Timestamp(System.currentTimeMillis()));
		fileDao.saveShareFile(shareFile);
	}
	
	public void updateShareFile(ShareFile file, int status) throws Exception{
		ShareFile org = fileDao.findShareFile(status);
		org.setFileName(file.getFileName());
		org.setTitle(file.getTitle());
		org.setDescrib(file.getDescrib());
		fileDao.updateShareFile(org);
	}
	
	public List<ShareFile> findAllFiles(){
		try {
			return fileDao.findAllShareFiles();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ShareFile findShareFile(int fildId){
		try {
			return fileDao.findShareFile(fildId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<ShareFile> findMyFiles(int uid){
		try {
			return fileDao.findAllShareFiles(uid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void deleteFile(int fid) throws Exception{
		ShareFile file = fileDao.findShareFile(fid);
		fileDao.deleteShareFile(file);
	}
}
