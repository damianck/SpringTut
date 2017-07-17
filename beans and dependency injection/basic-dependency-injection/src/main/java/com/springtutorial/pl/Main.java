package com.springtutorial.pl;

import com.springtutorial.pl.api.UsersRepository;
import com.springtutorial.pl.domain.User;
import com.springtutorial.pl.implementation.LoggerImpl;
import com.springtutorial.pl.implementation.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		LoggerImpl logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		User user = usersRepository.createUser("John");
		
		
	}

}
