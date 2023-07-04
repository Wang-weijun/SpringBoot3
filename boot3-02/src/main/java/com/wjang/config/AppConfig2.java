package com.wjang.config;

import com.wjang.bean.Cat;
import com.wjang.bean.Dog;
import com.wjang.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-06-29 17:16
 */
@SpringBootConfiguration
public class AppConfig2 {
	@ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
	@Bean
	public Cat cat01() {
		return new Cat();
	}
	@ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
	@Bean
	public Dog dog01() {
		return new Dog();
	}
	
	@ConditionalOnBean(value = Dog.class)
	@Bean
	public User zhangsan() {
		return new User();
	}
	
	@ConditionalOnMissingBean(value = Dog.class)
	@Bean
	public User lisi() {
		return new User();
	}
}
