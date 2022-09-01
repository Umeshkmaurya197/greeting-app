package com.greetingapp.greetingapp.controller;

import com.greetingapp.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class GreetingController {
    @Autowired
    IGreetingService iGreetingService;

    @GetMapping("/greet")
    public String greetingText(){
        return iGreetingService.greetingText();
    }
}
