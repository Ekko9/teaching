package com.teaching.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teaching.bean.Classes;
import com.teaching.bean.Major;
import com.teaching.bean.MajorExample;
import com.teaching.dao.MajorMapper;
import com.teaching.utils.StaticValue;
@Service
public class MajServiceImpl implements MajService {

	@Autowired
	MajorMapper majMapper;
	@Override
	public List<Major> getAll() {
		
		return majMapper.selectByExample(new MajorExample());
	}
	@Override
	public List<Major> getMlist() {
		List<Major> mlist = majMapper.selectByExample(new MajorExample());
		return mlist;
	}
	@Override
	public List<Major> getPage(int pageNO) {
		
		return majMapper.getPage((pageNO - 1) * StaticValue.pageSize, StaticValue.pageSize);
	}
	@Override
	public PageInfo<Major> getPage1(int pageNO) {
		PageHelper.startPage(pageNO, StaticValue.pageSize);
		List<Major> clist = majMapper.getPage1();
		PageInfo<Major> info = new PageInfo<Major>(clist);
		return info;
	}
	@Override
	public void del(int mid) {
		majMapper.deleteByPrimaryKey(mid);
	}
	@Override
	public Major getById(int mid) {
		return majMapper.selectByPrimaryKey(mid);
	}
	@Override
	public void save(Major major) {
		majMapper.insertSelective(major);
	}
	@Override
	public void update(Major major) {
		majMapper.updateByPrimaryKeySelective(major);
	}

}
