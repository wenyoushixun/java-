package entity;

import java.sql.Timestamp;

/**
 * 文件共享实体类
 */

public class ShareFile implements java.io.Serializable {

	private static final long serialVersionUID = -3140571914083361900L;
	private Integer fileId;
	private Student student;
	/**文件路径及文件名*/
	private String fileName;
	private String title;
	private String describ;
	private Timestamp publishTime;

	public ShareFile() {
	}

	public ShareFile(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	public ShareFile(Student student, String fileName, String title,
			String describ, Timestamp publishTime) {
		this.student = student;
		this.fileName = fileName;
		this.title = title;
		this.describ = describ;
		this.publishTime = publishTime;
	}


	public Integer getFileId() {
		return this.fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescrib() {
		return this.describ;
	}

	public void setDescrib(String describ) {
		this.describ = describ;
	}

	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

}