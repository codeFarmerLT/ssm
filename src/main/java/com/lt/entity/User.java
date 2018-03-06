package com.lt.entity;

import java.util.Date;
import java.util.List;

public class User {
    private Integer id;

    private String userName;

    private String sex;
    
    private List<Address> addressList;
    
    public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	private Date createTime;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", sex=" + sex + ", addressList=" + addressList
				+ ", createTime=" + createTime + "]";
	}
    
}