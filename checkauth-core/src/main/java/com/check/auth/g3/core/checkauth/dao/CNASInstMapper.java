package com.check.auth.g3.core.checkauth.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.check.auth.g3.core.checkauth.entity.CNASInstEntity;
@Repository("cnasInstMapper")
public interface CNASInstMapper {
	/**
	 * 批量插入tbl_cnas_inst表
	 * @param cnasInstEntity
	 * @return
	 */
	public int insertBatch(List<CNASInstEntity> cnasInstEntity);
	/**
	 * 查询表中所有的inst_name
	 * @return
	 */
	public List<String> selectAllInstName();
	/**
	 * 根据机构名称查询cnas认可领域
	 * @param instName
	 * @return
	 */
	public List<Map<String,Object>> getCnasListByInstName(String instName);
}
