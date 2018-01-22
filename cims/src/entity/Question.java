package entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question  implements java.io.Serializable {

	private static final long serialVersionUID = -7443774658108056928L;
	private Integer questionId;
     private Vote vote;
     private String content;
     private Set<Option> options = new HashSet<Option>(0);
     private List<Option> opts = new ArrayList<Option>();


    public Question() {
    }

    
    public Integer getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Vote getVote() {
        return this.vote;
    }
    
    public void setVote(Vote vote) {
        this.vote = vote;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Set<Option> getOptions() {
        return this.options;
    }
    
    public void setOptions(Set<Option> options) {
        this.options = options;
    }

	public List<Option> getOpts() {
		return opts;
	}

	public void setOpts(List<Option> opts) {
		this.opts = opts;
	}

}