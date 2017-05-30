package com.check.auth.g3.checkauth.dao;

import java.util.List;

import com.check.auth.g3.checkauth.entity.AuthInstDirEntity;
/**
 * @desc 机构认证目录
 * @author
 *
 */
public interface IAuthInstDirDao {
	/**
	 * @desc 批量插入
	 * @param authInstDirEntities
	 */
	public void insertAuthInstDir(List<AuthInstDirEntity> authInstDirEntities);
	/**
	 * @desc 单条插入
	 * @param authInstDirEntity
	 */
	public void insert(AuthInstDirEntity authInstDirEntity); 
	/**
	 * @desc 根据机构批准号查找信息
	 * @param instCode
	 * @return
	 */
	public AuthInstDirEntity queryByInstCode(String instCode);
	
	
	
}
