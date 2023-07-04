package com.wjwang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-07-04 9:34
 */
@EnableMethodSecurity
@Configuration
public class AppSecurityConfiguration {
	@Bean
	SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
		// 请求授权
		http.authorizeHttpRequests(registry -> {
			registry.requestMatchers("/").permitAll() // 首页所有人都能访问
					.anyRequest().authenticated(); // 剩下的任意请求都需要 认证（登录）
			
		});
		// 表单登录
		http.formLogin(formLogin -> {
			formLogin.loginPage("/login").permitAll(); // 自定页登录页配置
		});
		return http.build();
	}
	@Bean
	UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		UserDetails zhangsan = User.withUsername("zhangsan")
				.roles("admin", "hr")
				.authorities("file_read", "file_write")
				.password(passwordEncoder.encode("123456"))
				.build();
		UserDetails lisi = User.withUsername("lisi")
				.roles("hr")
				.authorities("file_read")
				.password(passwordEncoder.encode("123456"))
				.build();
		UserDetails wangwu = User.withUsername("wangwu")
				.roles("admin")
				.authorities("file_write")
				.password(passwordEncoder.encode("123456"))
				.build();
		return new InMemoryUserDetailsManager(zhangsan, lisi, wangwu);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
