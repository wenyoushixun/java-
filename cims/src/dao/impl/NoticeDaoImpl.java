package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.INoticeDao;
import entity.Notice;

@Repository("noticeDao")
public class NoticeDaoImpl extends HibernateDaoSupport implements INoticeDao {

	public void deleteNotice(final int noticeId) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Notice notice = (Notice) session.get(Notice.class, noticeId);
				session.delete(notice);
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Notice> findAllNotices() throws Exception {
		return (List<Notice>) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
				SQLException {
				return session.createCriteria(Notice.class).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Notice> findAllNotices(final int userId, final int role) throws Exception {
		return (List<Notice>) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Notice.class).add(Restrictions.eq("publisher", userId)).add(Restrictions.eq("publisherRole", role)).list();
			}
		});
	}

	public Notice findNotice(final int noticeId) throws Exception {
		return (Notice) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Notice.class).add(Restrictions.eq("noticeId", noticeId)).uniqueResult();
			}
		});
	}

	public void saveNotice(final Notice notice) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.save(notice);
				return null;
			}
		});
	}

	public void updateNotice(final Notice notice) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.update(notice);
				return null;
			}
		});
	}

}
