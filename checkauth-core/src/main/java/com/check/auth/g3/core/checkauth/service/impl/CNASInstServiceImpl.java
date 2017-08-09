package com.check.auth.g3.core.checkauth.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.check.auth.g3.core.checkauth.dao.CNASInstMapper;
import com.check.auth.g3.core.checkauth.entity.CNASInstEntity;
import com.check.auth.g3.core.checkauth.service.CNASInstService;
@Service("cnasInstService")
public class CNASInstServiceImpl implements CNASInstService {
	@Autowired
	CNASInstMapper cnasInstMapper;
	@Override
	public int insertBatch(List<CNASInstEntity> cnasInstEntity) {
		return cnasInstMapper.insertBatch(cnasInstEntity);
	}
	@Override
	public List<String> selectAllInstName() {
		return cnasInstMapper.selectAllInstName();
	}
	@Override
	public List<Map<String, Object>> getCnasListByInstName(String instName) {
		return cnasInstMapper.getCnasListByInstName(instName);
	}

}
