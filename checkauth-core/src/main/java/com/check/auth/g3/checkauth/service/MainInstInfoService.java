package com.check.auth.g3.checkauth.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.check.auth.g3.checkauth.dao.IMainInstInfoDao;
import com.check.auth.g3.checkauth.entity.MainInstInfoEntity;
import com.check.auth.g3.checkauth.utils.MyBatisUtil;

public class MainInstInfoService {
	public void insertMainInstInfo(List<MainInstInfoEntity> mainInstInfoEntities){
		SqlSessionFactory sqlSession =  MyBatisUtil.getSqlSessionFactory();
        SqlSession session =  sqlSession.openSession();
        IMainInstInfoDao iMainInstInfoDao = session.getMapper(IMainInstInfoDao.class);
        try{
        	iMainInstInfoDao.insertMainInstInfo(mainInstInfoEntities);
        }catch (Exception e) {
        	e.printStackTrace();
		}
        session.commit();
        session.close();
	}
	
	public MainInstInfoEntity selectMainInstInfoByInstCode(String instCode){
		SqlSessionFactory sqlSession =  MyBatisUtil.getSqlSessionFactory();
        SqlSession session =  sqlSession.openSession();
        IMainInstInfoDao iMainInstInfoDao = session.getMapper(IMainInstInfoDao.class);
        return iMainInstInfoDao.selectMainInstInfoByInstCode(instCode);
	}
	
	public static void main(String[] args) {
		MainInstInfoService mainInstInfoService = new MainInstInfoService();
//		try {
//			mainInstInfoService.insertAuthInstDir(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
