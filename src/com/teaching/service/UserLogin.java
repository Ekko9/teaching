package com.teaching.service;

import com.teaching.bean.Student;
import com.teaching.bean.Teacher;
import com.teaching.bean.User;

public interface UserLogin {

	public User login(User user);
	public Student stuLogin(Student stu);
	public Teacher teachLogin(Teacher tea);
}
