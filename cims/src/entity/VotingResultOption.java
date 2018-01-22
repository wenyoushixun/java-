package entity;

public class VotingResultOption {
	private String content;
	private int num;
	
	public VotingResultOption(){
		
	}
	public VotingResultOption(String content, int num) {
		super();
		this.content = content;
		this.num = num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
