package com.wjwang.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-06-30 16:12
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {
	private String name;
	private Integer age;
	private Child child; // 嵌套对象
	private List<Dog> dogs; // 数组
	private Map<String, Cat> cats; // 表示Map
}
