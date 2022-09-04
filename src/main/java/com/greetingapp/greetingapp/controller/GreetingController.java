package com.greetingapp.greetingapp.controller;

import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/home")
public class GreetingController {
    @Autowired
    IGreetingService iGreetingService;

    //Curl - http://localhost:8080/home/greet
    @GetMapping("/greet")
    public String greetingText() {
        return iGreetingService.greetingText();
    }

    //Curl - http://localhost:8080/home/greetuser
    @GetMapping("/greetuser")
    public String greetingUser(@RequestBody User userdata) {
        return userdata.getFirstName() + " " + userdata.getLastName() + " you are great ";
    }

    //Curl - http://localhost:8080/home/greetandsave
    @GetMapping("/greetandsave")
    public User greetingUserAndSave(@RequestBody User user) {
        return iGreetingService.greetUserAndSaveRepo(user);
    }

    //Curl- http://localhost:8080/home/findbyid/1
    @GetMapping("/findbyid/{id}")
    public Optional<User> greetingFindById(@PathVariable Integer id) {
        return iGreetingService.greetingFindById(id);
    }

    //Curl - http://localhost:8080/home/listallgreetmsg
    @GetMapping("/listallgreetmsg")
    public List<User> greetingMsgList() {
        return iGreetingService.greetingFindAll();
    }

    //Curl -http://localhost:8080/home/editgreeting/
    @PutMapping("/editgreeting/{id}")
    public User editGreeting(@RequestBody User user,@PathVariable Integer id){
        return iGreetingService.editGreetingService(user,id);
    }

}
