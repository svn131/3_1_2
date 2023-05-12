package com.example.kata312.repository;

import com.example.kata312.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User,Long> {
    List<User> findByLastName (String lastName);
    User save(User user);
}
