package com.puppycafe.stamp.service;

import com.puppycafe.stamp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
  @Autowired
  UserRepository userRepository;

}
