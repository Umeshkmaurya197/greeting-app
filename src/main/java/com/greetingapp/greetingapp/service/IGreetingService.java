package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.User;

import java.util.Optional;

public interface IGreetingService {

    public String greetingText();

    public User greetUserAndSaveRepo(User user);
    public Optional<User> greetingfindById(int id);
}
