package com.springtutorial.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtutorial.pl.api.UsersRepository;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		UsersRepository bean = context.getBean("usersRepository", UsersRepository.class);

		bean.createUser("John");

	}

}
