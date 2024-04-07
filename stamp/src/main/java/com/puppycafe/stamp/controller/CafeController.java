package com.puppycafe.stamp.controller;

import com.puppycafe.stamp.entity.Cafe;
import com.puppycafe.stamp.entity.User;
import com.puppycafe.stamp.service.CafeService;
import com.puppycafe.stamp.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CafeController {
    @Autowired
    CafeService cafeService;

    @GetMapping(value = "/cafe/list")
    @ResponseBody
    public List<Cafe> findAll() {
        System.out.println("cafeService.findAll() = " + cafeService.findAll());
        return cafeService.findAll();
    }
}
