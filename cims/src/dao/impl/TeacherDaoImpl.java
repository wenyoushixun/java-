package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.ITeacherDao;
import entity.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl extends HibernateDaoSupport implements ITeacherDao {

	public void deleteTeacher(final Teacher t) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.delete(t);
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Teacher> findAllTeacher() throws Exception {
		return (List<Teacher>) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return null;
			}
		});
	}

	public Teacher findTeacher(final int tid) throws Exception {
		return (Teacher) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Teacher.class).add(Restrictions.eq("teacherId", tid)).uniqueResult();
			}
		});
	}

	public void saveTeacher(final Teacher t) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.save(t);
				return null;
			}
		});
	}

	public void updateTeacher(final Teacher t) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.update(t);
				return null;
			}
		});
	}

	public Teacher findTeacher(final String tno, final String pwd) throws Exception {
		return (Teacher) getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Teacher.class).add(Restrictions.eq("teacherNo", tno)).add(Restrictions.eq("pwd", pwd)).uniqueResult();
			}
		});
	}

}
