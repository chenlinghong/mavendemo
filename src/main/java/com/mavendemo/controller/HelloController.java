package com.mavendemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ssmmaven
 * @description:
 * @author: Mr.Chen
 * @create: 2018-03-07 20:12
 **/

@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
