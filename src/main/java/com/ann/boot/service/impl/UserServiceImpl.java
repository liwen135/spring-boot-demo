package com.ann.boot.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ann.boot.entity.User;
import com.ann.boot.repository.dao.UserDao;
import com.ann.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> allUser() {
        return sampleUser(5);
    }


    public User getUserById(Long id) {
        User user = sampleUser(1).get(0);
        user.setId(id);
        return user;
    }


    private List<User> sampleUser(int num) {
        List<User> list = new ArrayList<User>(num);
        for (int i = 0; i < num; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("mame" + i);
            list.add(user);
        }
        return list;
    }


    public void updateUser(Long id, Integer type) {
        // TODO Auto-generated method stub

    }
}
