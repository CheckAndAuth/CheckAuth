package com.check.auth.g3.core.checkauth.service;


import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import com.check.auth.g3.facade.checkauth.facade.dto.PageDTO;

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
    public AuthInstDetailEntity queryInstDetailByInstCode(String instCode);

    /**
     * @desc 根据模糊查询
     */
    public List<AuthInstDetailEntity> selectDetailListByFuzzy(Map<String,Object> map);

    /**
     * @desc 关键词查询
     */
    public List<AuthInstDetailEntity> selectDetailListByHot(Map<String, String> map);


    public PageDTO<AuthInstDetailEntity> selectListByPage(Map<String, Object> queryMap);
    public int updatePageViewByInstCode(int pageView, String instCode);

}
