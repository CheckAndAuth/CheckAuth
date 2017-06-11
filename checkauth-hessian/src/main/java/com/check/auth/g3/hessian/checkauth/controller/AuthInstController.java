package com.check.auth.g3.hessian.checkauth.controller;

import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import com.check.auth.g3.core.checkauth.entity.query.InstQuery;
import com.check.auth.g3.core.checkauth.service.AuthInstDetailService;
import com.check.auth.g3.core.checkauth.service.AuthInstService;
import com.check.auth.g3.core.checkauth.utils.tools.UtilMisc;
import com.check.auth.g3.facade.checkauth.facade.dto.PageDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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
    public Map<String, Object> fuzzyQuery(HttpServletRequest request, InstQuery instQuery) {
        Map<String, Object> retMap = null;
        if(StringUtils.isBlank(instQuery.getQueryFlag())) {
            retMap = UtilMisc.toMap("retCode", "01", "retMsg", "检索类型不能为空！");
            return retMap;
        }else{
            Map<String, Object> reqMap=adjustQueryKey(instQuery);
            reqMap.put("fuzzy", "true");
            reqMap.put("pageNum",instQuery.getPageNum());
            reqMap.put("pageSize",instQuery.getPageSize());
            PageDTO<AuthInstEntity> pageList = authInstService.selectListByPage(reqMap);
            retMap = UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
            retMap.put("data", pageList);
            return retMap;
        }
    }

    @RequestMapping("/fuzzyQueryDetail")
    @ResponseBody
    public Map<String, Object> fuzzyQueryDetail(HttpServletRequest request, InstQuery instQuery) {
        Map<String, Object> retMap = null;
        if(StringUtils.isBlank(instQuery.getQueryFlag())) {
            retMap = UtilMisc.toMap("retCode", "01", "retMsg", "检索类型不能为空！");
            return retMap;
        }else{
            Map<String, Object> reqMap = adjustQueryKey(instQuery);
            reqMap.put("fuzzy", "true");
            reqMap.put("pageNum", instQuery.getPageNum());
            reqMap.put("pageSize", instQuery.getPageSize());
            PageDTO<AuthInstDetailEntity> pageList = authInstDetailService.selectListByPage(reqMap);
            retMap = UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
            retMap.put("data", pageList);
            return retMap;
        }
    }
//    /**
//     *
//     * @param request
//     * @param content 输入的搜索词
//     * @param flag 标识, 1表示按机构名称查询, 2表示按认证领域查询, 3表示按地区查询, 4表示按机构类型查询
//     * @return
//     */
//    @RequestMapping("/fuzzyQueryByContent")
//    @ResponseBody
//    public Map<String,Object> fuzzyQueryByContent(HttpServletRequest request, String content, String flag){
//    	Map<String,Object> retMap=null;
//        if(StringUtils.isBlank(content)){
//            retMap=UtilMisc.toMap("retCode","01","retMsg","content不能为空！");
//            return retMap;
//        }else{
//            List<AuthInstEntity> authInstEntities=authInstService.selectAuthInstByContent(content, flag);
//            if(authInstEntities==null || authInstEntities.isEmpty()){
//                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "没有找到对应记录！");
//            }else{
//                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
//                retMap.put("data",authInstEntities);
//            }
//            return retMap;
//        }
//    }
    @RequestMapping("/queryDetailByInstCode")
    @ResponseBody
    public Map<String, Object> queryDetailByInstCode(HttpServletRequest request, String instCode){
    	Map<String,Object> retMap=null;
        if(StringUtils.isBlank(instCode)){
            retMap=UtilMisc.toMap("retCode","01","retMsg","instCode不能为空！");
            return retMap;
        }else{
            AuthInstDetailEntity authInstDetailEntity=authInstDetailService.queryInstDetailByInstCode(instCode);
            if(authInstDetailEntity==null){
                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "没有找到对应记录！");
            }else{
                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
                retMap.put("data", authInstDetailEntity);
            }
            return retMap;
        }
    }

    private Map<String,Object> adjustQueryKey(InstQuery instQuery){
        Map<String, Object> map = new HashMap<String, Object>();
        String queryFlag=instQuery.getQueryFlag();
        if(StringUtils.isNotBlank(queryFlag)) {
            if("1".equals(queryFlag)) {
                map.put("instName",instQuery.getQueryContent());
            }else if ("2".equals(queryFlag)) {
                map.put("busiScopeName", instQuery.getQueryContent());
            }else if ("3".equals(queryFlag)) {
                map.put("districtCodeName", instQuery.getQueryContent());
            }else if ("4".equals(queryFlag)){
                map.put("instType", instQuery.getQueryContent());
            }else {
                throw new IllegalArgumentException("检索类型参数不能为空");
            }
            return map;
        }else{
            return map;
        }
    }

}
