package com.lt.entity;

public class Address {
    private Integer id;

    private Integer userId;

    private Integer provinceId;

    private String provinceName;

    private Integer cityId;

    private String cityName;

    private Integer areaId;

    private String areaName;

    public Address() {
		super();
	}

	public Address(Integer userId, Integer provinceId, String provinceName, Integer cityId, String cityName,
			Integer areaId, String areaName) {
		super();
		this.userId = userId;
		this.provinceId = provinceId;
		this.provinceName = provinceName;
		this.cityId = cityId;
		this.cityName = cityName;
		this.areaId = areaId;
		this.areaName = areaName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

	@Override
	public String toString() {
		return "Address [id=" + id + ", userId=" + userId + ", provinceId=" + provinceId + ", provinceName="
				+ provinceName + ", cityId=" + cityId + ", cityName=" + cityName + ", areaId=" + areaId + ", areaName="
				+ areaName + "]";
	}
    
}