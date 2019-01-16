package com.codebear;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.codebear","com.other"})
public class AppConfig {
}
