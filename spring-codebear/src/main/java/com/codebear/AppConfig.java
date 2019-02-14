package com.codebear;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan
public class AppConfig {
	@Bean
	public Student student(){
		return new Student();
	}
}
