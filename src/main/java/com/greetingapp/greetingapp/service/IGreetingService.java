package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.User;
import org.springframework.stereotype.Repository;

public interface IGreetingService {

    public String greetingText();

    public User greetUserAndSaveRepo(User user);


}
