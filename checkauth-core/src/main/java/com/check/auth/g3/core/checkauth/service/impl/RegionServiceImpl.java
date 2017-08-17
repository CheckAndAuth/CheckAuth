package com.check.auth.g3.core.checkauth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.check.auth.g3.core.checkauth.dao.RegionMapper;
import com.check.auth.g3.core.checkauth.entity.RegionEntity;
import com.check.auth.g3.core.checkauth.service.RegionService;
@Service("regionService")
public class RegionServiceImpl implements RegionService {
	@Autowired
	RegionMapper regionMapper;
	@Override
	public List<RegionEntity> selectRegionByParentId(int parentId) {
		List<RegionEntity> regionEntities = regionMapper.selectRegionByParentId(parentId);
//		if (regionId == 2 || regionId == 3 || regionId == 10 || regionId == 23) {//如果是直辖市,则过滤掉下面的市县区
//			List<RegionEntity> regionEntities1 = regionMapper.selectRegionByParentId(regionEntities.get(0).getRegionId()) ;
//			List<RegionEntity> regionEntities2 = regionMapper.selectRegionByParentId(regionEntities.get(1).getRegionId()) ;
//			regionEntities.clear();
//			regionEntities.addAll(regionEntities1);
//			regionEntities.addAll(regionEntities2);
//		}
		return regionEntities;
	}

}
