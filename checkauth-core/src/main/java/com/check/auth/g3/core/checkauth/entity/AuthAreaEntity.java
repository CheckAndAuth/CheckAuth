package com.check.auth.g3.core.checkauth.entity;
/**
 * @desc 认证类别及认证领域实体,用于返回结果
 * @author 
 *
 */
public class AuthAreaEntity {

    private  long id;
    private String authTypeCode;//认证类别
    private String authTypeName;
	private String authAreaCode;//认证领域
	private String authAreaName;

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

    public String getAuthTypeCode() {
        return authTypeCode;
    }

    public void setAuthTypeCode(String authTypeCode) {
        this.authTypeCode = authTypeCode;
    }

    public String getAuthTypeName() {
        return authTypeName;
    }

    public void setAuthTypeName(String authTypeName) {
        this.authTypeName = authTypeName;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
	@Override
	public String toString() {
		return "AuthTypeAreaTempEntity [typeCode=" + authTypeCode + ", typeName=" + authTypeName + ", authAreaCode="
				+ authAreaCode + ", authAreaName=" + authAreaName + "]";
	}
	
	
}
