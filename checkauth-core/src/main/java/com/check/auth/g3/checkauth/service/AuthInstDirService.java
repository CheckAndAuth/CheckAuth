package com.check.auth.g3.checkauth.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.check.auth.g3.checkauth.dao.IAuthInstDirDao;
import com.check.auth.g3.checkauth.entity.AuthInstDirEntity;
import com.check.auth.g3.checkauth.utils.DataprocessUtils;
import com.check.auth.g3.checkauth.utils.MyBatisUtil;

public class AuthInstDirService {
	public void insertAuthInstDir(List<AuthInstDirEntity> authInstDirEntities){
		SqlSessionFactory sqlSession =  MyBatisUtil.getSqlSessionFactory();
        SqlSession session =  sqlSession.openSession();
        IAuthInstDirDao iAuthInstDirDao = session.getMapper(IAuthInstDirDao.class);
        try{
        	iAuthInstDirDao.insertAuthInstDir(authInstDirEntities);
        }catch (Exception e) {
        	e.printStackTrace();
		}
        session.commit();
        session.close();
	}
	
	public void insert(AuthInstDirEntity authInstDirEntity){
		SqlSessionFactory sqlSession =  MyBatisUtil.getSqlSessionFactory();
        SqlSession session =  sqlSession.openSession();
        IAuthInstDirDao iAuthInstDirDao = session.getMapper(IAuthInstDirDao.class);
        iAuthInstDirDao.insert(authInstDirEntity);
        session.commit();
        session.close();
	}
	
	public AuthInstDirEntity queryByInstCode(String instCode){
		SqlSessionFactory sqlSession =  MyBatisUtil.getSqlSessionFactory();
        SqlSession session =  sqlSession.openSession();
        IAuthInstDirDao iAuthInstDirDao = session.getMapper(IAuthInstDirDao.class);
        return iAuthInstDirDao.queryByInstCode(instCode);
	}
	
	public static void main(String[] args) {
		AuthInstDirService authInstDirService = new AuthInstDirService();
		System.out.println(authInstDirService.queryByInstCode("CNCA-R-2002-001"));
	}
}
