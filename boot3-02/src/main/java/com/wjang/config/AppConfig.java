package com.wjang.config;

import com.wjang.bean.Sheep;
import com.wjang.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-06-29 16:32
 */
@Configuration // 这是一个配置类
@EnableConfigurationProperties(Sheep.class)
public class AppConfig {

	/*
	* 组件默认是单实例
	*/
	@Bean("user01") // 组件在容器中的名字默认是方法名，可以直接用@Bean("user")指定
	@Scope("prototype") // 指定组件的作用域
	public User user() {
		User user = new User();
		user.setId(1L);
		user.setName("wjwang");
		return user;
	}
}
