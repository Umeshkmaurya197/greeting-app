package com.greetingapp.greetingapp.controller;

import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/home")
public class GreetingController {
    @Autowired
    IGreetingService iGreetingService;

    //curl - http://localhost:8080/home/greet
    @GetMapping("/greet")
    public String greetingText() {
        return iGreetingService.greetingText();
    }

    //curl - http://localhost:8080/home/greetuser
    @GetMapping("/greetuser")
    public String greetingUser(@RequestBody User userdata) {
        return  userdata.getFirstname()+" "+userdata.getLastname() +" you are great ";
    }
    //curl - http://localhost:8080/home/greetandsave
    @GetMapping("/greetandsave")
    public User greetingUserAndSave(@RequestBody User user){
        return iGreetingService.greetUserAndSaveRepo(user);
    }

    //curl- http://localhost:8080/home/findbyid/1
    @GetMapping("/findbyid/{id}")
    public Optional<User> greetingFindById(@PathVariable int id){
        return iGreetingService.greetingfindById(id);
    }

}
