package com.teaching.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.teaching.bean.Classes;
import com.teaching.bean.Ctc;
import com.teaching.bean.Teacher;
import com.teaching.vo.CtcView;

public interface ClassesService {

	public List<Classes> getPage(int pageNO);
	public PageInfo<Classes> getPage1(int pageNO);	
	public void save(Classes classes);
	public void update(Classes classes);
	public Classes getById(int cid);	
	public void del(int cid);
	public List<Classes> getClaListById(int majid);
	public List<Classes> getAllClasses();
	public List<Teacher> getTeacher(int timeid,int weekid,int claid);
	public List<Ctc> savectc(List<Integer> cids, List<Integer> tids, List<Integer> types, int weekid, int claid);
	public List<CtcView> getpk(int cid);
}
