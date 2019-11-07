package com.teaching.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teaching.bean.Student;
import com.teaching.bean.StudentExample;
import com.teaching.bean.Teacher;
import com.teaching.bean.TeacherExample;
import com.teaching.bean.User;
import com.teaching.bean.UserExample;
import com.teaching.bean.UserExample.Criteria;
import com.teaching.dao.StudentMapper;
import com.teaching.dao.TeacherMapper;
import com.teaching.dao.UserMapper;

@Service
public class UserLoginImpl implements UserLogin {

	@Autowired
	UserMapper uMapper;
	@Autowired
	StudentMapper stuMapper;
	@Autowired
	TeacherMapper teachMapper;
	@Override
	public User login(User user) {
		UserExample ue = new UserExample();
		Criteria c = ue.createCriteria();
		c.andLoginnameEqualTo(user.getLoginname());
		c.andPasswordEqualTo(user.getPassword());

		List<User> ulist = uMapper.selectByExample(ue);
		if (ulist != null && ulist.size() > 0) {
			return ulist.get(0);
		}
		return null;
	}

	@Override
	public Student stuLogin(Student stu) {
		StudentExample stue = new StudentExample();
		com.teaching.bean.StudentExample.Criteria cstu = stue.createCriteria();
		cstu.andLoginnameEqualTo(stu.getLoginname());
		cstu.andPasswordEqualTo(stu.getPassword());
		
		List<Student> stuList = stuMapper.selectByExample(stue);
		if (stuList != null && stuList.size() > 0) {
			return stuList.get(0);
		}
		return null;
	}

	@Override
	public Teacher teachLogin(Teacher tea) {
		TeacherExample teach = new TeacherExample();
		com.teaching.bean.TeacherExample.Criteria cctea = teach.createCriteria();
		cctea.andLoginnameEqualTo(tea.getLoginname());
		cctea.andPasswordEqualTo(tea.getPassword());
		List<Teacher> teaList = teachMapper.selectByExample(teach);
		if (teaList != null && teaList.size() > 0) {
			return teaList.get(0);
		}
		return null;
	}

}
