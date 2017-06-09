package com.check.auth.g3.core.checkauth.service.impl;

import com.check.auth.g3.core.checkauth.dao.AuthInstDetailMapper;
import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import com.check.auth.g3.core.checkauth.entity.AuthInstDetailTempEntity;
import com.check.auth.g3.core.checkauth.entity.AuthTypeAreaTempEntity;
import com.check.auth.g3.core.checkauth.entity.AuthTypeStatTempEntity;
import com.check.auth.g3.core.checkauth.service.AuthInstDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("authInstDetailService")
public class AuthInstDetailServiceImpl implements AuthInstDetailService {

	@Autowired
    AuthInstDetailMapper authInstDetailMapper;
	
	@Override
	public void insert(AuthInstDetailEntity authInstMainInfoEntity) {
		authInstDetailMapper.insert(authInstMainInfoEntity);
	}

	@Override
	public AuthInstDetailEntity selectInstDetailByInstCode(String instCode) {
		return authInstDetailMapper.selectDetailByInstCode(instCode);
	}


	@Override
	public List<AuthInstDetailEntity> selectDetailListByFuzzy(Map<String,String> map) {
		return authInstDetailMapper.selectDetailListByFuzzy(map);
	}

    @Override
    public List<AuthInstDetailEntity> selectDetailListByHot(Map<String, String> map) {
        return null;
    }

	@Override
	public AuthInstDetailTempEntity queryInstDetailByInstCode(String instCode) {
		AuthInstDetailTempEntity authInstDetailTempEntity = authInstDetailMapper.selectInstDetailByInstCode(instCode);
		List<AuthTypeAreaTempEntity> authTypeAreaTempEntities = authInstDetailMapper.selectAuthTypeAreaById(authInstDetailTempEntity.getDetailId());
		List<AuthTypeStatTempEntity> authTypeStatTempEntities = authInstDetailMapper.selectAuthTypeStatById(authInstDetailTempEntity.getDetailId());
		authInstDetailTempEntity.setAuthTypeAreaTempEntities(authTypeAreaTempEntities);
		authInstDetailTempEntity.setAuthTypeStatTempEntities(authTypeStatTempEntities);
		return authInstDetailTempEntity;
	}

}
