package entity;

/**
 * 成绩实体类
 */

public class Score implements java.io.Serializable {

	private static final long serialVersionUID = -7277565587611592169L;
	private Integer scoreId;
	private Student student;
	private String scoreName;
	private Integer score;
	private Integer credit;
	private String teacher;

	public Score() {
	}

	public Score(Student student, String scoreName, Integer score,
			Integer credit, String teacher) {
		this.student = student;
		this.scoreName = scoreName;
		this.score = score;
		this.credit = credit;
		this.teacher = teacher;
	}


	public Integer getScoreId() {
		return this.scoreId;
	}

	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getScoreName() {
		return this.scoreName;
	}

	public void setScoreName(String scoreName) {
		this.scoreName = scoreName;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}