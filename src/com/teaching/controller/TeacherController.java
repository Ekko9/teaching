package com.teaching.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

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
import com.teaching.bean.Grade;
import com.teaching.bean.Major;
import com.teaching.bean.Teacher;
import com.teaching.service.MajService;
import com.teaching.service.TeacherService;
import com.teaching.utils.StaticValue;
import com.teaching.vo.CtcView;
import com.teaching.vo.StuScore;

@Controller
@RequestMapping("tea")
public class TeacherController {
	@Autowired
	TeacherService teaService;
	@Autowired
	MajService majorService;

	@RequestMapping("getInfo")
	public String getInfo() {

		return "teacher/couOftea/main";
	}

	@RequestMapping("togetCou")
	public String togetCou() {
		return "teacher/couOftea/kb";
	}

	@RequestMapping("teakbList")
	@ResponseBody
	public List<CtcView> teakbList(HttpSession session) {
		Teacher tea = (Teacher) session.getAttribute("teach");
		List<CtcView> kblist = teaService.getkb(tea.getId());
		return kblist;
	}

	@RequestMapping("mystu")
	public String mystu(Model model, HttpSession session, @RequestParam(defaultValue = "0") int claid,
			@RequestParam(defaultValue = "0") int type) {
		Teacher tea = (Teacher) session.getAttribute("teach");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tid", tea.getId());
		map.put("claid", claid);
		map.put("type", type);
		List<StuScore> myStuList = teaService.getMyStu(map);
		List<Grade> glist = teaService.getAll();
		for (StuScore slist : myStuList) {
			for (Grade g : glist) {
				if (g.getCid() == slist.getCid() && g.getSid() == slist.getId()) {
					slist.setScore(g.getZgrade());
					slist.setStatis(1);
				}
			}
		}

		model.addAttribute("myStuList", myStuList);
		model.addAttribute("type", type);
		model.addAttribute("claid", claid);
		model.addAttribute("clist", teaService.getClass(tea.getId()));
		return "teacher/couOftea/stulist";
	}

	@RequestMapping("setGrade/{cid}/{sid}")
	public String setGrade(Model model, @PathVariable int cid, @PathVariable int sid, HttpSession session) {
		Teacher tea = (Teacher) session.getAttribute("teach");
		Grade g = new Grade();
		g.setCid(cid);
		g.setSid(sid);
		g.setTid(tea.getId());
		model.addAttribute("grade", g);
		return "teacher/couOftea/setgrade";
	}

	@RequestMapping("saveGrade")
	public String saveGrade(Grade g) {
		teaService.insertGrade(g);
		return "redirect:/tea/mystu";
	}

	@RequestMapping
	public String tea(Model model, @RequestParam(defaultValue = "1") int pageNO) {

		PageInfo<Teacher> info = teaService.getPage1(pageNO);
		model.addAttribute("tlist", info.getList());
		model.addAttribute("count", info.getTotal());
		model.addAttribute("size", StaticValue.pageSize);
		model.addAttribute("pageNO", pageNO);
		return "teacher/tea-list";
	}

	@RequestMapping("showadd")
	public String showadd(Model model, @RequestParam(defaultValue = "0") int tid) {

		if (tid == 0) {
			// 添加
			model.addAttribute("teacher", new Teacher());
		} else {
			model.addAttribute("teacher", teaService.getById(tid));
		}
		return "teacher/tea-add";
	}

	@RequestMapping("getMajList")
	@ResponseBody
	public List<Major> getMajList() {
		List<Major> mlist = majorService.getMlist();
		return mlist;
	}

	@RequestMapping("save")
	public String save(Model model, @ModelAttribute @Validated Teacher teach, BindingResult br) {
		if (br.hasErrors()) {
			return "teacher/tea-add";
		} else {
			if (teach.getId() != null && !teach.getId().equals("")) {
				// 编辑
				teaService.update(teach);
			} else {
				// 添加
				teaService.save(teach);
			}
			return "redirect:/tea";
		}

	}

	// 删除
	@RequestMapping("del")
	public String del(int tid) {
		teaService.del(tid);
		return "redirect:/tea";
	}

	// 批量删除
	@RequestMapping("datadel")
	public String datadel(@RequestParam(name = "id") List<Integer> ids) {
		for (Integer tid : ids) {
			teaService.del(tid);
		}
		return "redirect:/tea";
	}

}
