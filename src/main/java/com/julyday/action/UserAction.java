package com.julyday.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.julyday.domain.User;
import com.julyday.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport{

	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String save(){
		System.out.println("UserAction save...");
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		User u = new User();
		u.setName(name);
		u.setPassword(password);
		userService.save(u);
		request.setAttribute("name", name);
		return SUCCESS;
	}
}
