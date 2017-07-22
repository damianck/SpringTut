package com.springtutorial.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtutorial.pl.api.UsersRepository;
import com.springtutorial.pl.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		UsersRepository bean = context.getBean("usersRepositoryImpl", UsersRepository.class);
	
		User user = bean.createUser("John");
		System.out.println("User " + user.getName() + " created.");
	}

}
