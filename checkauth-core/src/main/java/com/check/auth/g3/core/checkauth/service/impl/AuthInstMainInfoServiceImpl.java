package com.check.auth.g3.core.checkauth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.check.auth.g3.core.checkauth.dao.AuthInstMainInfoMapper;
import com.check.auth.g3.core.checkauth.entity.AuthInstMainInfoEntity;
import com.check.auth.g3.core.checkauth.service.AuthInstMainInfoService;
@Service("authInstMainInfoService")
public class AuthInstMainInfoServiceImpl implements AuthInstMainInfoService{

	@Autowired
	AuthInstMainInfoMapper authInstMainInfoMapper;
	
	@Override
	public void insert(AuthInstMainInfoEntity authInstMainInfoEntity) {
		authInstMainInfoMapper.insert(authInstMainInfoEntity);
	}

	@Override
	public AuthInstMainInfoEntity selectMainInstInfoByInstCode(String instCode) {
		return authInstMainInfoMapper.selectMainInstInfoByInstCode(instCode);
	}

	@Override
	public List<AuthInstMainInfoEntity> getAuthMainInfoByKeyWord(String keyword) {
		return authInstMainInfoMapper.getAuthMainInfoByKeyWord(keyword);
	}

	@Override
	public List<AuthInstMainInfoEntity> getAuthMainInfoByInstName(String instName) {
		return authInstMainInfoMapper.getAuthMainInfoByInstName(instName);
	}

	@Override
	public List<AuthInstMainInfoEntity> getAuthMainInfoByBusiScopeName(String busiScopeName) {
		return authInstMainInfoMapper.getAuthMainInfoByBusiScopeName(busiScopeName);
	}

	@Override
	public List<AuthInstMainInfoEntity> getAuthMainInfoByDistrictCodeName(String districtCodeName) {
		return authInstMainInfoMapper.getAuthMainInfoByDistrictCodeName(districtCodeName);
	}
}
