package com.wjwang.config;

import com.wjwang.componment.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-07-02 20:48
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 保留以前
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		// 自定义
		registry.addResourceHandler("/static/**").addResourceLocations("classpath://a/")
				.setCacheControl(CacheControl.maxAge(7200, TimeUnit.SECONDS));
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new MyYamlHttpMessageConverter());
	}
}
