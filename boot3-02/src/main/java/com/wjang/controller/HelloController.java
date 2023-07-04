package com.wjang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-06-29 15:52
 */
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
