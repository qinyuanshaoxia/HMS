package com.pansiot.hms.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: HelloController类描述
 * @author Peter Pan
 * @date 2018/7/6 16:07
 */
@Controller
public class HelloController {

    @RequestMapping(value={"/index","/","/hello"})
    /**
     * @description: index方法描述
     * @author Peter Pan
     * @date 2018/7/6 15:55
     * @params [model]
     * @return java.lang.String
     * @throws
     */
    public String index(Model model) throws Exception{
        model.addAttribute("welcome", "欢迎");
        model.addAttribute("atext", "待办事项");
        return "index";
    }

}