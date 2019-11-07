package com.teaching.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teaching.bean.Classes;
import com.teaching.bean.Grade;
import com.teaching.bean.GradeExample;
import com.teaching.bean.Major;
import com.teaching.bean.MajorExample;
import com.teaching.bean.Teacher;
import com.teaching.bean.TeacherExample;
import com.teaching.dao.GradeMapper;
import com.teaching.dao.TeacherMapper;
import com.teaching.utils.StaticValue;
import com.teaching.vo.CtcView;
import com.teaching.vo.StuScore;
@Service
public class TeachServiceImpl implements TeacherService {

	@Autowired
	TeacherMapper teaMapper;
	@Autowired
	GradeMapper gMapper;
	@Override
	public List<CtcView> getkb(int tid) {
		return teaMapper.getkb(tid);
	}
	@Override
	public List<StuScore> getMyStu(Map map) {
		return teaMapper.getMyStu(map);
	}
	@Override
	public List<Classes> getClass(int tid) {
		return teaMapper.getClass(tid);
	}
	@Override
	public void insertGrade(Grade g) {
		gMapper.insertSelective(g);
	}
	@Override
	public List<Grade> getAll() {
		return gMapper.selectByExample(new GradeExample());
	}
	@Override
	public List<Teacher> getPage(int pageNO) {
		return teaMapper.getPage((pageNO - 1) * StaticValue.pageSize, StaticValue.pageSize);
	}
	@Override
	public PageInfo<Teacher> getPage1(int pageNO) {
		PageHelper.startPage(pageNO, StaticValue.pageSize);
		List<Teacher> tlist = teaMapper.getPage1();
		PageInfo<Teacher> info = new PageInfo<Teacher>(tlist);
		return info;
	}
	@Override
	public Teacher getById(int tid) {
		return teaMapper.selectByPrimaryKey(tid);
	}
	@Override
	public void save(Teacher teacher) {
		teaMapper.insertSelective(teacher);
	}
	@Override
	public List<Teacher> getAll1() {
		return teaMapper.selectByExample(new TeacherExample());
	}
	@Override
	public void update(Teacher teach) {
		teaMapper.updateByPrimaryKeySelective(teach);
	}
	@Override
	public void del(int tid) {
		teaMapper.deleteByPrimaryKey(tid);
	}

}
