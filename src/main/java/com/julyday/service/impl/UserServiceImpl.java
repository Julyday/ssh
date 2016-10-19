package com.julyday.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.julyday.dao.UserDao;
import com.julyday.domain.User;
import com.julyday.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void save(User user) {
		userDao.save(user);
		System.out.println("UserServiceImpl save...");
	}

}
