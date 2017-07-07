package com.check.auth.g3.core.checkauth.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.check.auth.g3.core.checkauth.dao.UserAdviceMapper;
import com.check.auth.g3.core.checkauth.entity.UserAdviceEntity;
import com.check.auth.g3.core.checkauth.service.UserAdviceService;
@Service("userAdviceService")
public class UserAdviceServiceImpl implements UserAdviceService {
	@Autowired
	UserAdviceMapper userAdviceMapper;
	
	@Override
	public int insert(UserAdviceEntity userAdviceEntity) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createTime = simpleDateFormat.format(date);
		userAdviceEntity.setCreateTime(createTime);
		return userAdviceMapper.insert(userAdviceEntity);
	}
}
