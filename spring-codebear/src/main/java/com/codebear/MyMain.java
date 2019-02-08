package com.codebear;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
