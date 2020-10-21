package com.isle.komodo.controller;

import com.isle.komodo.common.CommonResult;
import com.isle.komodo.domain.User;
import com.isle.komodo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "admin/login",method = RequestMethod.POST)
    public CommonResult userLogin(@RequestBody User user) {
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456"))
            return CommonResult.success("admin");
        else
            return CommonResult.validateFailed();
    }

    @RequestMapping(value = "getUserList",method = RequestMethod.POST)
    public List<User> getUserList() {
        return userService.getUserList();
    }
}
