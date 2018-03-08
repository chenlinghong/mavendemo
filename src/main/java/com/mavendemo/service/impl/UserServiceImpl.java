package com.mavendemo.service.impl;

import com.mavendemo.dao.IUserDao;
import com.mavendemo.entity.User;
import com.mavendemo.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: ssmmaven
 * @description:
 * @author: Mr.Chen
 * @create: 2018-03-07 20:45
 **/

@Service(value = "userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Resource
    private ApplicationContext applicationContext;

    public UserServiceImpl(){

    }

    public User findUserById(int id) throws Exception {
        IUserDao userDao = (IUserDao) applicationContext.getBean("userMapper");
        User user = userDao.findUserById(id);
        return user;
    }

}
