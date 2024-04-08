package com.puppycafe.stamp.controller;

import com.puppycafe.stamp.dto.ResponseDto;
import com.puppycafe.stamp.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class UserController {
    @PostMapping("/signUp")
    public ResponseDto<UserDto> signUp(@RequestBody UserDto requestBody){
        System.out.println(requestBody.toString());
        return null;
    }
}

