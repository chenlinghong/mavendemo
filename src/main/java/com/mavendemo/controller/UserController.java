package com.mavendemo.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mavendemo.entity.User;
import com.mavendemo.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: ssmmaven
 * @description:
 * @author: Mr.Chen
 * @create: 2018-03-07 20:51
 **/

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private ApplicationContext applicationContext;

    public UserController() {

    }

    @RequestMapping(value = "/get", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String getUserById(@RequestParam int id) throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        IUserService userService = (IUserService) applicationContext.getBean("userServiceImpl");

        User user = userService.findUserById(id);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();        //格式化（仅用于开发阶段）
        Gson gson = gsonBuilder.create();


        String jsonObject = gson.toJson(user);
        return jsonObject;
    }
}
