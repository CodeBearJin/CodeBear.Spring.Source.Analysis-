package com.codebear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {
	@RequestMapping("/sayHello")
	@ResponseBody
	public Map<String, String> sayHello() {
		Map<String, String> map = new HashMap<>();
		map.put("111", "2222");
		return map;
	}

	@RequestMapping("/showHello")
	public String showHello() {
		return "Hello";
	}
}
