package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @GetMapping("/home")
   public String goHome(){
       System.out.println("In Home Controller");
       return "index";
   }
}
