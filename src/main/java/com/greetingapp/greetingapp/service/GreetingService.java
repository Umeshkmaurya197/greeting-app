package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.dto.GreetingMsg;
import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService implements IGreetingService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String greetingText() {
        return "Hello World";
    }

    @Override
    public User greetUserAndSaveRepo(User user) {

        String msg = "Hello " + user.getFirstName() + " " + user.getLastName();
        user.setMessage(msg);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> greetingFindById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> greetingFindAll() {
        return userRepository.findAll();
    }

    @Override
    public User editGreetingService(User user,Integer id) {
        user.setId(id);
        return userRepository.save(user);
    }
  public User addGreeting(GreetingMsg greetingMsg){
        String msg ="hello"+greetingMsg.getFirstName()+""+greetingMsg.getLastName();
        greetingMsg.setMessage(msg);
        User user= new User(greetingMsg);
        return userRepository.save(user);

  }



}
