package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @PostMapping("/registration")
            public String registerUser() {
        System.out.println("In Registration controller");
        return "login";
    }
}
