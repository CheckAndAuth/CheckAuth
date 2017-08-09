package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.*;

import org.apache.ibatis.annotations.Param;
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
     * 机构名称
     */
    public AuthInstDetailEntity selectDetailByInstName(String instName);


    /**
     * 根据模糊查询条件获取机构认证数量
     */
    public Long selectCountByFuzzyMap(Map<String, Object> map);
    
    /**
     * 根据条件获取热门查询下的机构认证数量
     */
    public Long selectCountByMap(Map<String, Object> map);

    /**
     * 模糊查询
     * 按instName、busiScopeName、districtCodeName模糊查询
     */
    public List<AuthInstDetailEntity> selectDetailListByFuzzyMap(Map<String,Object> map);
    /**
     * 热门查询
     * 根据条件获取热门查询下的机构认证数量
     */
    public List<AuthInstDetailEntity> selectDetailListByMap(Map<String,Object> map);
    /**
     * @desc 根据机构名称更新浏览量
     * @param pageView 浏览量
     * @param instCode 机构代码
     * @return
     */
    public int updatePageViewByInstCode(@Param("pageView")int pageView, @Param("instCode")String instCode);
    /**
     * 获取top N条记录,用于热搜词
     * @param nTop
     * @return
     */
    public List<AuthInstDetailEntity> selectTopN();
    /**
     * 根据instName更新cnas_rec字段
     * @param instName
     * @return
     */
    public int updateCNASRecByInstName(String instName);

}
