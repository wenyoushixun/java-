package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.IScoreDao;
import entity.Score;

@Repository("scoreDao")
public class ScoreDaoImpl extends HibernateDaoSupport implements IScoreDao {

	public void deleteScore(final Score score) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.delete(score);
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Score> findAllScore() throws Exception {
		return (List<Score>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Score.class).addOrder(Order.asc("scoreName")).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Score> findAllScore(final int studentId) throws Exception {
		return (List<Score>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Score.class).add(Restrictions.eq("student.studentId", studentId)).list();
			}
		});
	}

	public Score findScore(final int sid) throws Exception {
		return (Score) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Score.class).add(Restrictions.eq("scoreId", sid)).uniqueResult();
			}
		});
	}

	public void saveScore(final Score score) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.save(score);
				return null;
			}
		});
	}

	public void updateScore(final Score score) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.update(score);
				return null;
			}
		});
	}

}
