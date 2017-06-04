package com.check.auth.g3.core.checkauth.entity;

public class AuthInstEntity {
	private int id;//id
	private String instType;//机构类型
	private String instTypeOrder;//机构类型顺序
	private String ratifyDateOrder;//批准成立日期
	private int mainInstId;//主机构id
	private String instCode;//机构批准号
	private String instName;//机构名称
	private String instStatus;//机构状态
	private String address;//地址
	private String districtCode;//区号
	private String districtCodeName;//所在地区
	private String principal;//法人
	private String ratifyDate;//批准成立日期
	private String validityDate;//有效截止日期
	private String contactPerson;//联系人
	private String tel;//联系电话
	private String cccBm;//cccBm
	private String cccName;//3C名称
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
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
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
		return "AuthInstEntity [id=" + id + ", instType=" + instType + ", instTypeOrder=" + instTypeOrder
				+ ", ratifyDateOrder=" + ratifyDateOrder + ", mainInstId=" + mainInstId + ", instCode=" + instCode
				+ ", instName=" + instName + ", instStatus=" + instStatus + ", address=" + address + ", districtCode="
				+ districtCode + ", districtCodeName=" + districtCodeName + ", principal=" + principal + ", ratifyDate="
				+ ratifyDate + ", validityDate=" + validityDate + ", contactPeroson=" + contactPerson + ", tel=" + tel
				+ ", cccBm=" + cccBm + ", cccName=" + cccName + "]";
	}
	
}
