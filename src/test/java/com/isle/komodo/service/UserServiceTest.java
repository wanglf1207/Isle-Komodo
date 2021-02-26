package com.isle.komodo.service;

import com.isle.komodo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserId(new BigInteger("123"));
        user.setAccountNo("wanglf1207");
        user.setUsername("王皓");
        user.setPassword("123456");
        userService.addUser(user);
    }

    @Test
    public void userLogin() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        User u = userService.login(user);
        System.out.println("sssss" + u.getUsername());
    }
}