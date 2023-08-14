package pl.pedyk.userrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pedyk.userrest.model.UserItem;
import pl.pedyk.userrest.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserItem> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public UserItem createUser(@RequestBody UserItem user) {
        return userRepository.save(user);
    }

}

