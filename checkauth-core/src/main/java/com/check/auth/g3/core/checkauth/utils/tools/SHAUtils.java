package com.check.auth.g3.core.checkauth.utils.tools;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * SHA算法工具包
 * @author
 */
public class SHAUtils {
  public static String encode(String aValue) {
    aValue = aValue.trim();
    byte value[];
    try {
      value = aValue.getBytes("UTF-8");
    } catch (UnsupportedEncodingException e) {
      value = aValue.getBytes();
    }
    MessageDigest md = null;
    try {
      md = MessageDigest.getInstance("SHA");
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      return null;
    }
    return DecimalUtil.parseByte2Hex(md.digest(value));
  }
  
  //SHA1加密
  public static String SHA1(String decript) {  
	  try {
		MessageDigest digest = MessageDigest.getInstance("SHA-1");
		  digest.update(decript.getBytes());
		  byte messageDigest[] = digest.digest();
		  StringBuffer hexString = new StringBuffer();
		  for (int i = 0; i < messageDigest.length; i++) {
			  String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
			  if (shaHex.length() < 2) {
				  hexString.append(0);
			  }
			  hexString.append(shaHex); 
		  }
		  return hexString.toString();
	} catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
		return ""; 
	} 
  }
  
}
