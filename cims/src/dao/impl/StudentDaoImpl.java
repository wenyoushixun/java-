package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.IStudentDao;
import entity.Student;

@Repository("studentDao")
public class StudentDaoImpl extends HibernateDaoSupport implements IStudentDao {

	public void deleteStudent(final int studentId) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.createSQLQuery("delete from student where student_id=:sid").setInteger("sid", studentId).executeUpdate();
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Student> findAllStudent() {
		return (List<Student>) getHibernateTemplate().execute(new HibernateCallback() {
					
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Student.class).list();
			}
		});
	}

	public Student findStudent(final int studentId) {
		return (Student) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Student.class).add(Restrictions.eq("studentId", studentId)).uniqueResult();
			}
		});
	}

	public Student findStudent(final String studentNo, final String pwd, final int role) {
		return (Student) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Student.class).add(Restrictions.eq("studentNo", studentNo)).add(Restrictions.eq("pwd", pwd)).add(Restrictions.eq("role", role)).uniqueResult();
			}
		});
	}

	public void saveStudent(final Student student) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.save(student);
				return null;
			}
		});
	}

	public void updateStudent(final Student student) throws Exception {
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				session.update(student);
				return null;
			}
		});
	}

}
