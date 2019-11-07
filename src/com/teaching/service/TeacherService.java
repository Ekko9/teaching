package com.teaching.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.teaching.bean.Classes;
import com.teaching.bean.Grade;
import com.teaching.bean.Major;
import com.teaching.bean.Student;
import com.teaching.bean.Teacher;
import com.teaching.vo.CtcView;
import com.teaching.vo.StuScore;

public interface TeacherService {

	List<CtcView> getkb(int tid);
	List<StuScore> getMyStu(Map map);
	List<Classes> getClass(int tid);
	public void insertGrade(Grade g);
	public List<Grade> getAll();
	
	public List<Teacher> getPage(int pageNO);
	public PageInfo<Teacher> getPage1(int pageNO);
	
	public Teacher getById(int tid);
	public void save(Teacher teacher);
	public List<Teacher> getAll1();
	public void update(Teacher teach);
	
	public void del(int tid);
}
