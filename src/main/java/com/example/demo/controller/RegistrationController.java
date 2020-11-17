package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
//import com.example.demo.service.serviceImpl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public String showPage(Model model){
        return "main";
    }
    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }
    @PostMapping("/registration")
    public String addUser(@ModelAttribute("user") User user, Model model) {
        User userFromDB = userRepository.findByUsername(user.getUsername());
        userService.addUser(user);

        return "main";
    }

}
