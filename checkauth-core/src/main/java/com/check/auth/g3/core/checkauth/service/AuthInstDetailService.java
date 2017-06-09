package com.check.auth.g3.core.checkauth.service;


import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import com.check.auth.g3.core.checkauth.entity.AuthInstDetailTempEntity;

import java.util.List;
import java.util.Map;

/**
 * @desc 主机构信息
 * @author 
 *
 */
public interface AuthInstDetailService {
	/**
	 * @desc 单笔插入
	 */
	public void insert(AuthInstDetailEntity authInstMainInfoEntity);

    /**
     * @desc 根据机构码查询
     */
    public AuthInstDetailEntity selectInstDetailByInstCode(String instCode);

    /**
     * @desc 根据模糊查询
     */
    public List<AuthInstDetailEntity> selectDetailListByFuzzy(Map<String, String> map);

    /**
     * @desc 关键词查询
     */
    public List<AuthInstDetailEntity> selectDetailListByHot(Map<String, String> map);
    /**
     * @desc 根据instCode获取明细信息
     * @param instCode
     * @return
     */
    public AuthInstDetailTempEntity queryInstDetailByInstCode(String instCode);
}
