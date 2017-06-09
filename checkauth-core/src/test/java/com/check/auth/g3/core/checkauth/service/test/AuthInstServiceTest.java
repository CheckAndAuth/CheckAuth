package com.check.auth.g3.core.checkauth.service.test;

import com.check.auth.g3.core.checkauth.service.AuthInstService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:checkauth-appContext.xml"})
public class AuthInstServiceTest {

	@Autowired
	AuthInstService authInstService;
	
	@Test
	public void testSelectAuthInstByInstCode() {
//		System.out.println(authInstService.selectAuthInstByInstCode("CNCA-R-2002-001"));
		System.out.println(authInstService.selectAuthInstByContent("北京", "1"));
	}
}
