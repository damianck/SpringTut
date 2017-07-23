package com.springtutorial.pl.implementation;

import com.springtutorial.pl.api.Logger;
import com.springtutorial.pl.api.UsersRepository;
import com.springtutorial.pl.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;

	public User createUser(String name) {
		if (logger != null) {
			logger.log("Creating user " + name);
			return new User(name);
		} else {
			return new User(name);
		}
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
