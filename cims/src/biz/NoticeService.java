package biz;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.INoticeDao;
import entity.Notice;

@Service
public class NoticeService {
	@Resource
	private INoticeDao noticeDao;
	
	public void saveNotice(Notice notice) throws Exception{
		notice.setPublishTime(new Timestamp(System.currentTimeMillis()));
		noticeDao.saveNotice(notice);
	}
	
	public void deleteNotice(int nid) throws Exception{
		noticeDao.deleteNotice(nid);
	}
	
	public void updateNotice(Notice notice, int nid) throws Exception{
		Notice org = noticeDao.findNotice(nid);
		org.setContent(notice.getContent());
		org.setTitle(notice.getTitle());
		noticeDao.updateNotice(org);
	}
	
	public List<Notice> findAllNotices(){
		try {
			return noticeDao.findAllNotices();
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Notice>();
		}
	}
	
	public Notice findNotice(int nid){
		try {
			return noticeDao.findNotice(nid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Notice> findMyNotices(int uid, int role){
		try {
			System.out.println("Service...."+uid+"\t"+role);
			return noticeDao.findAllNotices(uid, role);
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Notice>();
		}
	}
}
