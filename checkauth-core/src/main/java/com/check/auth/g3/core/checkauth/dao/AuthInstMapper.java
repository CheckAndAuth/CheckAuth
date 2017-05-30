package com.check.auth.g3.core.checkauth.dao;


import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import org.springframework.stereotype.Repository;

@Repository("authInstMapper")
public interface AuthInstMapper {
	public void insertAuthInst(AuthInstEntity authInstDirEntity);

	public AuthInstEntity selectAuthOrgViewByInstCode(String instCode);
}
