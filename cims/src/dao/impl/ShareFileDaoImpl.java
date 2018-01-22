package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.IShareFileDao;
import entity.ShareFile;

@Repository("fileDao")
public class ShareFileDaoImpl extends HibernateDaoSupport implements IShareFileDao {

	public void deleteShareFile(final ShareFile file) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.delete(file);
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<ShareFile> findAllShareFiles() throws Exception {
		return (List<ShareFile>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(ShareFile.class).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<ShareFile> findAllShareFiles(final int sid) throws Exception {
		return (List<ShareFile>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(ShareFile.class).add(Restrictions.eq("student.studentId", sid)).list();
			}
		});
	}

	public ShareFile findShareFile(final int fileId) throws Exception {
		return (ShareFile) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(ShareFile.class).add(Restrictions.eq("fileId", fileId)).uniqueResult();
			}
		});
	}

	public void saveShareFile(final ShareFile file) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.save(file);
				return null;
			}
		});

	}

	public void updateShareFile(final ShareFile file) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.update(file);
				return null;
			}
		});
	}

}
