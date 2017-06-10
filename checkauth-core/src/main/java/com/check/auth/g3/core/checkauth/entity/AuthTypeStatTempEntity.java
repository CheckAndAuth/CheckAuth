package com.check.auth.g3.core.checkauth.entity;
/**
 * @desc 认证类别及认证领域统计实体,用于返回结果
 * @author 
 *
 */
public class AuthTypeStatTempEntity {
	private String typeName;//认证类别
	private int effCerNum;//有效证书数量
	private int authPerNum;//认证人员数量
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getEffCerNum() {
		return effCerNum;
	}
	public void setEffCerNum(int effCerNum) {
		this.effCerNum = effCerNum;
	}
	public int getAuthPerNum() {
		return authPerNum;
	}
	public void setAuthPerNum(int authPerNum) {
		this.authPerNum = authPerNum;
	}
	@Override
	public String toString() {
		return "AuthTypeStatTempEntity [typeName=" + typeName + ", effCerNum=" + effCerNum + ", authPerNum="
				+ authPerNum + "]";
	}
	
	
}
