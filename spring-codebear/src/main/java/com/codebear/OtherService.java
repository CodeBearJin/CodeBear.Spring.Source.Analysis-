package com.codebear;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherService {
	@Autowired
	MyService myService111;
}
