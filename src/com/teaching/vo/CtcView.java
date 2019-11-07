package com.teaching.vo;

import com.teaching.bean.Course;
import com.teaching.bean.Ctc;
import com.teaching.bean.Student;
import com.teaching.bean.Teacher;

public class CtcView extends Ctc{

	private String tename;
	private String couname;
	private String typestr;
	private String claname;
	
	public String getClaname() {
		return claname;
	}
	public void setClaname(String claname) {
		this.claname = claname;
	}
	public String getTypestr() {
		return typestr;
	}
	public void setTypestr(String typestr) {
		this.typestr = typestr;
	}
	public String getTename() {
		return tename;
	}
	public void setTename(String tename) {
		this.tename = tename;
	}
	public String getCouname() {
		return couname;
	}
	public void setCouname(String couname) {
		this.couname = couname;
	}
	
}
