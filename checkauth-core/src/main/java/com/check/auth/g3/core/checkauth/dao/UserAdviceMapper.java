package com.check.auth.g3.core.checkauth.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.check.auth.g3.core.checkauth.entity.UserAdviceEntity;
@Repository("userAdviceMapper")
public interface UserAdviceMapper {
	/**
	 * 插入用户建议表
	 * @param userAdviceEntity
	 * @return
	 */
	public int insert(UserAdviceEntity userAdviceEntity);
	/**
	 * 查看所有用户建议
	 * @return
	 */
	public List<UserAdviceEntity> queryAll();
	
}
