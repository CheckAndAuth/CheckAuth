package com.check.auth.g3.core.checkauth.utils;

import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataprocessUtils {
	public static List<AuthInstEntity> getAuthInst() throws IOException {
		List<AuthInstEntity> authInstEntities = new ArrayList<AuthInstEntity>();
		String path = "D:\\github\\CheckAuth\\checkauth-core\\src\\main\\resources\\data\\authorg.txt";
		List<String> lines = Files.readAllLines(Paths.get(path), Charset.forName("UTF-8"));
		for (String string : lines) {
			if (StringUtils.isNotBlank(string)) {
				String[] strs = string.split("\\|",-1);
				AuthInstEntity authInstEntity = new AuthInstEntity();
				//id,instType,instTypeOrder,ratifyDateOrder,mainInstId,instCode,instName,instStatus,address,
				//districtCode,districtCodeName,principal,ratifyDate,validityDate,contactPeroson,tel,cccBm,cccName
				authInstEntity.setId(Integer.valueOf(strs[0]));
				authInstEntity.setInstCode(strs[1]);
				authInstEntity.setInstTypeOrder(strs[2]);
				authInstEntity.setRatifyDateOrder(strs[3]);
				authInstEntity.setMainInstId(Integer.valueOf(strs[4]));
				authInstEntity.setInstCode(strs[5]);
				authInstEntity.setInstName(strs[6]);
				authInstEntity.setInstStatus(strs[7]);
				authInstEntity.setAddress(strs[8]);
				authInstEntity.setDistrictCode(strs[9]);
				authInstEntity.setDistrictCodeName(strs[10]);
				authInstEntity.setPrincipal(strs[11]);
				authInstEntity.setRatifyDate(strs[12]);
				authInstEntity.setValidityDate(strs[13]);
				authInstEntity.setContactPerson(strs[14]);
				authInstEntity.setTel(strs[15]);
				authInstEntity.setCccBm(strs[16]);
				authInstEntity.setCccName(strs[17]);
				authInstEntities.add(authInstEntity);
			}
		}
		return authInstEntities;
	}
	
	public static List<AuthInstDetailEntity> getMainInstInfo() throws IOException {
		List<AuthInstDetailEntity> authInstMainInfoEntities = new ArrayList<AuthInstDetailEntity>();
		String path = "D:\\github\\CheckAuth\\checkauth-core\\src\\main\\resources\\data\\authorg.txt";
		List<String> lines = Files.readAllLines(Paths.get(path), Charset.forName("UTF-8"));
		for (String string : lines) {
			if (StringUtils.isNotBlank(string)) {
				String[] strs = string.split("\\|",-1);
				//id,instType,instTypeOrder,ratifyDateOrder,mainInstId,instCode,instName,instStatus,address,
				//districtCode,districtCodeName,principal,ratifyDate,validityDate,contactPeroson,tel,cccBm,cccName
				
			}
		}
		return authInstMainInfoEntities;
	}
}
