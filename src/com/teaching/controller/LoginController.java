package com.teaching.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teaching.bean.Student;
import com.teaching.bean.Teacher;
import com.teaching.bean.User;
import com.teaching.service.UserLogin;

@Controller
public class LoginController {
	@Autowired
	UserLogin uLogin;
	
	@RequestMapping("login")
	public String login(Model model,HttpSession session,User user,Student stu,Teacher teach,String checkNum) {
		String code = (String) session.getAttribute("validateCode");
		if(!checkNum.equalsIgnoreCase(code)) {
			model.addAttribute("msg", "验证码错误");
			return "../../login";
		}
		Integer usertype = user.getUsertype();
		switch (usertype) {
		case 1:
			//管理员登录
			User login = uLogin.login(user);
			if(login != null) {
				//登录成功
				return "index";
			}else {
				model.addAttribute("msg", "用户名或密码错误");
				return "../../login";
			}
			
		case 2:
			//教师登录
			Teacher teachLogin = uLogin.teachLogin(teach);
			if(teachLogin != null) {
				//登录成功
				session.setAttribute("teach", teachLogin);
				return "index";
			}else {
				model.addAttribute("msg", "用户名或密码错误");
				return "../../login";
			}
		
		default:
			//学生登录
			Student stuLogin = uLogin.stuLogin(stu);
			if(stuLogin != null) {
				//登录成功
				session.setAttribute("stu", stuLogin);
				return "index";
			}else {
				model.addAttribute("msg", "用户名或密码错误");
				return "../../login";
			}
		}
		
	}
}
