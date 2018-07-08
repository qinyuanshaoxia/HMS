package com.pansiot.dashboard.controller;

import com.pansiot.common.dto.ReturnData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
/**
 * @description: DushboardController类描述:管理控制台框架控制器
 * @author Peter Pan
 * @date 2018/7/8 21:41
 */
public class DashboardController {

    @RequestMapping(value={"/login"},method = RequestMethod.GET)
    /**
     * @description: Login方法描述:登录页面
     * @author Peter Pan
     * @date 2018/7/8 22:00
     * @params [model]
     * @return java.lang.String
     * @throws 
     */
    public String Login(){
        return "login";
    }

    @RequestMapping(value={"/login"},method = RequestMethod.POST)
    @ResponseBody
    /**
     * @description: 方法描述:登录验证
     * @author Peter Pan
     * @date 2018/7/8 22:18
     * @params
     * @return
     * @throws
     */
    public ReturnData Login(@RequestBody Map map) {
        ReturnData returnData = new ReturnData();
        returnData.setMsg(map.get("pwd").toString());
        return returnData;
    }


    @RequestMapping(value={"/index","/","/hello"})
    /**
     * @description: index方法描述:控制台首页和欢迎页面
     * @author Peter Pan
     * @date 2018/7/8 21:43
     * @params [model]
     * @return java.lang.String
     * @throws 
     */
    public String index(Model model){
        model.addAttribute("welcome", "欢迎");
        model.addAttribute("atext", "待办事项");
        return "index";
    }
}
