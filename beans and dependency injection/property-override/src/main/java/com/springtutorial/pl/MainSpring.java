package com.springtutorial.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		DatabaseRepository bean = context.getBean("db", DatabaseRepository.class);
		System.out.println(bean.toString());
	}

}
