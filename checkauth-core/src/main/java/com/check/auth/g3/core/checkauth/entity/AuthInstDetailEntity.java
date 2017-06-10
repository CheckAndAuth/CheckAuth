package com.check.auth.g3.core.checkauth.entity;

public class AuthInstDetailEntity extends AuthInstEntity {
	private String busiScope;//认证类别代码
	private String busiScopeName;//认证类别及认证领域
	private String businessNumber;//业务代码
	private String cccBusinessScope;//CCC指定业务范围
	private String oldInstCode;//原机构批准号
	private String exchangeDate;//换发日期, eg.2016-09-24
	private String fax;//传真
	private String email;//email
	private String post;//邮编
	private String principalRegNum;//法人注册号
	private String principalTypeName;//法人类型, eg.事业单位
	private String recordScope;//登记范围
	private String recordTs;//登记日期,eg.2017-03-09 16:38:05',
	private String regCapital;//eg. 18000
	private String regCapitalType;//01
	private String website;//网址, eg.www.cqc.com.cn
	private String isCCInst;//是否为3C认证机构,0代表否,1代表是
	private String zdjgBm;//eg.01
	private String zdjgName;//中国质量认证中心
	private String cnasRec;//CNAS认可
	private String outsideRec;//境外认可
	private String highnewTecRec;//高新技术认可
	private String orgCode;//统一社会信用代码/组织机构代码
	private String entHode;//企业控股
	
	public String getIsCCInst() {
		return isCCInst;
	}
	public void setIsCCInst(String isCCInst) {
		this.isCCInst = isCCInst;
	}
	public String getEntHode() {
		return entHode;
	}
	public void setEntHode(String entHode) {
		this.entHode = entHode;
	}
	public String getBusiScope() {
		return busiScope;
	}
	public void setBusiScope(String busiScope) {
		this.busiScope = busiScope;
	}
	public String getBusiScopeName() {
		return busiScopeName;
	}
	public void setBusiScopeName(String busiScopeName) {
		this.busiScopeName = busiScopeName;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public String getCccBusinessScope() {
		return cccBusinessScope;
	}
	public void setCccBusinessScope(String cccBusinessScope) {
		this.cccBusinessScope = cccBusinessScope;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExchangeDate() {
		return exchangeDate;
	}
	public void setExchangeDate(String exchangeDate) {
		this.exchangeDate = exchangeDate;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getOldInstCode() {
		return oldInstCode;
	}
	public void setOldInstCode(String oldInstCode) {
		this.oldInstCode = oldInstCode;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getPrincipalRegNum() {
		return principalRegNum;
	}
	public void setPrincipalRegNum(String principalRegNum) {
		this.principalRegNum = principalRegNum;
	}
	public String getPrincipalTypeName() {
		return principalTypeName;
	}
	public void setPrincipalTypeName(String principalTypeName) {
		this.principalTypeName = principalTypeName;
	}
	public String getRecordScope() {
		return recordScope;
	}
	public void setRecordScope(String recordScope) {
		this.recordScope = recordScope;
	}
	public String getRecordTs() {
		return recordTs;
	}
	public void setRecordTs(String recordTs) {
		this.recordTs = recordTs;
	}
	public String getRegCapital() {
		return regCapital;
	}
	public void setRegCapital(String regCapital) {
		this.regCapital = regCapital;
	}
	public String getRegCapitalType() {
		return regCapitalType;
	}
	public void setRegCapitalType(String regCapitalType) {
		this.regCapitalType = regCapitalType;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getZdjgBm() {
		return zdjgBm;
	}
	public void setZdjgBm(String zdjgBm) {
		this.zdjgBm = zdjgBm;
	}
	public String getZdjgName() {
		return zdjgName;
	}
	public void setZdjgName(String zdjgName) {
		this.zdjgName = zdjgName;
	}
	
	public String getCnasRec() {
		return cnasRec;
	}
	public void setCnasRec(String cnasRec) {
		this.cnasRec = cnasRec;
	}
	public String getOutsideRec() {
		return outsideRec;
	}
	public void setOutsideRec(String outsideRec) {
		this.outsideRec = outsideRec;
	}
	public String getHighnewTecRec() {
		return highnewTecRec;
	}
	public void setHighnewTecRec(String highnewTecRec) {
		this.highnewTecRec = highnewTecRec;
	}
	@Override
	public String toString() {
		return "AuthInstDetailEntity [busiScope=" + busiScope + ", busiScopeName=" + busiScopeName + ", businessNumber="
				+ businessNumber + ", cccBusinessScope=" + cccBusinessScope + ", oldInstCode=" + oldInstCode
				+ ", exchangeDate=" + exchangeDate + ", fax=" + fax + ", email=" + email + ", post=" + post
				+ ", principalRegNum=" + principalRegNum + ", principalTypeName=" + principalTypeName + ", recordScope="
				+ recordScope + ", recordTs=" + recordTs + ", regCapital=" + regCapital + ", regCapitalType="
				+ regCapitalType + ", website=" + website + ", isCCInst=" + isCCInst + ", zdjgBm=" + zdjgBm
				+ ", zdjgName=" + zdjgName + ", cnasRec=" + cnasRec + ", outsideRec=" + outsideRec + ", highnewTecRec="
				+ highnewTecRec + ", orgCode=" + orgCode + ", entHode=" + entHode + "]";
	}
	
	
}
