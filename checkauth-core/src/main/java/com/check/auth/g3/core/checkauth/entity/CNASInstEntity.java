package com.check.auth.g3.core.checkauth.entity;

public class CNASInstEntity {
	private int id;//id
	private String instName;//单位名称
	private String field;//所属领域
	private String validityDate;//有效期
	private String ratifyDate;//批准日期
	private String firstAwardDate;//首次颁发日期
	private String principal;//责任人
	private String contact;//联系人
	private String status;//状态
	private String isMLA;//是否签署MLA许可协议
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}
	public String getRatifyDate() {
		return ratifyDate;
	}
	public void setRatifyDate(String ratifyDate) {
		this.ratifyDate = ratifyDate;
	}
	public String getFirstAwardDate() {
		return firstAwardDate;
	}
	public void setFirstAwardDate(String firstAwardDate) {
		this.firstAwardDate = firstAwardDate;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIsMLA() {
		return isMLA;
	}
	public void setIsMLA(String isMLA) {
		this.isMLA = isMLA;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	@Override
	public String toString() {
		return "CNASInstEntity [id=" + id + ", instName=" + instName + ", field=" + field + ", validityDate="
				+ validityDate + ", ratifyDate=" + ratifyDate + ", firstAwardDate=" + firstAwardDate + ", principal="
				+ principal + ", contact=" + contact + ", status=" + status + ", isMLA=" + isMLA + "]";
	}
	
	
}
