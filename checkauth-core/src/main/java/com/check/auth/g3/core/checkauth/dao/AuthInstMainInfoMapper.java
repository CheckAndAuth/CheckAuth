package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.AuthInstMainInfoEntity;

/**
 * @desc 主机构信息
 * @author 
 *
 */
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
}
