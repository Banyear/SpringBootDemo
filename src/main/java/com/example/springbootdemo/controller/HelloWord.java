package com.example.springbootdemo.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWord {

    @RequestMapping("/word")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username, String password) {
        if ("admin".equals(username)) {
            StpUtil.login("admin");
            System.out.println("登录成功");
        }
        return "hello";
    }
}
