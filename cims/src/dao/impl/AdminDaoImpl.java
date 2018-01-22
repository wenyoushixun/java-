package dao.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


import dao.IAdminDao;
import entity.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends HibernateDaoSupport implements IAdminDao {

	public Admin findAdmin(final String adminName, final String pwd) {
		return (Admin) getHibernateTemplate().execute(new HibernateCallback() {
					
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = "from Admin as a where a.adminName=:u and a.pwd=:pwd";
				return session.createQuery(hql).setString("u", adminName).setString("pwd", pwd).uniqueResult();
			}
		});
	}

	public void saveAdmin(final Admin admin) {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.save(admin);
				return null;
			}
		});
	}
	
}
