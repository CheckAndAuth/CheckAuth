package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.AuthInstStaticsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("authStaticsMapper")
public interface AuthStaticsMapper {


	/**
	 * 根据机构详情查询机构年度统计数据
	 */
	public AuthInstStaticsEntity selectStaticsByInstDetailId(int instDetailId);

    /**
     * 根据机构详情查询机构年度详细数据
     */
    public List<Map<String,Object>> getGroupStaticsByInstDetailId(int instDetailId);


}
