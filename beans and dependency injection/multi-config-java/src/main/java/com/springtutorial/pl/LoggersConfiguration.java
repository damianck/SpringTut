package com.springtutorial.pl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springtutorial.pl.api.Logger;
import com.springtutorial.pl.implementation.DateLogger;

@Configuration
public class LoggersConfiguration {
	@Bean
	public Logger logger() {
		return new DateLogger();
	}
}
