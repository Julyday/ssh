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

import com.julyday.domain.Admin;
import com.julyday.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Namespace("/admin")
@ParentPackage("struts-default")
@Controller()
@Scope("prototype")
public class AdminAction extends ActionSupport{

	@Autowired
	private AdminService adminService;
	
	@Action(value = "index", results = {
			@Result(name = "success", location = "/jsp/admin/index.jsp")})
	public String index(){
		return SUCCESS;
	}
	
	@Action(value = "save", results = {
			@Result(name = "success", location = "/jsp/admin/success.jsp")})
	public String save(){
		System.out.println("AdminAction save...");
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		Admin admin = new Admin();
		admin.setName(name);
		admin.setPassword(password);
		adminService.save(admin);
		request.setAttribute("name", name);
		return SUCCESS;
	}
}
