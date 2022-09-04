package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {

    String greetingText();

    User greetUserAndSaveRepo(User user);

    Optional<User> greetingFindById(Integer id);

    List<User> greetingFindAll();

    User editGreetingService(User user,Integer id);
}
