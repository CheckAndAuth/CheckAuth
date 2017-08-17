package com.check.auth.g3.core.checkauth.entity;
/**
 * 地域对应实体信息
 * @author 
 *
 */
public class RegionEntity {
	private int regionId;//地区id
	private String regionCode;//地区代码
	private String regionName;//地区名称
	private int parentId;//父Id
	private int regionLevel;//地区级别
	private int regionOrder;//
	private String regionNameEn;//地区英文名
	private String regionShortNameEn;//地区英文名缩写
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getRegionLevel() {
		return regionLevel;
	}
	public void setRegionLevel(int regionLevel) {
		this.regionLevel = regionLevel;
	}
	public int getRegionOrder() {
		return regionOrder;
	}
	public void setRegionOrder(int regionOrder) {
		this.regionOrder = regionOrder;
	}
	public String getRegionNameEn() {
		return regionNameEn;
	}
	public void setRegionNameEn(String regionNameEn) {
		this.regionNameEn = regionNameEn;
	}
	public String getRegionShortNameEn() {
		return regionShortNameEn;
	}
	public void setRegionShortNameEn(String regionShortNameEn) {
		this.regionShortNameEn = regionShortNameEn;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	@Override
	public String toString() {
		return "RegionEntity [regionId=" + regionId + ", regionCode=" + regionCode + ", regionName=" + regionName
				+ ", parentId=" + parentId + ", regionLevel=" + regionLevel + ", regionOrder=" + regionOrder
				+ ", regionNameEn=" + regionNameEn + ", regionShortNameEn=" + regionShortNameEn + "]";
	}
	
}
