package com.julyday.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.julyday.dao.UserDao;
import com.julyday.domain.User;

@Repository("userDao2")
public class UserDaoImpl2 extends HibernateDaoSupport implements UserDao {
	
	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void save(User user) {
		System.out.println("UserDaoImpl2 save...");
		getHibernateTemplate().save(user);
	}

}
