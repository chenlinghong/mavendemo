package com.mavendemo.service;

import com.mavendemo.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: ssmmaven
 * @description:
 * @author: Mr.Chen
 * @create: 2018-03-07 20:44
 **/

@Transactional
public interface IUserService {

    public User findUserById(int id) throws Exception;

}
