package com.check.auth.g3.core.checkauth.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.check.auth.g3.core.checkauth.entity.RegionEntity;

@Repository("regionMapper")
public interface RegionMapper {
	/**
	 * 根据parentId列出所有的地区
	 * @return
	 */
	public List<RegionEntity> selectRegionByParentId(int parentId);
}
