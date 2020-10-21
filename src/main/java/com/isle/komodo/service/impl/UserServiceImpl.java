package com.isle.komodo.service.impl;

import com.isle.komodo.dao.UserRepository;
import com.isle.komodo.domain.User;
import com.isle.komodo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User login(User user) {
        return userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }
}
