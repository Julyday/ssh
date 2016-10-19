package com.julyday.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.julyday.dao.AdminDao;
import com.julyday.domain.Admin;
import com.julyday.service.AdminService;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public void save(Admin admin) {
		adminDao.save(admin);
		System.out.println("AdminServiceImpl save...");
	}

}
