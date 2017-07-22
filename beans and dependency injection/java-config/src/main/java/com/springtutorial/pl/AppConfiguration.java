package com.springtutorial.pl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springtutorial.pl.api.Logger;
import com.springtutorial.pl.api.UsersRepository;
import com.springtutorial.pl.implementation.DateLogger;
import com.springtutorial.pl.implementation.UsersRepositoryImpl;

@Configuration
public class AppConfiguration {
	@Bean
	public Logger logger() {
		return new DateLogger();
	}

	@Bean
	public UsersRepository usersRepository() {
		UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger());
		return usersRepository;
	}
}
