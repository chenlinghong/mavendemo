package com.mavendemo.dao;

import com.mavendemo.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: ssmmaven
 * @description:
 * @author: Mr.Chen
 * @create: 2018-03-07 19:32
 **/

@Transactional
public interface IUserDao {

    public User findUserById(int id) throws Exception;

}
