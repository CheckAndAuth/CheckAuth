package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("authInstMapper")
public interface AuthInstMapper {
	/**
	 * 插入认证机构
	 */
	public void insertAuthInst(AuthInstEntity authInstEntity);


	/**
	 * 根据机构批准号查找机构信息
	 */
	public AuthInstEntity selectAuthInstByInstCode(String instCode);


    /**
     * 根据查询条件获取机构认证数量
     */
	public Long getCountByMap(Map<String,Object> map);


    public List<AuthInstEntity> selectAuthInstByMap(Map<String,Object> queryMap);


}
