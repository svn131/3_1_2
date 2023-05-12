package com.example.kata312.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(name = "first_name")
    private String firstName;
@Column(name = "last_name")
private String lastName;

    public User( String firstName, String last_name) {
        this.firstName=firstName;
        this.lastName=last_name;
    }

    public User() {

    }
}
