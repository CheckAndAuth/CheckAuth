package com.check.auth.g3.hessian.checkauth.controller;

import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import com.check.auth.g3.core.checkauth.service.AuthInstService;
import com.check.auth.g3.core.checkauth.utils.tools.UtilMisc;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/authInst")
public class AuthInstController extends BaseController {

    @Autowired
    private AuthInstService authInstService;

    @RequestMapping("/list")
    @ResponseBody
    public String authInstList(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping("/query")
    @ResponseBody
    public Map<String,Object> queryByInstCode(HttpServletRequest request, String instCode) {
        Map<String,Object> retMap=null;
        if(StringUtils.isBlank(instCode)){
            retMap=UtilMisc.toMap("retCode","01","retMsg","instCode不能为空！");
            return retMap;
        }else{
            AuthInstEntity authInstEntity=authInstService.selectAuthInstByInstCode(instCode);
            if(authInstEntity==null){
                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "没有找到对应记录！");
            }else{
                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
                retMap.put("data",authInstEntity);
            }
            return retMap;
        }
    }

    @RequestMapping("/fuzzyQuery")
    @ResponseBody
    public String fuzzyQueryByInstCode(HttpServletRequest request,String typeValue) {
        return "index";
    }



}
