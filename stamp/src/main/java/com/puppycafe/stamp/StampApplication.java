package com.puppycafe.stamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController 
public class StampApplication {

	public static void main(String[] args) {
		SpringApplication.run(StampApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "StampApplication";
	}
	@GetMapping("/showMe")
	public List<String> hello() {
		return Arrays.asList("첫번째","두번째");
	}
}
