package utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.check.entity.AuthInstDirEntity;

public class SpringUtils {
	public List<AuthInstDirEntity> getAuthInstDir() throws IOException {
		List<AuthInstDirEntity> authInstDirEntities = new ArrayList<AuthInstDirEntity>();
//		String path = Thread.currentThread().getContextClassLoader().getResource("/认证目录机构.txt").getPath();
		String path = "D:\\project\\CheckAuth\\src\\main\\resources\\认证机构\\认证目录机构.txt";
//		System.out.println(path);
		List<String> lines = Files.readAllLines(Paths.get(path), Charset.forName("UTF-8"));
		int i = 0;
		for (String string : lines) {
			if (i==0) {
				i++;
				continue;
			}
			
			if (StringUtils.isNotBlank(string)) {
				String[] strs = string.split("\\|");
				System.out.println(strs.length);
				AuthInstDirEntity authInstDirEntity = new AuthInstDirEntity();
				//id,instType,instTypeOrder,ratifyDateOrder,mainInstId,instCode,instName,instStatus,address,
				//districtCode,principal,ratifyDate,validityDate,contactPeroson,tel,cccBm,cccName
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
				authInstDirEntity.setDistrictCodeName("");
				authInstDirEntity.setPrincipal(strs[10]);
				authInstDirEntity.setRatifyDate(strs[11]);
				authInstDirEntity.setValidityDate(strs[12]);
				authInstDirEntity.setContactPeroson(strs[13]);
				authInstDirEntity.setTel(strs[14]);
				authInstDirEntity.setCccBm(strs[15]);
//				System.out.println(strs[16]);
				if (strs.length>16) {
					
					authInstDirEntity.setCccName(strs[16]);
				}
				authInstDirEntities.add(authInstDirEntity);
//				break;
			}
		}
		System.out.println(authInstDirEntities);
		return authInstDirEntities;
	}
	
	public static void main(String[] args) {
		SpringUtils springUtils = new SpringUtils();
		try {
			springUtils.getAuthInstDir();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
