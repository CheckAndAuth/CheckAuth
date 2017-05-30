package com.check.auth.g3.checkauth.dao;

import java.util.List;

import com.check.auth.g3.checkauth.entity.MainInstInfoEntity;
/**
 * @desc 主机构信息
 * @author 
 *
 */
public interface IMainInstInfoDao {
	/**
	 * @desc 批量插入
	 * @param mainInstInfoEntities
	 */
	public void insertMainInstInfo(List<MainInstInfoEntity> mainInstInfoEntities);
	/**
	 * @desc 单条插入
	 * @param mainInstInfoEntity
	 */
	public void insert(MainInstInfoEntity mainInstInfoEntity); 
}
