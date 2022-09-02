package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{
    @Override
    public String greetingText() {
        return "Hello World";
    }




}
