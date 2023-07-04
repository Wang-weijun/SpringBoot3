package com.wjang;

import com.wjang.bean.Sheep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot302Application {
	
	public static void main(String[] args) {
		var ioc = SpringApplication.run(Boot302Application.class, args);
		
//		for (String s : ioc.getBeanNamesForType(Cat.class)) {
//			System.out.println("Cat: " + s);
//		}
//
//		for (String s : ioc.getBeanNamesForType(Dog.class)) {
//			System.out.println("Dog: " + s);
//		}
//
//		for (String s : ioc.getBeanNamesForType(User.class)) {
//			System.out.println("User: " + s);
//		}
		
		Sheep sheep = ioc.getBean(Sheep.class);
		System.out.println(sheep);
		
		
	}
}
