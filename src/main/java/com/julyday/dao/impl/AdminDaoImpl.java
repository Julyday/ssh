package com.julyday.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.julyday.dao.AdminDao;
import com.julyday.domain.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {
	
	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void save(Admin admin) {
		System.out.println("AdminDaoImpl save...");
		getHibernateTemplate().save(admin);
	}

}
