package com.springtutorial.pl.implementation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springtutorial.pl.api.Logger;
import com.springtutorial.pl.api.UsersRepository;
import com.springtutorial.pl.domain.User;

@Service
public class UsersRepositoryImpl implements UsersRepository {
	@Resource(name="counterLogger")
	private Logger logger;

	public User createUser(String name) {
		logger.log("Creating user " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
