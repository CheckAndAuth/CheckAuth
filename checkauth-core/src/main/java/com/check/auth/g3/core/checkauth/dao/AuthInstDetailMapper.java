package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @desc 主机构信息
 * @author 
 *
 */
@Repository("authInstMainInfoMapper")
public interface AuthInstDetailMapper {
	/**
	 * 单笔插入
	 */
	public void insert(AuthInstDetailEntity authInstMainInfoEntity);


    /**
     * 机构批准号
     */
    public AuthInstDetailEntity selectDetailByInstCode(String instCode);



	/**
	 * 模糊查询
	 * 按instName、busiScopeName、districtCodeName模糊查询
	 */
	public List<AuthInstDetailEntity>  selectDetailListByFuzzy(Map<String,String> map);

}
