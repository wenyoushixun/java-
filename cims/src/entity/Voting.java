package entity;

public class Voting implements java.io.Serializable {

	private static final long serialVersionUID = -2424600531448495270L;
	private Integer votingId;
	private Student student;
	private Option option;
	private Question question;

	public Voting() {
	}

	public Integer getVotingId() {
		return this.votingId;
	}

	public void setVotingId(Integer votingId) {
		this.votingId = votingId;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Option getOption() {
		return this.option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}