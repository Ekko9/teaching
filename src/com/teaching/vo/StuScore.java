package com.teaching.vo;

import com.teaching.bean.Student;

public class StuScore extends Student{

	private String couname;
	private int cid;
	private double score;
	private int statis;
	
	public int getStatis() {
		return statis;
	}
	public void setStatis(int statis) {
		this.statis = statis;
	}
	public String getCouname() {
		return couname;
	}
	public void setCouname(String couname) {
		this.couname = couname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
