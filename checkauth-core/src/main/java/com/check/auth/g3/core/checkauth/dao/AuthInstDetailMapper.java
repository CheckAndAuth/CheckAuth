package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import com.check.auth.g3.core.checkauth.entity.AuthInstDetailTempEntity;
import com.check.auth.g3.core.checkauth.entity.AuthTypeAreaTempEntity;
import com.check.auth.g3.core.checkauth.entity.AuthTypeStatTempEntity;

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
	
	/**
	 * @desc 根据机构批准号查询明细表信息
	 * @param instCode
	 * @return
	 */
	public AuthInstDetailTempEntity selectInstDetailByInstCode(String instCode);
	/**
	 * @desc 根据明细表id查询认证类型统计
	 * @param id
	 * @return
	 */
	public List<AuthTypeStatTempEntity> selectAuthTypeStatById(int id);
	
	/**
	 * @desc 根据明细表id获取认证类别及认证领域
	 * @param id
	 */
	public List<AuthTypeAreaTempEntity> selectAuthTypeAreaById(int id);
}
