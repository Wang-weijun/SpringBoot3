package com.wjwang.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-07-04 9:47
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String Hello() {
		return "Hello!";
	}
	
	@PreAuthorize("hasRole()")
	@GetMapping("/world")
	public String World() {
		return "Hello!";
	}
}
