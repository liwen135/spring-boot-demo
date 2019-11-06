package com.ann.boot.service;

import com.ann.boot.entity.User;

import java.util.List;

public interface UserService {

    List<User> allUser();

    User getUserById(Long id);

    void updateUser(Long id, Integer type);

    boolean updateUser(User user);

    Integer getCredit(int i);

}
