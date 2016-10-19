package com.julyday.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.julyday.dao.UserDao;
import com.julyday.domain.User;
import com.julyday.service.UserService;

@Service("userService2")
@Transactional
public class UserServiceImpl2 implements UserService {
	
	@Autowired
	private UserDao userDao2;
	
	@Override
	public void save(User user) {
		userDao2.save(user);
		System.out.println("UserServiceImpl2 save...");
	}

}
