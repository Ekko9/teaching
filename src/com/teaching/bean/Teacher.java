package com.teaching.bean;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class Teacher {
    private Integer id;
    private String name;
	
    private Integer usertype;
    @NotBlank(message="用户名不能为空")
    private String loginname;
    @NotBlank(message="密码不能为空")

    private String password;
    @Length(min=3,max=8,message="长度为6位数字")
    private String workid;

    private Integer majid;

    private Integer pre1;

    private String pre2;

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

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
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
}