package com.teaching.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.teaching.bean.Classes;
import com.teaching.bean.Grade;
import com.teaching.bean.Sc;
import com.teaching.vo.CtcView;
import com.teaching.vo.GradeView;
import com.teaching.vo.StuExt;
import com.teaching.bean.Student;

public interface StuService {
	public PageInfo<StuExt> getByPageNo(int pageNO,Map map);
	public void save(Student stu);
	public Student getById(int sid);
	public void update(Student stu);
	public void del(int sid);
	List<CtcView> getXx(int claid);
	int saveSc(List<Sc> sclist); 
	List<CtcView> getkb(Student stu);
	List<GradeView> getGrade(int sid);
}
