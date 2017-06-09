package com.check.auth.g3.core.checkauth.service.test;

import com.check.auth.g3.core.checkauth.service.AuthInstDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:checkauth-appContext.xml"})
public class AuthInstMainInfoServiceTest {

	@Autowired
    AuthInstDetailService authInstMainInfoService;
	
	@Test
	public void test() {
		System.out.println(authInstMainInfoService.queryInstDetailByInstCode("CNCA-R-2002-012"));
	}
}
