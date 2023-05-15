package com.example.kata312.init;


import com.example.kata312.model.User;
import com.example.kata312.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Initilization {
    private UserRepository userRepository;

    @Autowired
    public Initilization(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostConstruct
    public void create() {
        User user1 = new User("FerstName1", "LastName1");
        User user2 = new User("FerstName2", "LastName2");
        userRepository.save(user1);
        userRepository.save(user2);
    }
}