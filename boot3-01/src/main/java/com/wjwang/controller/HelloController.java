package com.wjwang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-06-29 14:57
 */
@RestController // @RestController = @Controller + @ResponseBody
public class HelloController {
	
	@GetMapping("/hello")
	public String Hello(){
		return "Hello, Spring Boot3!";
	}
	
	@Autowired
	StringRedisTemplate redisTemplate;
	
	@GetMapping("/incr")
	public String incr() {
		Long haha = redisTemplate.opsForValue().increment("haha");
		return "增加后的值：" + haha;
	}
}
