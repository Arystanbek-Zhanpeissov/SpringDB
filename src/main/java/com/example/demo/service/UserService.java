package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UserService{
    Iterable<User> getAllUser();
    User addUser(User user);
    User findByUsername(String username);
}
