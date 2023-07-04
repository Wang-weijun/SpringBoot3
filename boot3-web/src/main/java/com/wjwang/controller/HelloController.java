package com.wjwang.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wjwang
 * @description:
 * @date: 2023-07-02 23:04
 */
@RestController // 适配 服务端渲染
public class HelloController {
	@GetMapping("/well")
	public String hello(@RequestParam("name") String name, Model model) {
		// 模板的逻辑视图
		// 物理视图 = 前缀 + 逻辑视图名 + 后缀
		// 真实地址：classpath:/templates/welcome.html
		model.addAttribute("msg", name);
		return "welcome";
	}
	
	@GetMapping("/")
	public String index(@RequestParam("url") String url, Model model) {
		model.addAttribute("url", url);
		return "index";
	}
	
	@GetMapping("/home")
	public String home() {
		return "进入";
	}
}
