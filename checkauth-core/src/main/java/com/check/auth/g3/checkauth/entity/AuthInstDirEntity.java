package com.check.auth.g3.checkauth.entity;

public class AuthInstDirEntity {
//id,instType,instTypeOrder,ratifyDateOrder,mainInstId,instCode,instName,instStatus,address,districtCode,principal,ratifyDate,validityDate,contactPeroson,tel,cccBm,cccName
	private int id;
	private String instType;
	private String instTypeOrder;
	private String ratifyDateOrder;
	private int mainInstId;
	private String instCode;
	private String instName;
	private String instStatus;
	private String address;
	private String districtCode;
	private String districtCodeName;
	private String principal;
	private String ratifyDate;
	private String validityDate;
	private String contactPeroson;
	private String tel;
	private String cccBm;
	private String cccName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstType() {
		return instType;
	}
	public void setInstType(String instType) {
		this.instType = instType;
	}
	public String getInstTypeOrder() {
		return instTypeOrder;
	}
	public void setInstTypeOrder(String instTypeOrder) {
		this.instTypeOrder = instTypeOrder;
	}
	public String getRatifyDateOrder() {
		return ratifyDateOrder;
	}
	public void setRatifyDateOrder(String ratifyDateOrder) {
		this.ratifyDateOrder = ratifyDateOrder;
	}
	public int getMainInstId() {
		return mainInstId;
	}
	public void setMainInstId(int mainInstId) {
		this.mainInstId = mainInstId;
	}
	public String getInstCode() {
		return instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstStatus() {
		return instStatus;
	}
	public void setInstStatus(String instStatus) {
		this.instStatus = instStatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCodeName() {
		return districtCodeName;
	}
	public void setDistrictCodeName(String districtCodeName) {
		this.districtCodeName = districtCodeName;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getRatifyDate() {
		return ratifyDate;
	}
	public void setRatifyDate(String ratifyDate) {
		this.ratifyDate = ratifyDate;
	}
	public String getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}
	public String getContactPeroson() {
		return contactPeroson;
	}
	public void setContactPeroson(String contactPeroson) {
		this.contactPeroson = contactPeroson;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCccBm() {
		return cccBm;
	}
	public void setCccBm(String cccBm) {
		this.cccBm = cccBm;
	}
	public String getCccName() {
		return cccName;
	}
	public void setCccName(String cccName) {
		this.cccName = cccName;
	}
	@Override
	public String toString() {
		return "AuthInstDirEntity [id=" + id + ", instType=" + instType + ", instTypeOrder=" + instTypeOrder
				+ ", ratifyDateOrder=" + ratifyDateOrder + ", mainInstId=" + mainInstId + ", instCode=" + instCode
				+ ", instName=" + instName + ", instStatus=" + instStatus + ", address=" + address + ", districtCode="
				+ districtCode + ", districtCodeName=" + districtCodeName + ", principal=" + principal + ", ratifyDate="
				+ ratifyDate + ", validityDate=" + validityDate + ", contactPeroson=" + contactPeroson + ", tel=" + tel
				+ ", cccBm=" + cccBm + ", cccName=" + cccName + "]";
	}
	
}
