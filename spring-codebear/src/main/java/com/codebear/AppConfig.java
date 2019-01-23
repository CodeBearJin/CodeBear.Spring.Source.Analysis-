package com.codebear;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

	@Bean
	public OtherService orderService(){
		return new OtherService();
	}

	@Bean
	public Test test(){
		orderService();
		return new Test();
	}
}
