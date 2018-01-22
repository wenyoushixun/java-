package biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.IVoteDao;

import entity.Option;
import entity.Question;
import entity.Vote;
import entity.Voting;
import entity.VotingResult;
import entity.VotingResultOption;

@Service
public class VoteService {
	
	@Resource
	private IVoteDao voteDao;
	
	public void saveVote(Vote vote, List<Question> questions) throws Exception{
		Set<Question> qs = new HashSet<Question>();
		for (Question question : questions) {
			Set<Option> opts = new HashSet<Option>();
			for(int i = 0; i < question.getOpts().size(); i++){
				Option option = question.getOpts().get(i);
				option.setNo(i);
				option.setQuestion(question);
				opts.add(option);
			}
			/*for (Option option : question.getOpts()) {
				option.setQuestion(question);
				opts.add(option);
			}*/
			question.setOptions(opts);
			question.setVote(vote);
			qs.add(question);
		}
		vote.setQuestions(qs);
		vote.setPublishDate(new Date(System.currentTimeMillis()));
		voteDao.saveVote(vote);
	}
	
	/**
	 * 投票
	 * @param voting
	 */
	public void voting(List<Voting> votings){
		for (Voting v : votings) {
			voteDao.saveVoting(v);
		}
	}
	
	public List<Vote> findAllVotes(){
		try {
			return voteDao.findAllVotes();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Vote findVote(int vid){
		try {
			return voteDao.findVote(vid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void deleteVote(int vid) throws Exception{
		Vote v = voteDao.findVote(vid);
		voteDao.deleteVote(v);
	}

	public List<VotingResult> voteResult(int vid){
		List<String[]> list = voteDao.getVotingResult(vid);
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String[] strings : list) {
			if(map.containsKey(strings[0])){
				List<String> temp = map.get(strings[0]);
				temp.add(strings[1]);
				temp.add(strings[2]);
				map.put(strings[0], temp);
			}else{
				List<String> temp = new ArrayList<String>();
				temp.add(strings[1]);
				temp.add(strings[2]);
				map.put(strings[0], temp);
			}
		}
		
		Set<Entry<String, List<String>>> entrys = map.entrySet();
		List<VotingResult> vs = new ArrayList<VotingResult>();
		for (Entry<String, List<String>> entry : entrys) {
			VotingResult votingResult = new VotingResult();
			List<String> opts = map.get(entry.getKey());
			
			votingResult.setQuestion(entry.getKey());
			List<VotingResultOption> vsopt = new ArrayList<VotingResultOption>();
			
			for (int idx = 0; idx < opts.size(); ) {
				vsopt.add(new VotingResultOption(opts.get(idx++), Integer.parseInt(opts.get(idx++))));
			}
			
			votingResult.setOptions(vsopt);
			vs.add(votingResult);
		}
		return vs;
	}
}
