package com.teaching.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.teaching.bean.Course;
import com.teaching.bean.Teacher;

public interface CouService {

	public List<Course> getAllCourse();
	public List<Course> getPage(int pageNO);
	public PageInfo<Course> getPage1(int pageNO);
	public Course getById(int cid);
	public void save(Course course);
	public List<Course> getAll1();
	public void update(Course course);
	
	public void del(int cid);
}
