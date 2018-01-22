package dao.impl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.ICheckinDao;
import entity.Checkin;

@Repository("checkinDao")
public class CheckinDaoImpl extends HibernateDaoSupport implements ICheckinDao {

	public void deleteCheckin(final Checkin checkin) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.delete(checkin);
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Checkin> findAllCheckins(final Date date) throws Exception {
		return (List<Checkin>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Checkin.class).add(Restrictions.eq("checkdate", date)).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Checkin> findAllCheckins(final int studentId) throws Exception {
		return (List<Checkin>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Checkin.class).add(Restrictions.eq("student.studentId", studentId)).list();
			}
		});
	}

	public void saveCheckin(final Checkin checkin) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.save(checkin);
				return null;
			}
		});
	}

	public void updateCheckin(final Checkin checkin) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.update(checkin);
				return null;
			}
		});
	}

}
