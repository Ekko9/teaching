package com.teaching.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teaching.bean.Classes;
import com.teaching.bean.ClassesExample;
import com.teaching.bean.ClassesExample.Criteria;
import com.teaching.bean.Ctc;
import com.teaching.bean.CtcExample;
import com.teaching.bean.Teacher;
import com.teaching.bean.TeacherExample;
import com.teaching.dao.ClassesMapper;
import com.teaching.dao.CtcMapper;
import com.teaching.dao.TeacherMapper;
import com.teaching.utils.StaticValue;
import com.teaching.vo.CtcView;

@Service
public class ClassesServiceImpl implements ClassesService {

	@Autowired
	ClassesMapper classesMapper;
	@Autowired
	TeacherMapper teachMapper;
	@Autowired
	CtcMapper ctcMapper;

	@Override
	public List<Classes> getPage(int pageNO) {
		List<Classes> clist = classesMapper.getPage((pageNO - 1) * StaticValue.pageSize, StaticValue.pageSize);
		return clist;
	}

	@Override
	public PageInfo<Classes> getPage1(int pageNO) {
		// 分页
		PageHelper.startPage(pageNO, StaticValue.pageSize);
		List<Classes> clist = classesMapper.getPage1();
		PageInfo<Classes> info = new PageInfo<Classes>(clist);
		return info;
	}

	@Override
	public void save(Classes classes) {
		classesMapper.insertSelective(classes);
	}

	@Override
	public Classes getById(int cid) {
		Classes key = classesMapper.selectByPrimaryKey(cid);
		return key;
	}

	@Override
	public void update(Classes classes) {

		classesMapper.updateByPrimaryKeySelective(classes);
	}

	@Override
	public void del(int cid) {
		classesMapper.deleteByPrimaryKey(cid);
	}

	@Override
	public List<Classes> getClaListById(int majid) {
		ClassesExample ce = new ClassesExample();
		Criteria cc = ce.createCriteria();
		cc.andMajidEqualTo(majid);
		return classesMapper.selectByExample(ce);
	}

	@Override
	public List<Classes> getAllClasses() {
		classesMapper.selectByExample(new ClassesExample());
		return null;
	}

	@Override
	public List<Teacher> getTeacher(int timeid, int weekid, int claid) {
		// 查询本专业下的所有教师
		Classes classes = classesMapper.selectByPrimaryKey(claid);
		Integer majid = classes.getMajid();
		TeacherExample temp = new TeacherExample();
		com.teaching.bean.TeacherExample.Criteria tcc = temp.createCriteria();
		tcc.andMajidEqualTo(majid);
		List<Teacher> teachList = teachMapper.selectByExample(temp);
		// 查询本专业下已经排课的教师
		CtcExample ctcmp = new CtcExample();
		com.teaching.bean.CtcExample.Criteria ctc = ctcmp.createCriteria();
		ctc.andTimeidEqualTo(timeid);
		ctc.andWeekidEqualTo(weekid);
		ctc.andMajidEqualTo(majid);
		List<Ctc> ctcList = ctcMapper.selectByExample(ctcmp);

		// 获取没有排课的老师
		List<Teacher> findTeachList = new ArrayList<Teacher>();
		//判断Teacher集合是否为空，不为空则获取所有已经排课的老师,然后与排课表相比取得没有排课的教师
		if (teachList != null && teachList.size() > 0) {
			for(Teacher teacher : teachList){
				if(ctcList != null && ctcList.size() > 0) {
					for(int i = 0; i < ctcList.size(); i++) {
						Ctc ctc2 = ctcList.get(i);
						if (ctc2.getTid() == teacher.getId()) {

						} else {
							if (i == ctcList.size() - 1) {
								findTeachList.add(teacher);
							}
						}
					}
				}else {
					return teachList;
				}
				
			}
		}
		return findTeachList;
	}

	@Override
	public List<Ctc> savectc(List<Integer> cids, List<Integer> tids, List<Integer> types, int weekid, int claid) {
		//清除之前所选
		/*CtcExample ctcemp = new CtcExample();
		com.teaching.bean.CtcExample.Criteria criteria = ctcemp.createCriteria();
		criteria.andClaidEqualTo(claid);
		criteria.andWeekidEqualTo(weekid);
		ctcMapper.deleteByExample(ctcemp);*/
		
		Classes classes = classesMapper.selectByPrimaryKey(claid);
		Integer majid = classes.getMajid();
		List<Ctc> ctcList = new ArrayList<Ctc>();
		for (int i = 0; i < 4; i++) {
			if (cids.get(i) != 0 && tids.get(i) != 0) {
				Ctc ctc = new Ctc();
				ctc.setClaid(claid);
				ctc.setCouid(cids.get(i));
				ctc.setMajid(majid);
				ctc.setTid(tids.get(i));
				ctc.setTimeid(i+1);
				ctc.setType(types.get(i));
				ctc.setWeekid(weekid);
				ctcList.add(ctc);
			}

		}
		// 批量插入
		if(ctcList !=null && ctcList.size() > 0) {
			
			ctcMapper.savectc(ctcList);
		}else {
			
			return null;
		}
		return null;
	}

	@Override
	public List<CtcView> getpk(int cid) {
		
		return ctcMapper.getPk(cid);
	}

}
