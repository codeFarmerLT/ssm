package com.lt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lt.entity.User;
import com.lt.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    @RequestMapping(value = "/login")
    public String toLoginView(Model model){
        User user = userService.userLogin(1);
        model.addAttribute("user",user);
        return "login";
    }
}
