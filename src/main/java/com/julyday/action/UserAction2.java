package com.julyday.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.julyday.domain.User;
import com.julyday.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Namespace("/user")
@ParentPackage("struts-default")
@Controller()
@Scope("prototype")
public class UserAction2 extends ActionSupport{

	@Autowired
	private UserService userService2;
	
	@Action(value = "index", results = {
			@Result(name = "success", location = "/jsp/user/index.jsp")})
	public String index(){
		return SUCCESS;
	}
	
	@Action(value = "save", results = {
			@Result(name = "success", location = "/jsp/user/success.jsp")})
	public String save(){
		System.out.println("UserAction2 save...");
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		User u = new User();
		u.setName(name);
		u.setPassword(password);
		userService2.save(u);
		request.setAttribute("name", name);
		return SUCCESS;
	}
}
