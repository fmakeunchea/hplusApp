package com.test.hplus.controllers;

import com.test.hplus.Repository.UserRepository;
import com.test.hplus.beans.Login;
import com.test.hplus.beans.User;
import com.test.hplus.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login")Login login){
        User user = userRepository.searchByName(login.getUsername());
        if (user ==null){
            throw new ApplicationException("User not found");        }
        return "search";
    }
    /*
    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("In exception handler of login controller");
        return "error";
    }*/
}
