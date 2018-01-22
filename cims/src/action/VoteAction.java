package action;

import java.util.List;

import javax.annotation.Resource;

import biz.VoteService;

import entity.Option;
import entity.Question;
import entity.Student;
import entity.Vote;
import entity.Voting;
import entity.VotingResult;

public class VoteAction extends BaseAction{
	@Resource
	private VoteService voteService;
	private int status;
	private Vote vote;
	private List<Vote> votes;
	private List<Question> questions;
	private List<Voting> votings;
	private List<VotingResult> voteResult;
	
	
	public String toVoteMgr(){
		votes = voteService.findAllVotes();
		return "voteMgr";
	}
	
	public String viewVotes(){
		votes = voteService.findAllVotes();
		return "votelist";
	}
	
	/**
	 * 保存新发起的投票主题
	 * @return
	 */
	public String createVote(){
		try {
			Student student = (Student) session.get("currStudent");
			vote.setStudent(student);
			voteService.saveVote(vote, questions);
		} catch (Exception e) {
			e.printStackTrace();
		}
		status = 1;
		return "addedVote";
	}
	
	/**
	 * 投票
	 * @return
	 */
	public String voting(){
		try {
			voteService.voting(votings);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "voted";
		}
		status = 1;
		return "voted";
	}
	
	public String deleteVote(){
		try {
			voteService.deleteVote(status);
		} catch (Exception e) {
			e.printStackTrace();
			status = -1;
			return "deletedVote";
		}
		status = 1;
		return "deletedVote";
	}
	
	public String voteDetail(){
		vote = voteService.findVote(status);
		return "detail";
	}
	
	public String voteResult(){
		voteResult = voteService.voteResult(status);
		vote = voteService.findVote(status);
		return "result";
	}

	public String toVoting(){
		vote = voteService.findVote(status);
		return "votePage";
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Vote getVote() {
		return vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
	}

	public List<Vote> getVotes() {
		return votes;
	}

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Voting> getVotings() {
		return votings;
	}

	public void setVotings(List<Voting> votings) {
		this.votings = votings;
	}

	public List<VotingResult> getVoteResult() {
		return voteResult;
	}

	public void setVoteResult(List<VotingResult> voteResult) {
		this.voteResult = voteResult;
	}

}
