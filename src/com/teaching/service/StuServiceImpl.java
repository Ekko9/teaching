package com.teaching.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teaching.vo.CtcView;
import com.teaching.vo.GradeView;
import com.teaching.vo.StuExt;
import com.teaching.bean.Grade;
import com.teaching.bean.Sc;
import com.teaching.bean.Student;
import com.teaching.bean.StudentExample;
import com.teaching.dao.ScMapper;
import com.teaching.dao.StudentMapper;
import com.teaching.utils.StaticValue;

@Service
public class StuServiceImpl implements StuService {
	@Autowired
	StudentMapper stuMapper;
	@Autowired
	ScMapper scMapper;
	@Override
	public PageInfo<StuExt> getByPageNo(int pageNO,Map map) {
		// TODO Auto-generated method stub
		// 设置页码
		PageHelper.startPage(pageNO, StaticValue.pageSize);
		// 查询所有数据
		List<StuExt> slist = stuMapper.getStu(map);
		// 进行分页
		PageInfo<StuExt> info = new PageInfo<StuExt>(slist);
		return info;
	}

	@Override
	public void save(Student stu) {
		//System.out.println("------"+stu);
		//stuMapper.insert(stu);
		stuMapper.insertSelective(stu);
	}

	@Override
	public Student getById(int sid) {
		
		return stuMapper.selectByPrimaryKey(sid);
	}

	@Override
	public void update(Student stu) {
		stuMapper.updateByPrimaryKeySelective(stu);
	}

	@Override
	public void del(int sid) {
		stuMapper.deleteByPrimaryKey(sid);
	}

	@Override
	public List<CtcView> getXx(int claid) {
		return stuMapper.getXx(claid);
	}

	@Override
	public int saveSc(List<Sc> sclist) {
		return scMapper.saveSc(sclist);
	}

	@Override
	public List<CtcView> getkb(Student stu) {
		
		return stuMapper.getkb(stu);
	}

	@Override
	public List<GradeView> getGrade(int sid) {
		return stuMapper.getGrade(sid);
	}

	

	

}
