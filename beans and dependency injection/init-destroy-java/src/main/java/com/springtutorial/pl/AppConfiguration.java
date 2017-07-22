package com.springtutorial.pl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springtutorial.pl")
public class AppConfiguration {

	@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	public SomeBean someBean() {
		return new SomeBean();
	}
}
