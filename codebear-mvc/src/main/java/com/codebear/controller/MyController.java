package com.codebear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/sayHello")
	public void sayHello() {
		System.out.println("sayHello");
	}
}
