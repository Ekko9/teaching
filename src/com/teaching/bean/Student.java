package com.teaching.bean;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Student {
	private Integer id;
	@NotBlank(message = "不能为空")
	private String name;

	private String sex;
	@NotBlank(message = "地址不能为空")
	private String address;
	@Pattern(regexp = "^1[3|4|5|7|8][0-9]\\d{8}$", message = "格式错误")
	private String tel;
	@Min(value = 1, message = "请选择班级！")
	private Integer classid;

	private Integer usertype;
	@NotBlank(message = "密码不能为空")
	private String password;
	@NotBlank(message = "用户名不能为空")
	private String loginname;

	private String files;

	private Integer majid;

	private Integer pre1;

	private String pre2;

	private Date pre3;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public Integer getClassid() {
		return classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public Integer getUsertype() {
		return usertype;
	}

	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname == null ? null : loginname.trim();
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files == null ? null : files.trim();
	}

	public Integer getMajid() {
		return majid;
	}

	public void setMajid(Integer majid) {
		this.majid = majid;
	}

	public Integer getPre1() {
		return pre1;
	}

	public void setPre1(Integer pre1) {
		this.pre1 = pre1;
	}

	public String getPre2() {
		return pre2;
	}

	public void setPre2(String pre2) {
		this.pre2 = pre2 == null ? null : pre2.trim();
	}

	public Date getPre3() {
		return pre3;
	}

	public void setPre3(Date pre3) {
		this.pre3 = pre3;
	}

}