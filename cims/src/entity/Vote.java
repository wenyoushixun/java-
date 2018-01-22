package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Vote implements java.io.Serializable {

	private static final long serialVersionUID = -5585045004511058603L;
	private Integer voteId;
	private Student student;
	private String title;
	private String describ;
	private Date publishDate;
	private Date endDate;
	private Set<Question> questions = new HashSet<Question>(0);

	public Vote() {
	}

	public Integer getVoteId() {
		return this.voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

}