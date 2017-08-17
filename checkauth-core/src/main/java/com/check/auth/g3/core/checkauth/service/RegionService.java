package com.check.auth.g3.core.checkauth.service;

import java.util.List;

import com.check.auth.g3.core.checkauth.entity.RegionEntity;

public interface RegionService {
	/**
	 * 根据地区码返回地区信息
	 * @param regionCode
	 * @return
	 */
	public List<RegionEntity> selectRegionByParentId(int parentId);
}
