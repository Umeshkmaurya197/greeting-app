package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{


    @Autowired
    UserRepository repository;

    @Override
    public String greetingText() {
        return "Hello World";
    }

    @Override
    public User greetUserAndSaveRepo(User user) {

        return repository.save(user);
    }




}
