package com.check.auth.g3.core.checkauth.service.test;

import com.check.auth.g3.core.checkauth.service.AuthInstDetailService;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:checkauth-appContext.xml"})
public class AuthInstMainInfoServiceTest {

	@Autowired
	AuthInstDetailService authInstDetailService;
	
	@Test
	public void test() {
//		System.out.println(authInstMainInfoService.queryInstDetailByInstCode("CNCA-R-2002-012"));
//		System.out.println(authInstMainInfoService.updatePageViewByInstCode(2, "CNCA-R-2002-012"));
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("isCCCInst","是");
//		map.put("cnasRec", "认可");
//		map.put("fuzzy", "true");
//    	map.put("instName1","管理");
//    	map.put("busiScope1", "管理");
//    	map.put("districtCodeName1", "管理");
//    	map.put("instType1", "管理");
//    	map.put("pageNum", 1);
//    	map.put("pageSize", 10);
//    	System.out.println(authInstDetailService.selectListByPage(map).getTotal());
//    	System.out.println(authInstDetailService.selectListByPage(map).getPageList());
    	
    	System.out.println(authInstDetailService.queryInstDetailByInstCode("CNCA-R-2002-012").getCnasList());
    	
	}
}
