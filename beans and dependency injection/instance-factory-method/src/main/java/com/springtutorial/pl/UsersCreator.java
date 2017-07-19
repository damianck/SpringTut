package com.springtutorial.pl;

import java.util.logging.Logger;

public class UsersCreator {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public User createUser(String name) {
		logger.info("Creating user " + name);
		User user = new User();
		user.setName(name);
		return user;
	}
}
