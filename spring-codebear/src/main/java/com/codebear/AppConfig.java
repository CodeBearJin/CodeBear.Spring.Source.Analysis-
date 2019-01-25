package com.codebear;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@Import(MyImport.class)
public class AppConfig {

	@Bean
	public MyService myService() {
		return new MyService();
	}

	@Bean
	public OtherService otherService() {
		return new OtherService();
	}
}
