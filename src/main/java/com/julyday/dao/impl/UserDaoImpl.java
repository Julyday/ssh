package com.julyday.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.julyday.dao.UserDao;
import com.julyday.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Override
	public void save(User user) {
		System.out.println("UserDaoImpl save...");
		getHibernateTemplate().save(user);
	}

}
