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
	public Long selectCountByMap(Map<String,Object> map);


    /**
     * 根据查询条件获取机构认证数量
     */
    public List<AuthInstEntity> selectAuthInstByMap(Map<String,Object> queryMap);

    /**
     * 根据模糊查询条件获取机构认证数量
     */
    public Long selectCountByFuzzyMap(Map<String, Object> map);

    /**
     * 模糊查询
     * 按instName、busiScopeName、districtCodeName模糊查询
     */
    public List<AuthInstEntity> selectAuthInstByFuzzyMap(Map<String,Object> map);


}
