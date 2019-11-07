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
import com.teaching.bean.Classes;
import com.teaching.bean.Major;
import com.teaching.service.MajService;
import com.teaching.utils.StaticValue;

@Controller
@RequestMapping("maj")
public class MajController {
	@Autowired
	MajService majService;
	@RequestMapping
	//分页
	public String maj(Model model,@RequestParam(defaultValue = "1") int pageNO) {
		PageInfo<Major> info = majService.getPage1(pageNO);
		model.addAttribute("mlist", info.getList());
		model.addAttribute("count", info.getTotal()); // 7);
		model.addAttribute("size", StaticValue.pageSize);
		model.addAttribute("pageNO", pageNO);
		return "class/maj-list";
	}
	//单个删除
	@RequestMapping("mutidel1")
	public String mutidel1(int mid) {
		majService.del(mid);
		return "redirect:/maj";
	}
	//批量删除
	@RequestMapping("mutidel")
	public String mutidel(@RequestParam(name="id") List<Integer> ids) {
		for (Integer mid : ids) {
			majService.del(mid);
		}
		return "redirect:/maj";
	}
	//添加和编辑
	@RequestMapping("showadd")
	public String showadd(Model model, @RequestParam(defaultValue = "0") int mid) {
		if (mid == 0) {
			// 添加
			model.addAttribute("major", new Major());
		} else {
			model.addAttribute("major", majService.getById(mid));
		}
		List<Major> mlist = majService.getAll();
		model.addAttribute("mlist", mlist);
		return "class/maj-add";
	}
	//保存添加和编辑的数据
	@RequestMapping("save")
	public String save(Model model, @ModelAttribute @Validated Major major, BindingResult br) {
		if (br.hasErrors()) {
			return "class/maj-add";
		} else {
			if (major.getId() != null && !major.getId().equals("")) {
				//编辑
				majService.update(major);
			}else {
				//添加
				majService.save(major);
			}
			return "redirect:/maj";
		}
	}
}
