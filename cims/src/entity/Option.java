package entity;

public class Option implements java.io.Serializable {

	private static final long serialVersionUID = 5735483117927550632L;
	private Integer optionId;
	private Question question;
	private Integer no;
	private String content;

	public Option() {
	}

	public Option(Question question, Integer no, String content) {
		super();
		this.question = question;
		this.no = no;
		this.content = content;
	}

	public Integer getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}