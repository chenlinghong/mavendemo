package com.mavendemo.dao;

import com.mavendemo.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssmmaven
 * @description:
 * @author: Mr.Chen
 * @create: 2018-03-07 19:37
 **/
public class IUserDaoTest {

//    private ApplicationContext applicationContext;

    @Before
    public void setUp(){
//        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        IUserDao userDao = (IUserDao) applicationContext.getBean("userMapper");
        User user = userDao.findUserById(1);
        System.out.println(user.getName());
    }
}
