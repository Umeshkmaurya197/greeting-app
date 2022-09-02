package com.greetingapp.greetingapp.controller;

import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/home")
public class GreetingController {
    @Autowired
    IGreetingService iGreetingService;

    @GetMapping("/greet")
    public String greetingText() {
        return iGreetingService.greetingText();
    }

    @GetMapping("/greetuser")
    public String greetingUser(@RequestBody User userdata) {
        return  userdata.getFirstname()+" "+userdata.getLastname() +" you are great ";
    }

}
