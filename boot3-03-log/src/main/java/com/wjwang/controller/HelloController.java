package com.wjwang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-07-01 23:59
 */
@Slf4j
@RestController
public class HelloController {
	@GetMapping("/h")
	public String hello(String a, String b) {
		log.info("a:{},b:{}", a, b);
		return "hello";
	}
}
