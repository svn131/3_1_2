package com.example.kata312.service;

import com.example.kata312.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(Long id);

}
