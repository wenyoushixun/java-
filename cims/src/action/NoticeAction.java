package action;

import java.util.List;

import javax.annotation.Resource;

import biz.NoticeService;

import entity.Admin;
import entity.Notice;
import entity.Student;
import entity.Teacher;

public class NoticeAction extends BaseAction{
	@Resource
	private NoticeService service;
	private Notice notice;
	private List<Notice> notices;
	private int status;
	
	public String toNoticeMgr(){
		notices = service.findAllNotices();
		return "noticeMgr";
	}
	
	public String saveNotice(){
		if(notice.getPublisherRole() == 0){
			Admin admin = (Admin) session.get("currAdmin");
			notice.setPublisher(admin.getAdminId());
			notice.setPublisherName("管理员");
		}else if(notice.getPublisherRole() == 1){
			Teacher teacher = (Teacher) session.get("currTeacher");
			notice.setPublisher(teacher.getTeacherId());
			notice.setPublisherName("班导师");
		}else if(notice.getPublisherRole() == 2){
			Student std = (Student) session.get("currStudent");
			notice.setPublisher(std.getStudentId());
			notice.setPublisherName(std.getRealName());
		}else{
			status = -1;
			return "savedNotice";
		}
		try {
			service.saveNotice(notice);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "savedNotice";
		}
		status = 1;
		return "savedNotice";
	}
	
	public String toNoticeUpdate(){
		notice = service.findNotice(status);
		return "upadtePage";
	}
	
	public String updateNotice(){
		try {
			service.updateNotice(notice, status);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "updated";
		}
		status = 1;
		return "updated";
	}
	
	public String deleteNotice(){
		try {
			service.deleteNotice(status);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "deleted";
		}
		status = 1;
		return "deleted";
	}
	
	/**
	 * 查看学生发表的通知
	 * @return
	 */
	public String showMyNotice(){
		Student std = (Student) session.get("currStudent");
		notices = service.findMyNotices(std.getStudentId(), 2);
		return "myNotices";
	}
	
	public String noticeDiv(){
		notices = service.findAllNotices();
		return "noticediv";
	}
	
	public String noticeDetail(){
		notice = service.findNotice(status);
		return "detail";
	}

	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public List<Notice> getNotices() {
		return notices;
	}

	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
