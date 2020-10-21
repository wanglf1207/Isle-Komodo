package com.isle.komodo.service;

import com.isle.komodo.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    User addUser(User user);
    User login(User user);
}
