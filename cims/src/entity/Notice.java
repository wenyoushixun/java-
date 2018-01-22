package entity;

import java.sql.Timestamp;

/**
 * 通知实体类
 */

public class Notice implements java.io.Serializable {

	private static final long serialVersionUID = 4704126804539935076L;
	private Integer noticeId;
	private String title;
	private String content;
	private Timestamp publishTime;
	private Integer publisher;
	/**
	 * 发布者角色：0、管理员；1、老师；2、学生
	*/
	private Integer publisherRole;
	private String publisherName;

	public Notice() {
	}

	public Notice(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	public Notice(String title, String content, Timestamp publishTime,
			Integer publisher, Integer publisherRole, String publisherName) {
		this.title = title;
		this.content = content;
		this.publishTime = publishTime;
		this.publisher = publisher;
		this.publisherRole = publisherRole;
		this.publisherName = publisherName;
	}


	public Integer getNoticeId() {
		return this.noticeId;
	}

	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	public Integer getPublisher() {
		return this.publisher;
	}

	public void setPublisher(Integer publisher) {
		this.publisher = publisher;
	}

	public Integer getPublisherRole() {
		return this.publisherRole;
	}

	public void setPublisherRole(Integer publisherRole) {
		this.publisherRole = publisherRole;
	}

	public String getPublisherName() {
		return this.publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

}