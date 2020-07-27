package com.test.hplus.controllers;

import com.test.hplus.Repository.UserRepository;
import com.test.hplus.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/registeruser")
            public String registerUser(@Valid @ModelAttribute("newuser")User user, BindingResult result, Model model) {
        System.out.println("In Registration controller");

        if (result.hasErrors()){
            return "register";
        }
        userRepository.save(user);
        model.addAttribute("dataSaved", "User Registered Successfully");
        return "login";
    }
}
