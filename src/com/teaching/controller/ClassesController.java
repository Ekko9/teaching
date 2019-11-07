package com.teaching.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.teaching.bean.Classes;
import com.teaching.bean.Course;
import com.teaching.bean.Major;
import com.teaching.bean.Teacher;
import com.teaching.service.ClassesService;
import com.teaching.service.CouService;
import com.teaching.service.MajService;
import com.teaching.utils.StaticValue;
import com.teaching.vo.CtcView;

@Controller
@RequestMapping("cla")
public class ClassesController {

	@Autowired
	ClassesService claService;
	@Autowired
	MajService majService;
	@Autowired
	CouService couService;
	@RequestMapping
	//分页
	public String cla(Model model, @RequestParam(defaultValue = "1") int pageNO) {
		// List<Classes> clist = claService.getPage(pageNO);
		PageInfo<Classes> info = claService.getPage1(pageNO);
		model.addAttribute("clist", info.getList());// clist);
		model.addAttribute("count", info.getTotal()); // 7);
		model.addAttribute("size", StaticValue.pageSize);
		model.addAttribute("pageNO", pageNO);
		return "class/cla-list";
	}
	//添加和编辑
	@RequestMapping("showadd")
	public String showadd(Model model, @RequestParam(defaultValue = "0") int cid) {
		if (cid == 0) {
			// 添加
			model.addAttribute("classes", new Classes());
		} else {
			//编辑
			model.addAttribute("classes", claService.getById(cid));
		}
		List<Major> mlist = majService.getAll();
		model.addAttribute("mlist", mlist);
		return "class/cla-add";
	}
	//保存
	@RequestMapping("save")
	public String save(Model model, @ModelAttribute @Validated Classes classes, BindingResult br) {
		if (br.hasErrors()) {
			List<Major> mlist = majService.getAll();
			model.addAttribute("mlist", mlist);
			return "class/cla-add";
		} else {
			if (classes.getId() != null && !classes.getId().equals("")) {
				//编辑
				claService.update(classes);
			}else {
				//添加
				claService.save(classes);
			}
			return "redirect:/cla";
		}
	}
	//单个删除
	@RequestMapping("mutidel1")
	public String mutidel1(int cid) {
		claService.del(cid);
		return "redirect:/cla";
	}
	//批量删除
	@RequestMapping("mutidel")
	public String mutidel(@RequestParam(name="id") List<Integer> ids) {
		for (Integer cid : ids) {
			claService.del(cid);
		}
		return "redirect:/cla";
	}
	//排课
	@RequestMapping("paike")
	public String paike(Model model,int claid) {
		List<Course> coulist = couService.getAllCourse();
		model.addAttribute("coulist", coulist);
		model.addAttribute("claid", claid);
		List<CtcView> pklist = claService.getpk(claid);//获取所有的排课
		List<CtcView> kblist1 = new ArrayList<CtcView>();
		List<CtcView> kblist2 = new ArrayList<CtcView>();
		List<CtcView> kblist3 = new ArrayList<CtcView>();
		List<CtcView> kblist4 = new ArrayList<CtcView>();
		List<CtcView> kblist5 = new ArrayList<CtcView>();
		for (CtcView ctclist: pklist) {
			if(ctclist.getWeekid()==1) {
				kblist1.add(ctclist);
			}
			if(ctclist.getWeekid()==2) {
				kblist2.add(ctclist);
			}
			if(ctclist.getWeekid()==3) {
				kblist3.add(ctclist);
			}
			if(ctclist.getWeekid()==4) {
				kblist4.add(ctclist);
			}
			if(ctclist.getWeekid()==5) {
				kblist5.add(ctclist);
			}
		}
		model.addAttribute("kblist1", kblist1);
		model.addAttribute("kblist2", kblist2);
		model.addAttribute("kblist3", kblist3);
		model.addAttribute("kblist4", kblist4);
		model.addAttribute("kblist5", kblist5);
		return "class/paike";
	}
	@RequestMapping("getTeas")
	@ResponseBody
	public List<Teacher> getTeas(int timeid,int weekid,int claid){
		List<Teacher> tlist = claService.getTeacher(timeid, weekid, claid);
		return tlist;
	}
	@RequestMapping("savectc")
	public String savectc(@RequestParam List<Integer> cids,@RequestParam List<Integer> types,@RequestParam List<Integer> tids,int weekid,int claid,int flag) {
		claService.savectc(cids, tids, types, weekid, claid);
		if(flag == 0) {
			//继续排课
			return "redirect:/cla/paike?claid="+claid;
		}else {
			
			return "redirect:/cla";
		}
	}
	
	
}
