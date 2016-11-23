package com.core.service;

import com.core.entity.User;

import java.util.List;

/**
 * Created by yonghuo.chen on 16/10/7.
 */
public interface UserService {
/*    public String add(User user);
    public String addUser(String account);
    public User getOneUser(Long id);*/

    public List<User> findByUsername(String userName);
    public List<User> findAll();
    public  User findOneByUsername(String username);
}
