package com.check.auth.g3.checkauth.dao;

import java.util.List;

import com.check.auth.g3.checkauth.entity.AuthInstDirEntity;

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
}
