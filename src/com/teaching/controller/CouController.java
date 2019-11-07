package com.teaching.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.teaching.bean.Course;
import com.teaching.bean.Teacher;
import com.teaching.service.CouService;
import com.teaching.utils.StaticValue;

@Controller
@RequestMapping("cou")
public class CouController {
	@Autowired
	CouService couService;
	@RequestMapping
	//分页
	public String cou(Model model, @RequestParam(defaultValue = "1") int pageNO) {
		PageInfo<Course> info = couService.getPage1(pageNO);
		model.addAttribute("clist", info.getList());
		model.addAttribute("count", info.getTotal());
		model.addAttribute("size", StaticValue.pageSize);
		model.addAttribute("pageNO", pageNO);
		return "course/cou-list";
	}
	//添加和编辑
	@RequestMapping("showadd")
	public String showadd(Model model, @RequestParam(defaultValue = "0") int cid) {

		if (cid == 0) {
			// 添加
			model.addAttribute("course", new Course());
		} else {
			model.addAttribute("course", couService.getById(cid));
		}
		return "course/cou-add";
	}
	//保存添加和编辑的数据
	@RequestMapping("save")
	public String save(Model model, @ModelAttribute @Validated Course course, BindingResult br) {
		if (br.hasErrors()) {
			return "course/cou-add";
		} else {
			if (course.getId() != null && !course.getId().equals("")) {
				// 编辑
				couService.update(course);
			} else {
				// 添加
				couService.save(course);
			}
			return "redirect:/cou";
		}

	}

	// 删除
	@RequestMapping("del")
	public String del(int cid) {
		couService.del(cid);
		return "redirect:/cou";
	}

	// 批量删除
	@RequestMapping("datadel")
	public String datadel(@RequestParam(name = "id") List<Integer> ids) {
		for (Integer cid : ids) {
			couService.del(cid);
		}
		return "redirect:/cou";
	}
}
