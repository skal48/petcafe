package com.puppycafe.stamp.service;

import com.puppycafe.stamp.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.puppycafe.stamp.repository.TestRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class TestService {
    private TestRepository testRepository;

    public List<User> getUserList(){
        return testRepository.findAll();
    }
}
