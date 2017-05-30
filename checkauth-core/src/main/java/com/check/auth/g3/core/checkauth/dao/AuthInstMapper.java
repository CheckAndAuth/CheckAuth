package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;


import org.springframework.stereotype.Repository;

@Repository("authInstMapper")
public interface AuthInstMapper {
	/**
	 * @desc 单条插入
	 * @param authInstEntity
	 */
	public void insertAuthInst(AuthInstEntity authInstEntity);
	/**
	 * @desc 根据机构批准号查找信息
	 * @param instCode
	 * @return
	 */
	public AuthInstEntity selectAuthOrgViewByInstCode(String instCode);
	
	
	
}
