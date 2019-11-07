package com.teaching.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class Major {
	
    private Integer id;

    private String code;
    @NotEmpty(message="不能为空")
    private String name;

    private String remark;

    private Integer pre1;

    private String pre2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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