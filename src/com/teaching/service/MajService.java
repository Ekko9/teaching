package com.teaching.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.teaching.bean.Major;

public interface MajService {
	public List<Major> getPage(int pageNO);
	public PageInfo<Major> getPage1(int pageNO);	
	public List<Major> getAll();
	public List<Major> getMlist();
	public void del(int mid);
	public Major getById(int mid);
	public void save(Major major);
	public void update(Major major);
}
