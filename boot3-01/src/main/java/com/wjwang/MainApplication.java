package com.wjwang;

import com.wjwang.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: wjwang
 * @description: 启动springboot项目的主入口
 * @date: 2023-06-29 14:34
 */
@SpringBootApplication // 这是一个SpringBoot应用
public class MainApplication {
	public static void main(String[] args) {
		var ioc = SpringApplication.run(MainApplication.class, args);
		Person person = ioc.getBean(Person.class);
		System.out.println(person);
	}
}