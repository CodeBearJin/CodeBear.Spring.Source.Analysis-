package com.codebear;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class MyService {
	public MyService(){
		System.out.println("MyService");
	}
}
