package com.puppycafe.stamp.controller;

import lombok.AllArgsConstructor;
import com.puppycafe.stamp.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.puppycafe.stamp.service.TestService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@AllArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping(value = "/test")
    public List<User> getUserList() {
        return testService.getUserList();
    }
}
