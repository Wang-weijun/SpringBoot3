package com.wjwang.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-07-02 21:37
 */
@JacksonXmlRootElement // 可以写出为xml
@Data
public class Person {
	private Long id;
	private String userName;
	private String email;
	private Integer age;
}
