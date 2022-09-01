package com.greetingapp.greetingapp.service;

import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingService {

    public String greetingText();
}
