package com.wjwang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.wjwang.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-07-02 17:57
 */
@Slf4j
@RestController
public class HelloController {
	/**
	 * 1. 默认导入json
	 * 2. jsckson也支持
	 * @return
	 */
	@GetMapping("/person")
	public Person person() {
		Person person = new Person();
		person.setId(1L);
		person.setUserName("张三");
		person.setEmail("zhangsan@qq.com");
		person.setAge(18);
		return person;
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		Person person = new Person();
		person.setId(1L);
		person.setUserName("张三");
		person.setEmail("zhangsan@qq.com");
		person.setAge(18);
		
		YAMLFactory disable = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
		ObjectMapper mapper = new ObjectMapper(disable);
		String s = mapper.writeValueAsString(person);
		System.out.println(s);
		
	}
}
