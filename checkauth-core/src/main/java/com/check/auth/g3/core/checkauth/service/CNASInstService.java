package com.check.auth.g3.core.checkauth.service;

import java.util.List;
import java.util.Map;

import com.check.auth.g3.core.checkauth.entity.CNASInstEntity;

public interface CNASInstService {
	/**
	 * 批量插入tbl_cnas_inst表
	 * @param cnasInstEntity
	 * @return
	 */
	public int insertBatch(List<CNASInstEntity> cnasInstEntity);
	
	public List<String> selectAllInstName();
	
	public List<Map<String,Object>> getCnasListByInstName(String instName);
}
