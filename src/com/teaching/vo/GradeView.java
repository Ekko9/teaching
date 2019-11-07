package com.teaching.vo;

import com.teaching.bean.Grade;

public class GradeView extends Grade{

	private Integer coutype;
	private String couname;
	private String teaname;
	
	public Integer getCoutype() {
		return coutype;
	}
	public void setCoutype(Integer coutype) {
		this.coutype = coutype;
	}
	public String getCouname() {
		return couname;
	}
	public void setCouname(String couname) {
		this.couname = couname;
	}
	public String getTeaname() {
		return teaname;
	}
	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}
	
	
}
