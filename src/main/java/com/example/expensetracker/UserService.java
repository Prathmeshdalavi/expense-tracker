package com.example.expensetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired

    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User findByUsername(String name) {
        return userRepository.findByUsername(name);

    }

}
