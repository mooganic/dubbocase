package com.wkcto.dubbo.controller;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuminggao
 * @create 2020-07-20-下午1:26
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public ModelAndView userDetail(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.queryUserById(id);
        modelAndView.addObject("user", user);
        modelAndView.addObject("count", userService.queryAllUserCount());
        modelAndView.setViewName("userDetail");

        return modelAndView;

    }
}
