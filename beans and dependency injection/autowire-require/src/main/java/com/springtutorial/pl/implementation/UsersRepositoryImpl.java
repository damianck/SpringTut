package com.springtutorial.pl.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtutorial.pl.api.Logger;
import com.springtutorial.pl.api.UsersRepository;
import com.springtutorial.pl.domain.User;

@Service
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired(required = false)
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
