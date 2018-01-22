package dao.impl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.IFundDao;
import entity.Fund;

@Repository("fundDao")
public class FundDaoImpl extends HibernateDaoSupport implements IFundDao {

	public void deleteFundLog(final Fund log) throws Exception {
		this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
//				String sql = "update fund set balance=balance+:cnt where occur_date>:d";//更改新记录后面日期的记录的余额
//				session.createSQLQuery(sql).setDouble("cnt", log.getCount()*log.getType()*-1).setDate("d", log.getOccurDate()).executeUpdate();
				session.delete(log);
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<Fund> findAllFundLog() throws Exception {
		return (List<Fund>) this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Fund.class).addOrder(Order.asc("occurDate")).list();
			}
		});

	}

	public void saveFundLog(final Fund log) throws Exception {
		this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
//				String sql = "update fund set balance=balance+:cnt where occur_date>:d";//更改新记录后面日期的记录的余额
//				session.createSQLQuery(sql).setDouble("cnt", log.getCount()*log.getType()).setDate("d", log.getOccurDate()).executeUpdate();
				session.save(log);
				return null;
			}
		});
	}

	public void updateFunLog(final Fund log) throws Exception {
		this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
//				String sql = "update fund set balance=balance+:cnt where occur_date>:d";//更改新记录后面日期的记录的余额
//				session.createSQLQuery(sql).setDouble("cnt", log.getCount()*log.getType()).setDate("d", log.getOccurDate()).executeUpdate();
				session.update(log);
				return null;
			}
		});
	}

	public Double findBalance(final Date date) {
		return (Double) this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Integer max = (Integer) session.createSQLQuery("select max(fund_id) from fund where occur_date<:d").setDate("d", date).uniqueResult();
				if(max == null)
					return new Double(0);
				Fund f = (Fund) session.createCriteria(Fund.class).add(Restrictions.eq("fundId", max)).uniqueResult();
				if(f == null)
					return new Double(0);
				return f.getBalance();
			}
		});	
	}
	
	public Fund findFund(final int fid){
		return (Fund) this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return session.createCriteria(Fund.class).add(Restrictions.eq("fundId", fid)).uniqueResult();
			}
		});
	}

	public Double findExpend() {
		return (Double) this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return (Double) session.createSQLQuery("select sum(count) from fund where type=-1").uniqueResult();
			}
		});	
	}

	public Double findIncomes() {
		return (Double) this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				return (Double) session.createSQLQuery("select sum(count) from fund where type=1").uniqueResult();
			}
		});	
	}

}
