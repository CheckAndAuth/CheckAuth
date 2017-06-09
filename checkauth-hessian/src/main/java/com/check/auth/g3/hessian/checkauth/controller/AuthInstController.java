package com.check.auth.g3.hessian.checkauth.controller;

import com.check.auth.g3.core.checkauth.entity.AuthInstDetailTempEntity;
import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import com.check.auth.g3.core.checkauth.service.AuthInstDetailService;
import com.check.auth.g3.core.checkauth.service.AuthInstService;
import com.check.auth.g3.core.checkauth.utils.tools.UtilMisc;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/authInst")
public class AuthInstController extends BaseController {

    @Autowired
    private AuthInstService authInstService;
    @Autowired
    private AuthInstDetailService authInstDetailService;

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
    /**
     * 
     * @param request
     * @param content 输入的搜索词
     * @param flag 标识, 1表示按机构名称查询, 2表示按认证领域查询, 3表示按地区查询, 4表示按机构类型查询
     * @return
     */
    @RequestMapping("/fuzzyQueryByContent")
    @ResponseBody
    public Map<String,Object> fuzzyQueryByContent(HttpServletRequest request, String content, String flag){
    	Map<String,Object> retMap=null;
        if(StringUtils.isBlank(content)){
            retMap=UtilMisc.toMap("retCode","01","retMsg","content不能为空！");
            return retMap;
        }else{
            List<AuthInstEntity> authInstEntities=authInstService.selectAuthInstByContent(content, flag);
            if(authInstEntities==null || authInstEntities.isEmpty()){
                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "没有找到对应记录！");
            }else{
                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
                retMap.put("data",authInstEntities);
            }
            return retMap;
        }
    }
    @RequestMapping("/queryDetailByInstCode")
    @ResponseBody
    public Map<String, Object> queryDetailByInstCode(HttpServletRequest request, String instCode){
    	Map<String,Object> retMap=null;
        if(StringUtils.isBlank(instCode)){
            retMap=UtilMisc.toMap("retCode","01","retMsg","instCode不能为空！");
            return retMap;
        }else{
        	AuthInstDetailTempEntity authInstDetailTempEntity=authInstDetailService.queryInstDetailByInstCode(instCode);
            if(authInstDetailTempEntity==null){
                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "没有找到对应记录！");
            }else{
                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
                retMap.put("data",authInstDetailTempEntity);
            }
            return retMap;
        }
    }

}
