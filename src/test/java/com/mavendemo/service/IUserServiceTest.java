package com.mavendemo.service;

import com.mavendemo.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssmmaven
 * @description:
 * @author: Mr.Chen
 * @create: 2018-03-07 20:48
 **/
public class IUserServiceTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception{
        IUserService userService = (IUserService) applicationContext.getBean("userServiceImpl");
        User user = userService.findUserById(1);
        System.out.println(user.getName());
    }

}
