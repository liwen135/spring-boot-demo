package com.ann.boot.db;

import com.ann.boot.entity.User;
import com.ann.boot.repository.dao.UserDao;
import com.ann.boot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class UserDbTest {

    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;

    @Test
    public void upateNameTest() {

        User user = new User();
        user.setId(1L);
        user.setName("hello123");
//        boolean success = userService.updateUser(user);
//        User dbUser = userDao.unique(1);
//        assertEquals(dbUser.getName(), "hello123");

    }


}
