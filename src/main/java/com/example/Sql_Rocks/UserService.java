package com.example.Sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepositoryy userRepositoryy;

    public String addUser(User user) {
        userRepositoryy.save(user);
        return "User added successfully";
    }

    public User getUser(int id) {
        return userRepositoryy.findById(id).get();
    }
    public List<User> getAllUser() {
        return userRepositoryy.findAll();
    }
}