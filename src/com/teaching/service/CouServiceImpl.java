package com.teaching.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teaching.bean.Course;
import com.teaching.bean.CourseExample;
import com.teaching.bean.Teacher;
import com.teaching.bean.TeacherExample;
import com.teaching.dao.CourseMapper;
import com.teaching.utils.StaticValue;

@Service
public class CouServiceImpl implements CouService {
	@Autowired
	CourseMapper couMapper;
	@Override
	public List<Course> getAllCourse() {
		return couMapper.selectByExample(new CourseExample());
	}
	@Override
	public List<Course> getPage(int pageNO) {
		
		return couMapper.getPage((pageNO - 1) * StaticValue.pageSize, StaticValue.pageSize);
	}
	@Override
	public PageInfo<Course> getPage1(int pageNO) {
		PageHelper.startPage(pageNO, StaticValue.pageSize);
		List<Course> coulist = couMapper.getPage1();
		PageInfo<Course> info = new PageInfo<Course>(coulist);
		return info;
	}
	@Override
	public Course getById(int cid) {
		return couMapper.selectByPrimaryKey(cid);
	}
	@Override
	public void save(Course course) {
		couMapper.insertSelective(course);
	}
	@Override
	public List<Course> getAll1() {
		return couMapper.selectByExample(new CourseExample());
	}
	@Override
	public void update(Course course) {
		couMapper.updateByPrimaryKeySelective(course);
	}
	@Override
	public void del(int cid) {
		couMapper.deleteByPrimaryKey(cid);
	}
	

}
