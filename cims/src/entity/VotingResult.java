package entity;

import java.util.List;

public class VotingResult {
	private String question;
	private List<VotingResultOption> options;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<VotingResultOption> getOptions() {
		return options;
	}
	public void setOptions(List<VotingResultOption> options) {
		this.options = options;
	}
	
}
