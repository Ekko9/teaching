package com.teaching.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class Classes {
    private Integer id;
    @NotEmpty(message="不能为空")
    private String name;

    private String type;

    private Integer status;
    
    private Integer majid;

    private Integer pre1;

    private String pre2;
    
   private Major maj;
    
    public Major getMaj() {
		return maj;
	}

	public void setMaj(Major maj) {
		this.maj = maj;
	}

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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