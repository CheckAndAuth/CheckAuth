package com.check.auth.g3.core.checkauth.entity;
/**
 * @desc 认证类别及认证领域实体,用于返回结果
 * @author 
 *
 */
public class AuthTypeAreaTempEntity {
	private String typeCode;//认证类别
	private String typeName;
	private String authAreaCode;//认证领域
	private String authAreaName;
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getAuthAreaCode() {
		return authAreaCode;
	}
	public void setAuthAreaCode(String authAreaCode) {
		this.authAreaCode = authAreaCode;
	}
	public String getAuthAreaName() {
		return authAreaName;
	}
	public void setAuthAreaName(String authAreaName) {
		this.authAreaName = authAreaName;
	}
	@Override
	public String toString() {
		return "AuthTypeAreaTempEntity [typeCode=" + typeCode + ", typeName=" + typeName + ", authAreaCode="
				+ authAreaCode + ", authAreaName=" + authAreaName + "]";
	}
	
	
}
