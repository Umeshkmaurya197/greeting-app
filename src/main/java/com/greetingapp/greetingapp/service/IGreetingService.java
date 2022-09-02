package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingService {

    public String greetingText();


}
