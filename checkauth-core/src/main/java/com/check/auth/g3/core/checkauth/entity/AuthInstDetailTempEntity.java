package com.check.auth.g3.core.checkauth.entity;

import java.util.List;

/**
 * @desc 临时实体表用于关联查询主机构信息表和明细表
 * @author 
 *
 */
public class AuthInstDetailTempEntity {
	private int id;
	private String instCode;
	private String instName;
	private String instStatus;
	private String instType;
	private String principal;
	private String ratifyDate;
	private String validatyDate;
	private String contactPerson;
	private String tel;
	private String address;
	private String districtCode;
	private String districtCodeName;
	private String cccBm;
	private String fax;
	private String email;
	private String post;
	private String principalRegNum;//法人注册号
	private String principalRegName;//法人注册名称
	private String regCapital;//注册资本
	private String webSite;//网址
	private String isCCCInst;
	private String cnasRec;
	private String outSideRec;
	private String highNewTecRec;
	private String org_code;
	private String entHode;//企业控股
	private int detailId;//明细表id
	private String logoName;
	private List<AuthTypeStatTempEntity> authTypeStatTempEntities;
	private List<AuthTypeAreaTempEntity> authTypeAreaTempEntities;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstCode() {
		return instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getInstStatus() {
		return instStatus;
	}
	public void setInstStatus(String instStatus) {
		this.instStatus = instStatus;
	}
	public String getInstType() {
		return instType;
	}
	public void setInstType(String instType) {
		this.instType = instType;
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
	public String getValidatyDate() {
		return validatyDate;
	}
	public void setValidatyDate(String validatyDate) {
		this.validatyDate = validatyDate;
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
	public String getCccBm() {
		return cccBm;
	}
	public void setCccBm(String cccBm) {
		this.cccBm = cccBm;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getPrincipalRegName() {
		return principalRegName;
	}
	public void setPrincipalRegName(String principalRegName) {
		this.principalRegName = principalRegName;
	}
	public String getRegCapital() {
		return regCapital;
	}
	public void setRegCapital(String regCapital) {
		this.regCapital = regCapital;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getIsCCCInst() {
		return isCCCInst;
	}
	public void setIsCCCInst(String isCCCInst) {
		this.isCCCInst = isCCCInst;
	}
	public String getCnasRec() {
		return cnasRec;
	}
	public void setCnasRec(String cnasRec) {
		this.cnasRec = cnasRec;
	}
	public String getOutSideRec() {
		return outSideRec;
	}
	public void setOutSideRec(String outSideRec) {
		this.outSideRec = outSideRec;
	}
	public String getHighNewTecRec() {
		return highNewTecRec;
	}
	public void setHighNewTecRec(String highNewTecRec) {
		this.highNewTecRec = highNewTecRec;
	}
	public String getOrg_code() {
		return org_code;
	}
	public void setOrg_code(String org_code) {
		this.org_code = org_code;
	}
	public String getEntHode() {
		return entHode;
	}
	public void setEntHode(String entHode) {
		this.entHode = entHode;
	}
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public String getLogoName() {
		return logoName;
	}
	public void setLogoName(String logoName) {
		this.logoName = logoName;
	}
	public List<AuthTypeAreaTempEntity> getAuthTypeAreaTempEntities() {
		return authTypeAreaTempEntities;
	}
	public void setAuthTypeAreaTempEntities(List<AuthTypeAreaTempEntity> authTypeAreaTempEntities) {
		this.authTypeAreaTempEntities = authTypeAreaTempEntities;
	}
	public List<AuthTypeStatTempEntity> getAuthTypeStatTempEntities() {
		return authTypeStatTempEntities;
	}
	public void setAuthTypeStatTempEntities(List<AuthTypeStatTempEntity> authTypeStatTempEntities) {
		this.authTypeStatTempEntities = authTypeStatTempEntities;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	@Override
	public String toString() {
		return "AuthInstDetailTempEntity [id=" + id + ", instCode=" + instCode + ", instName=" + instName
				+ ", instStatus=" + instStatus + ", instType=" + instType + ", principal=" + principal + ", ratifyDate="
				+ ratifyDate + ", validatyDate=" + validatyDate + ", contactPerson=" + contactPerson + ", tel=" + tel
				+ ", address=" + address + ", districtCode=" + districtCode + ", districtCodeName=" + districtCodeName
				+ ", cccBm=" + cccBm + ", fax=" + fax + ", email=" + email + ", post=" + post + ", principalRegNum="
				+ principalRegNum + ", principalRegName=" + principalRegName + ", regCapital=" + regCapital
				+ ", webSite=" + webSite + ", isCCCInst=" + isCCCInst + ", cnasRec=" + cnasRec + ", outSideRec="
				+ outSideRec + ", highNewTecRec=" + highNewTecRec + ", org_code=" + org_code + ", entHode=" + entHode
				+ ", detailId=" + detailId + ", logoName=" + logoName + ", authTypeStatTempEntities="
				+ authTypeStatTempEntities + ", authTypeAreaTempEntities=" + authTypeAreaTempEntities + "]";
	}
	
}
