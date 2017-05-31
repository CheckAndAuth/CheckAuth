package com.check.auth.g3.core.checkauth.service.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.check.auth.g3.core.checkauth.service.AuthInstService;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:/spring/spring-*.xml"})   
public class AuthInstServiceTest {
	@Resource
	AuthInstService authInstService;
	
	@Test
	public void test() {
		authInstService.selectAuthOrgViewByInstCode("CNCA-R-2002-001");
	}
}
