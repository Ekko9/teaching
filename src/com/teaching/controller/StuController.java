package com.teaching.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.pagehelper.PageInfo;
import com.teaching.bean.Classes;
import com.teaching.bean.Grade;
import com.teaching.bean.Major;
import com.teaching.bean.Sc;
import com.teaching.bean.Student;
import com.teaching.service.ClassesService;
import com.teaching.service.MajService;
import com.teaching.service.StuService;
import com.teaching.utils.StaticValue;
import com.teaching.vo.CtcView;
import com.teaching.vo.GradeView;
import com.teaching.vo.StuExt;

@Controller
@RequestMapping("stu")
public class StuController {
	@Autowired
	StuService stuService;
	@Autowired
	MajService majorService;
	@Autowired
	ClassesService claService;
	//设置分页
	@RequestMapping
	public String stu(Student stu, Model model, @RequestParam(defaultValue = "1") int pageNO) {
		// model.addAttribute("mlist", majorService.getMlist());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", stu.getName());
		map.put("majid", stu.getMajid());
		map.put("claid", stu.getClassid());
		PageInfo<StuExt> info = stuService.getByPageNo(pageNO, map);
		model.addAttribute("slist", info.getList());
		model.addAttribute("count", info.getTotal());
		model.addAttribute("pageNO", pageNO);
		model.addAttribute("size", StaticValue.pageSize);
		model.addAttribute("stu", stu);
		if (stu.getMajid() == null) {
			stu.setMajid(0);
		}
		if (stu.getClassid() == null) {
			stu.setClassid(0);
		}
		return "stu/stu-list";
	}
	
	@RequestMapping("getMajList")
	@ResponseBody
	public List<Major> getMajList() {
		List<Major> mlist = majorService.getMlist();
		return mlist;
	}

	@RequestMapping("getClaListById")
	@ResponseBody
	public List<Classes> getClaListById(int majid) {
		List<Classes> clist = claService.getClaListById(majid);
		return clist;
	}

	@RequestMapping("showadd")
	public String showadd(Model model, @RequestParam(defaultValue = "0") int sid) {
		if (sid == 0) {
			// 添加
			model.addAttribute("student", new Student());
		} else {
			// 编辑
			model.addAttribute("student", stuService.getById(sid));
		}
		return "stu/stu-add";
	}

	@RequestMapping("save")
	// 上传头像
	public String save(Model model, HttpServletRequest req, MultipartFile mytx, @ModelAttribute @Validated Student stu,
			BindingResult br) {
		// 获得上传路径
		String path = req.getServletContext().getRealPath("files");
		File file = new File(path, mytx.getOriginalFilename());
		try {
			mytx.transferTo(file);
			if (br.hasErrors()) {
				return "stu/stu-add";
			} else {
				Integer sid = stu.getId();
				if (sid != null && !sid.equals("")) {
					// 编辑
					stu.setFiles("files/" + mytx.getOriginalFilename());
					stuService.update(stu);
				} else {
					// 添加
					stu.setFiles("files/" + mytx.getOriginalFilename());
					stuService.save(stu);
				}
				return "redirect:/stu";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			model.addAttribute("msg", "上传失败");
			return "stu/stu-add";
		}
	}

	// 删除
	@RequestMapping("del")
	public String del(int sid) {
		stuService.del(sid);
		return "redirect:/stu";
	}

	// 批量删除
	@RequestMapping("datadel")
	public String datadel(@RequestParam(name = "id") List<Integer> ids) {
		for (Integer sid : ids) {
			stuService.del(sid);
		}
		return "redirect:/stu";
	}

	@RequestMapping("getInfo")
	public String getInfo() {
		return "stu/person/main";
	}

	@RequestMapping("selectCourse1")
	public String selectCourse1(HttpSession session, Model model) {
		Student stu = (Student) session.getAttribute("stu");
		List<CtcView> ctclist = stuService.getXx(stu.getClassid());
		model.addAttribute("ctclist", ctclist);
		return "stu/person/selectcourse";
	}

	@RequestMapping("saveCourse")
	public String saveCourse(HttpSession session, @RequestParam List<String> ids, RedirectAttributes rs) {
		List<Sc> sclist = new ArrayList<Sc>();
		Student stu = (Student) session.getAttribute("stu");
		for (String tidcid : ids) {
			String[] tcid = tidcid.split("_");
			Sc sc = new Sc();
			sc.setCid(Integer.parseInt(tcid[1]));
			sc.setTid(Integer.parseInt(tcid[0]));
			sc.setSid(stu.getId());
			sclist.add(sc);
		}
		try {
			int row = stuService.saveSc(sclist);
			if (row > 0) {
				rs.addFlashAttribute("msg", "保存成功");
			} else {
				rs.addFlashAttribute("msg", "保存失败");
			}
		} catch (Exception e) {
			rs.addFlashAttribute("msg", "选课冲突");
		}
		return "redirect:/stu/selectCourse1";
	}
	
	@RequestMapping("getkb")
	public String getkb() {
		
		return "stu/person/kb";
	}
	//查看课表
	@RequestMapping("getkbList")
	@ResponseBody
	public List<CtcView> getkbList(HttpSession session){
		Student stu = (Student) session.getAttribute("stu");
		List<CtcView> kblist = stuService.getkb(stu);
		return kblist;
	}
	//查看成绩
	@RequestMapping("selectGrade")
	public String selectGrade(Model model,HttpSession session) {
	//从session中获取Student对象
	Student stu = (Student) session.getAttribute("stu");
	//获得学生ID
	List<GradeView> glist = stuService.getGrade(stu.getId());
	model.addAttribute("glist", glist);
		return "stu/person/grade";
	}
}
