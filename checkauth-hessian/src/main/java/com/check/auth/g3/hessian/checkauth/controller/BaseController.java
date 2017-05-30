package com.check.auth.g3.hessian.checkauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller父类
 */
@Controller
public class BaseController {

	// 请求处理成功
	public final static String SUCCESS = "00";
	// 请求处理失败
	public final static String ERROR = "-1";

	public final static int HAVE_STAR = 1;
	public final static int NO_STAR = 0;


	public static final String ROOM_FANCY_LIST="ROOM_FANCY_";
	public static final String ENJOY_SERVICE_LIST="ENJOY_SERVICE_";
	public static final String BREAK_ORDER_LIST="BREAK_ORDER_";
	public static final String PRODUCT_LIST="PRODUCT_LIST_";
	public static final String HOTEL_ENTITY="HOTEL_ENTITY_";
	public static final String ROOM_LIST="ROOM_LIST_";
	@SuppressWarnings("unchecked")
    public Model returnModel(HttpServletRequest request, Model model) {
	    model.addAttribute("breakOrderList","");
		return model;
	}



}
