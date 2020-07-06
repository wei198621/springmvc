package com.tz.leo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: tz_wl
 * Date: 2020/7/5 18:57
 * Content:
 */
@Controller
@RequestMapping("forwardAndRedirect")
public class ForwardAndRedirectController {

    /**
     * 测试forward跳转到页面
     * 默认: controller跳转到jsp页面就是forward跳转
     * @return
     */
    @RequestMapping("forward2PageIndex")
    public String forward2PageIndex(){
        System.out.println("forward2Index");
        return "index";
    }

    /**
     * 测试redirect跳转页面
     * redirect跳转到页面:  使用springmvc提供关键字 redirect:
     * 使用语法: return "redirect:/index.jsp"   return "redirect:视图全名"
     * 注意:redirect跳转不会经过视图解析器
     * @return
     *
     */
    @RequestMapping("redirect2PageIndex")
    public String redirect2PageIndex(){
        System.out.println("redicect2PageIndex");
        return "redirect:/index.jsp";   //redirect不走视图解析器，所以 前缀/  后缀.jsp 需要自己写
    }



    @RequestMapping("forward2Controller")
    public String forward2Controller(){

        System.out.println("forward2Controller");
        return "forward:/forwardAndRedirect/forward2PageIndex";

    }

    @RequestMapping("redirect2Controller")
    public String redirect2Controller(){
        System.out.println("redirect2Controller");
        return "redirect:/forwardAndRedirect/forward2PageIndex";
    }


    @RequestMapping("redirect2OtherController")
    public String redirect2OtherController(){
        System.out.println("redirect2OtherController");
        return "redirect:/hello/hello";
    }

}
