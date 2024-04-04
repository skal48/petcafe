package com.puppycafe.stamp.controller;

import com.puppycafe.stamp.entity.User;
import com.puppycafe.stamp.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
public class UserController {
    private final TestService testService;

    @GetMapping(value = "/user/login")
    public List<User> getUserList() {
        return testService.getUserList();
    }
}
