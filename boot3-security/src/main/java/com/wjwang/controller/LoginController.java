package com.wjwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-07-04 9:52
 */
@Controller
public class LoginController {
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
}
