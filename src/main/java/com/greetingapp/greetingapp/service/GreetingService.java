package com.greetingapp.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{
    @Override
    public String greetingText() {
        return "Hello World";
    }
}
