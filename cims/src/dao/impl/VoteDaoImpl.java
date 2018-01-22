package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.IVoteDao;
import entity.Option;
import entity.Question;
import entity.Vote;
import entity.Voting;

@Repository("voteDao")
public class VoteDaoImpl extends HibernateDaoSupport implements IVoteDao {

	public void deleteVote(final Vote v) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.delete(v);
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Vote> findAllVotes() throws Exception {
		return (List<Vote>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Vote.class).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	/**
	 * 查找某人发起的投票
	 */
	public List<Vote> findMyVotes(final int uid) throws Exception {
		return (List<Vote>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Vote.class).add(Restrictions.eq("student.studentId", uid)).list();
			}
		});
	}

	public Vote findVote(final int vid) throws Exception {
		return (Vote) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Vote.class).add(Restrictions.eq("voteId", vid)).uniqueResult();
			}
		});
	}

	public void saveVote(final Vote v) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				//所有关系都是由多端管理，因此先保存vote，再保存question，再保存option
				session.save(v);
				Set<Question> questions = v.getQuestions();
				for (Question question : questions) {
					session.save(question);
					Set<Option> opts = question.getOptions();
					for (Option option : opts) {
						session.save(option);
					}
				}
				return null;
			}
		});

	}

	public void updateVote(Vote v) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return null;
			}
		});

	}

	public List<Vote> findMyVoted(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveVoting(final Voting voting) {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.save(voting);
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<String[]> getVotingResult(final int vid) {
		return (List<String[]>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				/*ArrayList<Question> ques = (ArrayList<Question>) session.createCriteria(Question.class).add(Restrictions.eq("vote.voteId", vid)).list();
				List<Integer> qids = new ArrayList<Integer>();
				for (Question question : ques) {
					qids.add(question.getQuestionId());
				}
				List<Voting> votings = (List<Voting>) session.createCriteria(Voting.class).add(Restrictions.in("question.questionId", qids )).list();
				//票数，外层key为问题ID，内层key为选项ID，票数为Value
				Map<Integer, Map<Integer, Integer>> piaosu = new HashMap<Integer, Map<Integer, Integer>>();
				for (Voting voting : votings) {
					if(piaosu.containsKey(voting.getQuestion().getQuestionId())){
						Map<Integer, Integer> map = piaosu.get(voting.getQuestion().getQuestionId());
						if(map.containsKey(voting.getOption().getOptionId())){
							map.put(voting.getOption().getOptionId(), map.get(voting.getOption().getOptionId())+1);
						}
					}else{
						Map<Integer, Integer> map = piaosu.get(voting.getQuestion().getQuestionId());
						map.put(voting.getOption().getOptionId(), map.get(voting.getOption().getOptionId())+1);
					}
				}
				Set<Entry<Integer, Map<Integer, Integer>>> eset = piaosu.entrySet();
				*/
				/*
				 * select question.content,options.content,count(opt) from voting join options join question
				 *  where voting.opt=options.option_id and voting.question=question.question_id group by opt;
				 */
				String sql = "select q.content,opt.content,count(opt) from voting join options opt join question q" +
						" where voting.opt=opt.option_id and voting.question=q.question_id and q.vote=? group by opt";
				
//				List<Object> result = session.createSQLQuery(sql).setInteger("vid", vid).list();
				PreparedStatement pstmt = session.connection().prepareStatement(sql);
				pstmt.setInt(1, vid);
				ResultSet rs = pstmt.executeQuery();
				List<String[]> ratings = new ArrayList<String[]>();
				while(rs.next()){
					String[] ss = new String[3];
					ss[0] = rs.getString(1);
					ss[1] = rs.getString(2);
					ss[2] = rs.getString(3);
					ratings.add(ss);
				}
				return ratings;
			}
		});
	}

}
