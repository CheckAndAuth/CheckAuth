package com.check.auth.g3.checkauth.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.check.auth.g3.checkauth.entity.AuthInstDirEntity;

public class DataprocessUtils {
	public static List<AuthInstDirEntity> getAuthInstDir() throws IOException {
		List<AuthInstDirEntity> authInstDirEntities = new ArrayList<AuthInstDirEntity>();
		String path = "D:\\project\\CheckAuth\\checkauth-core\\src\\main\\resources\\data\\authorg.txt";
		List<String> lines = Files.readAllLines(Paths.get(path), Charset.forName("UTF-8"));
		for (String string : lines) {
			if (StringUtils.isNotBlank(string)) {
				String[] strs = string.split("\\|",-1);
				AuthInstDirEntity authInstDirEntity = new AuthInstDirEntity();
				//id,instType,instTypeOrder,ratifyDateOrder,mainInstId,instCode,instName,instStatus,address,
				//districtCode,districtCodeName,principal,ratifyDate,validityDate,contactPeroson,tel,cccBm,cccName
				authInstDirEntity.setId(Integer.valueOf(strs[0]));
				authInstDirEntity.setInstCode(strs[1]);
				authInstDirEntity.setInstTypeOrder(strs[2]);
				authInstDirEntity.setRatifyDateOrder(strs[3]);
				authInstDirEntity.setMainInstId(Integer.valueOf(strs[4]));
				authInstDirEntity.setInstCode(strs[5]);
				authInstDirEntity.setInstName(strs[6]);
				authInstDirEntity.setInstStatus(strs[7]);
				authInstDirEntity.setAddress(strs[8]);
				authInstDirEntity.setDistrictCode(strs[9]);
				authInstDirEntity.setDistrictCodeName(strs[10]);
				authInstDirEntity.setPrincipal(strs[11]);
				authInstDirEntity.setRatifyDate(strs[12]);
				authInstDirEntity.setValidityDate(strs[13]);
				authInstDirEntity.setContactPeroson(strs[14]);
				authInstDirEntity.setTel(strs[15]);
				authInstDirEntity.setCccBm(strs[16]);
				authInstDirEntity.setCccName(strs[17]);
				authInstDirEntities.add(authInstDirEntity);
			}
		}
		return authInstDirEntities;
	}
	
}
