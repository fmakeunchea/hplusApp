package com.test.hplus.controllers;

import com.test.hplus.Repository.UserRepository;
import com.test.hplus.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/registeruser")
            public String registerUser(@ModelAttribute("newuser")User user, Model model) {
        System.out.println("In Registration controller");
        userRepository.save(user);
        model.addAttribute("dataSaved", "User Registered Successfully");
        return "login";
    }
}
