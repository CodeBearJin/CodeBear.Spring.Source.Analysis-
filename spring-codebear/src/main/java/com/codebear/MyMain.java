package com.codebear;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

		String name = annotationConfigApplicationContext.getBean(MyService.class).getClass().getName();
		System.out.println(name);

	}
}
