package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.AuthInstMainInfoEntity;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @desc 主机构信息
 * @author 
 *
 */
@Repository("authInstMainInfoMapper")
public interface AuthInstMainInfoMapper {
	/**
	 * @desc 单条插入
	 * @param authInstMainInfoEntity
	 */
	public void insert(AuthInstMainInfoEntity authInstMainInfoEntity); 
	/**
	 * @desc 根据机构批准号查找主机构信息
	 * @param instCode
	 * @return
	 */
	public AuthInstMainInfoEntity selectMainInstInfoByInstCode(String instCode);
	/**
	 * @desc 根据关键词模糊查询主机构信息表, 按机构名称、认证领域、地区模糊查询
	 * @param keyword
	 * @return
	 */
	public List<AuthInstMainInfoEntity> getAuthMainInfoByKeyWord(String keyword);
	/**
	 * @desc 根据机构名称模糊词查询主机构信息表
	 * @param instName
	 * @return
	 */
	public List<AuthInstMainInfoEntity> getAuthMainInfoByInstName(String instName);
	/**
	 * @desc 根据认证领域查询主机构信息表
	 * @param busiScopeName
	 * @return
	 */
	public List<AuthInstMainInfoEntity> getAuthMainInfoByBusiScopeName(String busiScopeName);
	/**
	 * @desc 根据地区查询主机构信息表
	 * @param keyword
	 * @return
	 */
	public List<AuthInstMainInfoEntity> getAuthMainInfoByDistrictCodeName(String districtCodeName);
}
