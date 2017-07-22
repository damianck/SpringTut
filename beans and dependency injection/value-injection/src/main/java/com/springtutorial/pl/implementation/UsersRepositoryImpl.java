package com.springtutorial.pl.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.springtutorial.pl.api.Logger;
import com.springtutorial.pl.api.UsersRepository;
import com.springtutorial.pl.domain.User;

@Service
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired(required = false)
	private Logger logger;

	@Value("${db.host}")
	private String host;
	@Value("${db.port}")
	private int port;
	@Value("${db.name}")
	private String database;

	public User createUser(String name) {
		if (logger != null) {
			logger.log("Creating user " + name + "\n" + database + "/" + host + ":" + port);
			return new User(name);
		} else {
			return new User(name);
		}

	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
