package com.core.service;

import com.core.dao.UserRepository;
import com.core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yonghuo.chen on 16/10/7.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

        @Autowired
        private UserRepository userRepository;

      /*  public String add(User user){
            userRepository.save(user);
            return "添加成功！";
        }

        public String addUser(String account){
            User user = new User();
            user.setName(account);
            userRepository.save(user);
            return "添加成功！";
        }

        public User getOneUser(Long id){
            return userRepository.findOne(id);
        }*/

    @Override
    public List<User> findByUsername(String userName) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findOneByUsername(String username) {
        User user= userRepository.getByUsername(username);
        System.out.print("serviceImpl mobile="+user.getMobile());
        return user;
    }
}
