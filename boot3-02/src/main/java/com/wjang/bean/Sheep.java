package com.wjang.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-06-29 17:52
 */
@ConfigurationProperties(prefix = "sheep")
public class Sheep {
	private Long id;
	private String name;
	private Integer age;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Sheep{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
