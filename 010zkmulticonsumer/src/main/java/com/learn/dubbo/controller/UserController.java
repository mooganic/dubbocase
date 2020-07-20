package com.learn.dubbo.controller;

import com.learn.dubbo.model.User;
import com.learn.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author wuminggao
 * @create 2020-07-20-下午7:10
 */
@Controller
public class UserController {

    @Resource
    private UserService userService2;

    @Resource
    private UserService userService;

    @RequestMapping("/userDetail")
    public ModelAndView userDetail(String username, Integer id){
        System.out.println("************************userDetail function*******************");
        ModelAndView modelAndView = new ModelAndView();
        User user1 = userService.queryUserById(id, username);
        User user2 = userService2.queryUserById(id, username);
        modelAndView.addObject("user1", user1);
        modelAndView.addObject("user2", user2);
        modelAndView.setViewName("userDetail");
        return modelAndView;
    }


}
