package com.learn.dubbo.controller;

import com.learn.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuminggao
 * @create 2020-07-20-下午4:45
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userDetail")
    public ModelAndView userDetail(Integer id, String username){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.addObject("username", username);
        modelAndView.setViewName("userDetail");
        return modelAndView;
    }
}
