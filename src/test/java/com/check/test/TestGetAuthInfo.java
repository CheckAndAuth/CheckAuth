package com.check.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.junit.Test;


public class TestGetAuthInfo {
	@Test
	public void testGetAuthInfo() {
//		String url = "http://cx.cnca.cn/rjwcx/pub/web/institutionCommonInfoView/list.do?progId=3010";
		String url = "http://cx.cnca.cn/rjwcx/pub/web/institutionCommonInfoView/list.do?progId=3010&instCode=&instName=&instType=01&instStatus=01&province=&city=&county=&checkCode=-1&type=public&pageOfinPages=1&rows=15&page=1";
		PostMethod httpMethod = new PostMethod(url);
//		httpMethod.addRequestHeader("Accept", "application/json, text/javascript, */*; q=0.01");
////		httpMethod.addRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
//		httpMethod.addRequestHeader("Cookie", "JSESSIONID=0000gmikNHU9JcArjA9ZSfWjIjv:-1");
////		httpMethod.addRequestHeader("Origin", "http://cx.cnca.cn");
////		httpMethod.addRequestHeader("Proxy-Connection", "keep-alive");
//		httpMethod.addRequestHeader("Referer", "http://cx.cnca.cn/rjwcx/pub/web/institutionCommonInfoView/index.do?progId=3010&title=%E8%AE%A4%E8%AF%81%E6%9C%BA%E6%9E%84%E7%9B%AE%E5%BD%95&nsukey=JOoA7fA2s3Yz1v0dklFiEKUz5W11C96ZOZDwT3F3g8Z4VK9w9uuH3ptVWxIASSkJg3y1OUoiQW97KyssaHrSafUWX3hSmSXrvSEL%2BPQDVMxnAdIo8z5GgO8vF8V4lLwS%2FDY7ufLuL7W9Mc4uCZfOAl5JlwVYbKq1MuLg695SXhGW%2B0u6LeEGj4ICYDOJ8pkB");
//		httpMethod.addRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Safari/537.36");
//		httpMethod.addRequestHeader("X-Requested-With", "XMLHttpRequest");
//		
//		
//		NameValuePair[] nameValuePairs = new NameValuePair[8];
//		nameValuePairs[0] = new NameValuePair("checkCode", "1");
//		nameValuePairs[1] = new NameValuePair("instStatus", "01");
//		nameValuePairs[2] = new NameValuePair("instType", "01");
//		nameValuePairs[3] = new NameValuePair("page", "1");
//		nameValuePairs[4] = new NameValuePair("pageOfinPages", "1");
//		nameValuePairs[5] = new NameValuePair("progId", "3010");
//		nameValuePairs[6] = new NameValuePair("rows", "15");
//		nameValuePairs[7] = new NameValuePair("type", "public");
			
		
//		httpMethod.addParameters(nameValuePairs);
		HttpClient httpClient = new HttpClient();
//		httpClient.getHostConfiguration().setProxy("127.0.0.1", 8888);
		try {
			httpClient.executeMethod(httpMethod);
//			logger.info("dev PV report return HTTP STATUSCODE is :  " + httpMethod.getStatusCode());
			if (httpMethod.getStatusCode() == HttpStatus.SC_OK) {
				System.out.println(httpMethod.getResponseBodyAsString());
			}else {
				System.out.println(httpMethod.getStatusLine());
			}
			
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			httpMethod.releaseConnection();
		}
		
	}
	@Test
	public void testGetValidateCode() {
		String url = "http://cx.cnca.cn/rjwcx/checkCode/rand.do?d=1496013675878";
		GetMethod getMethod = new GetMethod(url);
		HttpClient httpClient = new HttpClient();
		try {
			httpClient.executeMethod(getMethod);
			if (getMethod.getStatusCode() == HttpStatus.SC_OK) {
//				System.out.println(getMethod.getResponseBodyAsString());
				BufferedReader reader = new BufferedReader(new InputStreamReader(getMethod.getResponseBodyAsStream(), "UTF-8"));
				String line;
				StringBuffer response = new StringBuffer();
				while((line = reader.readLine()) != null){
					response.append(line).append(System.getProperty("line.separator"));
				}
				reader.close();
				System.out.println("return Response is : "+ response);
//				testGetAuthInfo();
			}else{
				System.out.println(getMethod.getStatusLine());
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			getMethod.releaseConnection();
		}
	}
	@Test
	public void testGetQXB() {
		String url = "http://www.qixin.com/search?key=%E8%AE%A4%E8%AF%81%E6%A3%80%E6%B5%8B&type=enterprise&source=&isGlobal=Y";
		GetMethod getMethod = new GetMethod(url);
		HttpClient httpClient = new HttpClient();
		try {
			httpClient.executeMethod(getMethod);
			if (getMethod.getStatusCode() == HttpStatus.SC_OK) {
				System.out.println(getMethod.getResponseBodyAsString());
			}else{
				System.out.println(getMethod.getStatusLine());
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			getMethod.releaseConnection();
		}
	}
	
}
