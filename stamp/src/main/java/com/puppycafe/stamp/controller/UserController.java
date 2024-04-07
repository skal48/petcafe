package com.puppycafe.stamp.controller;

import com.puppycafe.stamp.dto.ResponseDto;
import com.puppycafe.stamp.dto.SignUpDto;
import com.puppycafe.stamp.entity.User;
import com.puppycafe.stamp.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class UserController {
    @PostMapping("/signUp")
    public ResponseDto<SignUpDto> signUp(@RequestBody SignUpDto requestBody){
        System.out.println(requestBody.toString());
        return null;
    }
}

