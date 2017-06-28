package com.check.auth.g3.core.checkauth.entity;

public class UserAdviceEntity {
	private int id;//id
	private String name;//姓名
	private String mobilePhone;//手机号
	private String content;//用户建议
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "UserAdviceEntity [id=" + id + ", name=" + name + ", mobilePhone=" + mobilePhone + ", content=" + content
				+ "]";
	}
	
	
}
